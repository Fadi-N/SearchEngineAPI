package com.example.restservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;


@Controller
public class RestServiceApplicationController {
    @GetMapping(path = "/")
    public String getSearchPage(){
        return "search";
    }

    String NIP_API_URL = "https://wl-api.mf.gov.pl/api/search/nips/";

    @RequestMapping(value = "/nip", method = RequestMethod.GET)
    public @ResponseBody ModelAndView getEntityByNip(@RequestParam("nip") String nipNumber, @RequestParam("nipdate") String nipDate) throws IOException, InterruptedException, JSONException {

        System.out.println("coming in controller    " + nipNumber +" :D ");

        String url = NIP_API_URL + nipNumber + "?date=" + nipDate;
        System.out.println("URL TO : " + url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject jsonObject = new JSONObject(response.body());
        ObjectMapper mapper = new ObjectMapper();

        ArrayList<Entity> entityList = new ArrayList<Entity>();

        JSONArray entries = jsonObject.getJSONObject("result").getJSONArray("entries");
        for (int i=0; i<entries.length(); i++){
            JSONArray subjects = entries.getJSONObject(i).getJSONArray("subjects");
            for (int j=0; j<subjects.length(); j++){
                entityList.add(mapper.readValue(subjects.get(j).toString(), new TypeReference<Entity>(){}));
            }
        }

        ModelAndView modelAndView = new ModelAndView("entityList");
        modelAndView.addObject("entityList", entityList);

        return modelAndView;
    }


    String REGON_API_URL = "https://wl-api.mf.gov.pl/api/search/regon/";
    @RequestMapping(value = "/regon", method = RequestMethod.GET)
    public ModelAndView getEntityByRegon(@RequestParam("regon") String regonNumber, @RequestParam("regondate") String regonDate) throws IOException, InterruptedException, JSONException {
        System.out.println("coming in controller    " + regonNumber +" :D ");

        String url = REGON_API_URL + regonNumber + "?date=" + regonDate;
        System.out.println("URL TO : " + url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject jsonObject = new JSONObject(response.body());
        ObjectMapper mapper = new ObjectMapper();

        Entity entity = mapper.readValue(jsonObject.getJSONObject("result").getJSONObject("subject").toString(), new TypeReference<Entity>(){});

        ModelAndView modelAndView = new ModelAndView("entity");
        modelAndView.addObject("entity", entity);

        return modelAndView;
    }
}
