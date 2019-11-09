package com.example.shehack;

import com.example.shehack.Details;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Station {

    @SerializedName("name")
    private String name;
    @SerializedName("details")
    private List<Details> details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public Station(String name, List<Details> details)
    {
        this.name= name;
        this.details= details;
    }

}
