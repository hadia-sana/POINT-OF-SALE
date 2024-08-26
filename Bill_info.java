/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Bill_info {
    
    private LocalDate date;
    private String cust_address;
    private String cust_name;
    private int total_bill;
    private int payment;
    private int balance;
public static ArrayList <bill_product>bil_p=new ArrayList();
private ArrayList <bill_product>bil_p2=new ArrayList();
    
public Bill_info(){}

    public Bill_info(LocalDate date, String cust_address, String cust_name, int total_bill, int payment, int balance) {
        this.date = date;
        this.cust_address = cust_address;
        this.cust_name = cust_name;
        this.total_bill = total_bill;
        this.payment = payment;
        this.balance = balance;
    }
   public static void addbil_p(bill_product obj){
   bil_p.add(obj);
   }
public static ArrayList<bill_product> getbil_p(){
return bil_p;
}
public void addbil_p2(bill_product obj){
   bil_p2.add(obj);
   }
public ArrayList<bill_product> getbil_p2(){
return bil_p2;
}
    public int getDate() {
        return date.getMonthValue();
    }
    public LocalDate getDatereal() {
        return date;
    }
    public void setbil_p(ArrayList <bill_product>a){
    bil_p=a;
    }

    public void setDate(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 this.date = LocalDate.parse(s, formatter);
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public int getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(int total_bill) {
        this.total_bill = total_bill;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

   
    
    
}
