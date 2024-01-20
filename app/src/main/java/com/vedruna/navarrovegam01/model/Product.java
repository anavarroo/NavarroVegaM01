package com.vedruna.navarrovegam01.model;

public class Product {


    private Long id;
    private String productname;
    private String desc;



    public Product(){

    }
    public Product(Long id, String productname, String desc) {
        this.id = id;
        this.productname = productname;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return
                "id=" + getId() +
                ", Productname='" + getProductname() + '\'' +
                ", desc='" + getDesc() + '\''
                ;
    }
}
