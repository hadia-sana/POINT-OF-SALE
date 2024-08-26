/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Hp
 */
public class product {
    private String id;
    private String name;
    private int w_price;
    private int r_price;
    private String category;
    private int stock;
    private int sold;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setW_price(int w_price) {
        this.w_price = w_price;
    }

    public void setR_price(int r_price) {
        this.r_price = r_price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public product(String id, String name, int w_price, int r_price, String category, int stock) {
        this.id = id;
        this.name = name;
        this.w_price = w_price;
        this.r_price = r_price;
        this.category = category;
        this.stock = stock;
        this.sold=0;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
    public product(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getW_price() {
        return w_price;
    }

    public int getR_price() {
        return r_price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }
    
}
