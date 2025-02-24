package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {
    private int id;
    private List<Product> products;

    public Invoice(int id){
        super(id);
        this.id = id;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public int getTotalCost(){
        int totalCost = 0;
        for(Product cost : products){
            totalCost += cost.getCost();
        }
        return totalCost;
    }
}
