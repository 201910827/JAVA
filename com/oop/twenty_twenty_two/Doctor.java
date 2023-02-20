package com.oop.twenty_twenty_two;

public class Doctor {
    private String name;
    private int id;
    public Doctor(int id,String name){
        this.name=name;
        this.id=id;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String toString(){
        return "Doctor: name:"+name+"id: "+id;
    }

}
