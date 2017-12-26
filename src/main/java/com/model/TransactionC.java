package com.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class TransactionC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionNumber;

    @ManyToMany(mappedBy = "transactions", cascade = {CascadeType.PERSIST})
    private List<Product> products = new ArrayList<>();

    @ElementCollection
    private Map<Product,Integer> quantity = new HashMap<>();

    public TransactionC(){}

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public Map<Product, Integer> getQuantity() {
        return quantity;
    }

    public int getQuantity(Product product){
        return quantity.get(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product, int quantity){
        products.add(product);
        this.quantity.put(product,quantity);
        product.getTransactionList().add(this);
    }
}

