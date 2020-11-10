package com.demo.flight.management.model;

import com.demo.flight.management.exceptions.InvalidFlightOperaration;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String id;
    private String flightType;
    private List<Passenger> passengers = new ArrayList<>();

    public boolean addPassenger(Passenger passenger) throws InvalidFlightOperaration{
       return false;

    }

    public boolean removePassegner(Passenger passenger) throws InvalidFlightOperaration{

        return false;
    }
}
