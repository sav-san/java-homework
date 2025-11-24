package Homework13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String string){
        StringTokenizer tokens = new StringTokenizer(string,",;.");
        this.country = tokens.nextToken();
        this.region = tokens.nextToken();
        this.city = tokens.nextToken();
        this.street = tokens.nextToken();
        this.house = tokens.nextToken();
        this.building = tokens.nextToken();
        this.apartment = tokens.nextToken();

    }

    public String toString(){
        return country.toUpperCase()+" "+region+" г."+city+" ул."+street+", д."+house+", с."+building+", кв."+apartment;
    }
}
