package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryID;
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.PERSIST})
    private List<Product> products = new ArrayList<>();

    public Category() {
    }
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProductToCategory(Product product){
        this.products.add(product);
        product.setCategory(this);
    }
}
