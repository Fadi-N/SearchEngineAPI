package com.example.restservice;

import java.util.ArrayList;
import java.util.Date;

public class Entity {
    private ArrayList<Object> authorizedClerks; //"authorizedClerks" : [ ],
    private String regon;                       //        "regon" : "regon",
    private Date restorationDate;               //        "restorationDate" : "2019-02-21",
    private String workingAddress;              //        "workingAddress" : "ul/ Prosta 49 00-838 Warszawa",
    private boolean hasVirtualAccounts;         //        "hasVirtualAccounts" : true,
    private String statusVat;                   //        "statusVat" : "Zwolniony",
    private String krs;                         //       "krs" : "0000636771",
    private String restorationBasis;            //        "restorationBasis" : "Ustawa o podatku od towarów i usług art. 96",
    private ArrayList<String> accountNumbers;   //        "accountNumbers" : [ "90249000050247256316596736", "90249000050247256316596736" ],
    private String registrationDenialBasis;     //        "registrationDenialBasis" : "Ustawa o podatku od towarów i usług art. 96",
    private String nip;                         //        "nip" : "1111111111",
    private Date removalDate;                   //        "removalDate" : "2019-02-21",
    private ArrayList<Object> partners;         //        "partners" : [ ],
    private String name;                        //        "name" : "ABC Jan Nowak",
    private Date registrationLegalDate;         //        "registrationLegalDate" : "2018-02-21",
    private String removalBasis;                //        "removalBasis" : "Ustawa o podatku od towarów i usług Art. 97",
    private String pesel;                       //        "pesel" : "22222222222",
    private ArrayList<Object> representatives;  //        "representatives" : [ {
                                                //    "firstName" : "Jan",
                                                //            "lastName" : "Nowak",
                                                //            "nip" : "1111111111",
                                                //            "companyName" : "Nazwa firmy"
                                                //}, {
                                                //    "firstName" : "Jan",
                                                //            "lastName" : "Nowak",
                                                //            "nip" : "1111111111",
                                                //            "companyName" : "Nazwa firmy"
                                                //} ],
    private String residenceAddress;            //        "residenceAddress" : "ul/ Chmielna 85/87 00-805 Warszawa",
    private Date registrationDenialDate;        //        "registrationDenialDate" : "2019-02-21"

    public Entity(){

    }

    public ArrayList<Object> getAuthorizedClerks() {
        return authorizedClerks;
    }

    public void setAuthorizedClerks(ArrayList<Object> authorizedClerks) {
        this.authorizedClerks = authorizedClerks;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public Date getRestorationDate() {
        return restorationDate;
    }

    public void setRestorationDate(Date restorationDate) {
        this.restorationDate = restorationDate;
    }

    public String getWorkingAddress() {
        return workingAddress;
    }

    public void setWorkingAddress(String workingAddress) {
        this.workingAddress = workingAddress;
    }

    public boolean isHasVirtualAccounts() {
        return hasVirtualAccounts;
    }

    public void setHasVirtualAccounts(boolean hasVirtualAccounts) {
        this.hasVirtualAccounts = hasVirtualAccounts;
    }

    public String getStatusVat() {
        return statusVat;
    }

    public void setStatusVat(String statusVat) {
        this.statusVat = statusVat;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getRestorationBasis() {
        return restorationBasis;
    }

    public void setRestorationBasis(String restorationBasis) {
        this.restorationBasis = restorationBasis;
    }

    public ArrayList<String> getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(ArrayList<String> accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getRegistrationDenialBasis() {
        return registrationDenialBasis;
    }

    public void setRegistrationDenialBasis(String registrationDenialBasis) {
        this.registrationDenialBasis = registrationDenialBasis;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Date getRemovalDate() {
        return removalDate;
    }

    public void setRemovalDate(Date removalDate) {
        this.removalDate = removalDate;
    }

    public ArrayList<Object> getPartners() {
        return partners;
    }

    public void setPartners(ArrayList<Object> partners) {
        this.partners = partners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationLegalDate() {
        return registrationLegalDate;
    }

    public void setRegistrationLegalDate(Date registrationLegalDate) {
        this.registrationLegalDate = registrationLegalDate;
    }

    public String getRemovalBasis() {
        return removalBasis;
    }

    public void setRemovalBasis(String removalBasis) {
        this.removalBasis = removalBasis;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public ArrayList<Object> getRepresentatives() {
        return representatives;
    }

    public void setRepresentatives(ArrayList<Object> representatives) {
        this.representatives = representatives;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public Date getRegistrationDenialDate() {
        return registrationDenialDate;
    }

    public void setRegistrationDenialDate(Date registrationDenialDate) {
        this.registrationDenialDate = registrationDenialDate;
    }
}
