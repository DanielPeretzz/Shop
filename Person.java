package com.homework.daniel.shop.Model.Employee;

public  class Person {
    private String name;
    private String role;


    public Person(String name, String role) {
        this.name = name;
        this.role = role;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
