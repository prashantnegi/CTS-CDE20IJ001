package com.cts.training;

import com.cts.training.eih.HealthInsurance;
import com.cts.training.eih.Insurance;
import com.cts.training.eih.VehicleInsurance;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        HealthInsurance health = new HealthInsurance();
        VehicleInsurance vehicle = new VehicleInsurance();

        vehicle.setRegNumber("MH-001");
        vehicle.setVehicleType("Car");
        vehicle.setEmail("arun.k@gmail.com");
        vehicle.setInsuredAmount(15000.0f);
        vehicle.setPolicyHolder("Arun K");
        vehicle.setPolicyName("Simple Two Wheeler");

        health.setEmail("rohit.r@gmail.com");
        health.setInsuredAmount(55000.0f);
        health.setPolicyHolder("Rohit R");
        health.setPolicyName("Single Person Health");
        health.setMaternityCovered(false);
        health.setTerminalCovered(false);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            session.save(health);
            session.save(vehicle);
            session.getTransaction().commit();
            session.close();
        }

    }
}
