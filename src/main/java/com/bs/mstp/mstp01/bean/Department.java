package com.bs.mstp.mstp01.bean;

import java.util.Date;

public class Department {
    private Long id;
    private String name;
    private String director;
    private String address;
    private String tel;
    private String foundtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFoundtime() {
        return foundtime;
    }

    public void setFoundtime(String foundtime) {
        this.foundtime = foundtime;
    }
}
