package com.baizhi.entity;
import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private String id;
    private String productname;
    private String productsalary;
    private Date productdate;
    private String productaddr;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", productsalary='" + productsalary + '\'' +
                ", productdate=" + productdate +
                ", productaddr='" + productaddr + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductsalary() {
        return productsalary;
    }

    public void setProductsalary(String productsalary) {
        this.productsalary = productsalary;
    }

    public Date getProductdate() {
        return productdate;
    }

    public void setProductdate(Date productdate) {
        this.productdate = productdate;
    }

    public String getProductaddr() {
        return productaddr;
    }

    public void setProductaddr(String productaddr) {
        this.productaddr = productaddr;
    }

    public Product(String id, String productname, String productsalary, Date productdate, String productaddr) {
        this.id = id;
        this.productname = productname;
        this.productsalary = productsalary;
        this.productdate = productdate;
        this.productaddr = productaddr;
    }

    public Product() {
    }
}
