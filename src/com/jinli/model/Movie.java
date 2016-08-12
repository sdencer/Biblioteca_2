package com.jinli.model;

import java.util.Date;

public class Movie {
    private Integer id;
    private String name;
    private Date year;
    private String director;
    private Integer rate;
    private boolean isCheckout;

    public Movie(Integer id, String name, Date year, String director, Integer rate, boolean isCheckout){
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.isCheckout = isCheckout;
    }

    public Movie(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }
}
