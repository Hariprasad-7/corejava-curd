package org.example;

public class Employee {

    private String id;
    private String name;

    @Override
    public String toString() {
        return "\n Employe \n"+" id "+id+"\n"+" name "+name+"\n"+"country "+country;
    }

    public Employee() {
    }

    public Employee(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

}
