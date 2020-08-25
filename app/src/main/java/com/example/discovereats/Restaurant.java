package com.example.discovereats;

import java.util.ArrayList;

public class Restaurant {

    private String restaurantName;
    private String type;
    private ArrayList<Review> reviews;
    private Boolean swiped;

    public Restaurant(String restaurantName, String type) {
        this.restaurantName = restaurantName;
        this.type = type;
        reviews = null;
        swiped = null;
    }

    // getters
    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public Boolean getSwiped() {
        return swiped;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public String getType() {
        return type;
    }

    //Setters
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    public void setSwiped(Boolean swiped) {
        this.swiped = swiped;
    }
    public void setType(String type) {
        this.type = type;
    }

}
