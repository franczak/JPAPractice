package com.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;

    private String productName;
    private int unitsOnStock;

    @ManyToOne
    @JoinColumn(name="SUPPLIER_TK")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name="CATEGORY_TK")
    private Category category;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<TransactionC> transactions = new LinkedList<>();



    public Product(){}

    public Product(String productName, int unitsOnStock){
        this.productName=productName;
        this.unitsOnStock=unitsOnStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsOnStock() {
        return unitsOnStock;
    }

    public void setUnitsOnStock(int unitsOnStock) {
        this.unitsOnStock = unitsOnStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
        this.supplier.getSuppliedProducts().add(this);
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        this.category.getProducts().add(this);
    }

    public List<TransactionC> getTransactionList() {
        return transactions;
    }

    public void addTransaction(TransactionC transaction){
        transactions.add(transaction);
        transaction.getProducts().add(this);
    }


}

