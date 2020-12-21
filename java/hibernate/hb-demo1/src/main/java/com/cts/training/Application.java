package com.cts.training;

import com.cts.training.eih.HealthInsurance;
import com.cts.training.eih.VehicleInsurance;
import com.cts.training.mapping.Address;
import com.cts.training.mapping.Cart;
import com.cts.training.mapping.Item;
import com.cts.training.mapping.Trainer;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        oneToMany();

    }

     static void oneToOne() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Address addr = new Address();
            Trainer trainer = new Trainer();

            addr.setTrainer(trainer);
            trainer.setAddress(addr);

            addr.setCity("TVPM");
            addr.setState("KL");
            addr.setPinCode("695695");

            trainer.setEmail("ashish.s");
            trainer.setFullName("Ashish S");

            session.getTransaction().begin();
            session.save(trainer);
            session.getTransaction().commit();
        }

    }

    static void oneToMany() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            Cart cart = new Cart();
            cart.setCreatedDate(LocalDate.now());

            Item item1 = new Item();
            item1.setName("Book");
            item1.setCart(cart);

            Item item2 = new Item();
            item2.setName("Pen");
            item2.setCart(cart);

            Set<Item> items = new HashSet<>();
            items.add(item1);
            items.add(item2);

            cart.setItems(items);

            session.getTransaction().begin();
            session.save(cart);
            session.getTransaction().commit();
        }

    }


    static void entityInheritance() {
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
