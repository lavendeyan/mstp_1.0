package com.bs.mstp.mstp01.bean;

public class Goods {

    private Long id;
    private String barcode;
    private String name;
    private String norm;
    private String unit;
    private String num;
    private String boxnorm;
    private String brithtime;

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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getNorm() {
        return norm;
    }

    public void setNorm(String norm) {
        this.norm = norm;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBoxnorm() {
        return boxnorm;
    }

    public void setBoxnorm(String boxnorm) {
        this.boxnorm = boxnorm;
    }

    public String getBrithtime() {
        return brithtime;
    }

    public void setBrithtime(String brithtime) {
        this.brithtime = brithtime;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    private String ontime;
}
