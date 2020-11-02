package com.jdbc.demo.dao.model;

//Domain object or model or DTO
public class Trainee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String year;

    public Trainee() {
    }

    public Trainee(String firstName, String lastName, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Trainee(Integer id, String firstName, String lastName, String year) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
