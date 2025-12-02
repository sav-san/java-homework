package Homework13;

public class Person{
    private String surname;
    private String name;
    private String fathername;

    public Person(String surname){
        this.surname = surname;
        this.name = null;
        this.fathername = null;
    }
    public Person(String surname, String name){
        this.surname=surname;
        this.name = name;
        this.fathername= null;
    }
    public Person(String surname, String name, String fathername){
        this.surname=surname;
        this.name = name;
        this.fathername=fathername;
    }

    public void setSurname(String surname) {this.surname = surname;}
    public String getSurname() {return surname;}
    public void setName(String name) {this.name = name;}
    public String getName(){return name;}
    public void setFathername(String fathername) {this.fathername = fathername;}
    public String getFathername() {return fathername;}

    public String getFullName(){
        StringBuilder result = new StringBuilder(surname);
        if (name!= null && !name.isEmpty()){
            result.append(" ").append(name.charAt(0)).append(".");
            if (fathername!=null && !fathername.isEmpty()){
                result.append(" ").append(fathername.charAt(0)).append(".");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
