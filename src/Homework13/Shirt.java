package Homework13;

import java.util.StringTokenizer;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String s){
        StringTokenizer str = new StringTokenizer(s,",");
        this.id = str.nextToken();
        this.name = str.nextToken();
        this.color = str.nextToken();
        this.size = str.nextToken();
    }

    public String toString(){
        return id+" "+name+" "+color+" "+size;
    }
}
