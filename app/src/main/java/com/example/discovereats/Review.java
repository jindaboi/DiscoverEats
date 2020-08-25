package com.example.discovereats;

import java.util.ArrayList;

public class Review {
    private Double rating;
    private String reviewMessage;

    public Review(Double rating, String reviewMessage) {
        this.rating = rating;
        this.reviewMessage = reviewMessage;

    }

    //Getters
    public Double getRating() {
        return rating;
    }
    public String getReviewMessage() {
        return reviewMessage;
    }

    //Setters
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public void setReviewMessage(String reviewMessage) {
        this.reviewMessage = reviewMessage;
    }
}
