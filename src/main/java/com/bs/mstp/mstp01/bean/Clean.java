package com.bs.mstp.mstp01.bean;

public class Clean {
    private Long id;
    private Long goods_id;
    private String detail;
    private String cleantime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCleantime() {
        return cleantime;
    }

    public void setCleantime(String cleantime) {
        this.cleantime = cleantime;
    }
}
