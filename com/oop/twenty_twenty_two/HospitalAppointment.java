package com.oop.twenty_twenty_two;
import java.time.LocalDateTime;

public class HospitalAppointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime date;

    public HospitalAppointment(Doctor d,Patient p,LocalDateTime l){
        doctor=d;
        patient=p;
        date=l;
    }
    public String toString(){
        return "HospitalAppointment: "+date.toString()+"\n"+doctor.toString()+"\n"+patient.toString()+'\n';
    }
}
