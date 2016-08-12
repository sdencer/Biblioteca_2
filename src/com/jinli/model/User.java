package com.jinli.model;

import java.util.List;
import java.util.LongSummaryStatistics;

public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Long phoneNum;
    private Integer level;  //0-customer 1-librarian

    public User(Integer id, String name, String password, String email, Long phoneNum, Integer level){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.level = level;
    }
    public User(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
