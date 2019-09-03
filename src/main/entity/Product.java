package main.entity;

import java.util.Date;

public class Product {
    private String id;
    private String name;
    private Integer count;
    private Double price;
    private Date birth;

    public Product(String id, String name, Integer count, Double price, Date birth) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.birth = birth;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", birth=" + birth +
                '}';
    }
}
