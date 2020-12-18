package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClinicCalendar {

    private List<PatientAppointment> appointments;

    public ClinicCalendar(){
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(String firstName, String lastName, String doctor, String dateTime){

    }

    public List<PatientAppointment> getAppointments(){
        return this.appointments;
    }
}
