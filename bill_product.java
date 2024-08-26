/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Hp
 */
public class bill_product {
    private String prd_id;
    private String name;
    private String category;
    private int price;
    private int quantity;
    private int sold;

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public bill_product(String prd_id, String name, String category, int price, int quantity, int sold) {
        this.prd_id = prd_id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.sold = sold;
    }
    public String getPrd_id() {
        return prd_id;
    }

    public void setPrd_id(String prd_id) {
        this.prd_id = prd_id;
    }
public bill_product(){}
    public bill_product(String prd_id, String name, String category, int price, int quantity) {
        this.prd_id = prd_id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
     public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
