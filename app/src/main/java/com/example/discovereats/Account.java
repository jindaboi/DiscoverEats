package com.example.discovereats;

import java.util.ArrayList;

public class Account {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Restaurant> restaurants;

    public Account(String username, String password, String firstName, String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        restaurants = null;
    }

    //Getters
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
