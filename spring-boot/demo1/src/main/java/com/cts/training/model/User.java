package com.cts.training.model;

public class User {

    private String user;
    private int id;

    public User(int id, String user){
        this.id = id;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
