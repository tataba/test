package com.onbonbx;

public class BxData {
    private int id;
    private int age;
    private String name;


    public BxData(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " age: " + this.age + " id: " + this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
