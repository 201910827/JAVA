package com.oop.twenty_twenty_two;

import java.util.Date;
public class Patient {
    private String name;
    private String id;
    public Patient(String name){
        this.name=name;
        Date d= new Date();
        id = d.getTime()+name;
    }
    public String getId(){return id;}
    public String getName(){return name;}
    public String toString(){
        return "Patient: name:"+name+"id: "+id;
    }

}

