
package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class store {
    public static ArrayList<product>prd=new ArrayList();
   public static ArrayList<Bill_info>bil=new ArrayList();
   // private ArrayList<product>prd2=new ArrayList();

    public  static ArrayList<Bill_info> getBil() {
        return bil;
    }
public static void dummy_bills(){
/*bill_product a=new bill_product("4","pop","hj",44,5,2);
Bill_info b=new Bill_info(LocalDate.of(2024,02,05),"kk","oo",11,22,33);
b.addbil_p2(a);
Bill_info.addbil_p(a);
//Bill_info.addbil_p2(a);
bil.add(b);
bill_product aa=new bill_product("4","pop","hj",44,5,2);
Bill_info bb=new Bill_info(LocalDate.of(2024,02,05),"kk","oo",11,22,33);
bb.addbil_p2(aa);
Bill_info.addbil_p(aa);
bil.add(bb);
bill_product aaa=new bill_product("4","pop","hj",44,5,2);
Bill_info bbb=new Bill_info(LocalDate.of(2024,02,05),"kk","oo",11,22,33);
bbb.addbil_p2(aaa);
Bill_info.addbil_p(aaa);
bil.add(bbb);
bill_product aaaa=new bill_product("4","pop","hj",44,5,2);
Bill_info bbbb=new Bill_info(LocalDate.of(2024,02,05),"kk","oo",11,22,33);
bbbb.addbil_p2(aaaa);
bil.add(bbbb);
Bill_info.addbil_p(aaaa);*/
//******************************
// January
bill_product a = new bill_product("1", "product_jan", "hj", 44, 5, 2);
Bill_info b = new Bill_info(LocalDate.of(2024, 1, 5), "kk", "oo", 11, 22, 33);
b.addbil_p2(a);
Bill_info.addbil_p(a);
bil.add(b);

// February
bill_product aa = new bill_product("2", "product_feb", "hj", 44, 5, 2);
Bill_info bb = new Bill_info(LocalDate.of(2024, 2, 5), "kk", "oo", 11, 22, 33);
bb.addbil_p2(aa);
Bill_info.addbil_p(aa);
bil.add(bb);

// March
bill_product aaa = new bill_product("3", "product_mar", "hj", 44, 5, 2);
Bill_info bbb = new Bill_info(LocalDate.of(2024, 3, 5), "kk", "oo", 11, 22, 33);
bbb.addbil_p2(aaa);
Bill_info.addbil_p(aaa);
bil.add(bbb);

// April
bill_product aaaa = new bill_product("4", "product_apr", "hj", 44, 5, 2);
Bill_info bbbb = new Bill_info(LocalDate.of(2024, 4, 5), "kk", "oo", 11, 22, 33);
bbbb.addbil_p2(aaaa);
Bill_info.addbil_p(aaaa);
bil.add(bbbb);

// May
bill_product aaaaa = new bill_product("5", "product_may", "hj", 44, 5, 2);
Bill_info bbbbb = new Bill_info(LocalDate.of(2024, 5, 5), "kk", "oo", 11, 22, 33);
bbbbb.addbil_p2(aaaaa);
Bill_info.addbil_p(aaaaa);
bil.add(bbbbb);

// June
bill_product aaaaaa = new bill_product("6", "product_jun", "hj", 44, 5, 2);
Bill_info bbbbbb = new Bill_info(LocalDate.of(2024, 6, 5), "kk", "oo", 11, 22, 33);
bbbbbb.addbil_p2(aaaaaa);
Bill_info.addbil_p(aaaaaa);
bil.add(bbbbbb);

// July
bill_product aaaaaaa = new bill_product("7", "product_jul", "hj", 44, 5, 2);
Bill_info bbbbbbb = new Bill_info(LocalDate.of(2024, 7, 5), "kk", "oo", 11, 22, 33);
bbbbbbb.addbil_p2(aaaaaaa);
Bill_info.addbil_p(aaaaaaa);
bil.add(bbbbbbb);

// August
bill_product aaaaaaaa = new bill_product("8", "product_aug", "hj", 44, 5, 2);
Bill_info bbbbbbbb = new Bill_info(LocalDate.of(2024, 8, 5), "kk", "oo", 11, 22, 33);
bbbbbbbb.addbil_p2(aaaaaaa);
Bill_info.addbil_p(aaaaaaa);
bil.add(bbbbbbbb);

// September
bill_product aaaaaaaaa = new bill_product("9", "product_sep", "hj", 44, 5, 2);
Bill_info bbbbbbbbb = new Bill_info(LocalDate.of(2024, 9, 5), "kk", "oo", 11, 22, 33);
bbbbbbbbb.addbil_p2(aaaaaaaaa);
Bill_info.addbil_p(aaaaaaaaa);
bil.add(bbbbbbbbb);

// October
bill_product aaaaaaaaaa = new bill_product("10", "product_oct", "hj", 44, 5, 2);
Bill_info bbbbbbbbbb = new Bill_info(LocalDate.of(2024, 10, 5), "kk", "oo", 11, 22, 33);
bbbbbbbbbb.addbil_p2(aaaaaaaaaa);
Bill_info.addbil_p(aaaaaaaaaa);
bil.add(bbbbbbbbb);

// November
bill_product aaaaaaaaaaa = new bill_product("11", "product_nov", "hj", 44, 5, 2);
Bill_info bbbbbbbbbbb = new Bill_info(LocalDate.of(2024, 11, 5), "kk", "oo", 11, 22, 33);
bbbbbbbbb.addbil_p2(aaaaaaaaaaa);
Bill_info.addbil_p(aaaaaaaaaaa);
bil.add(bbbbbbbbbb);

// December
bill_product aaaaaaaaaaaa = new bill_product("12", "product_dec", "hj", 44, 5, 2);
Bill_info bbbbbbbbbbbb = new Bill_info(LocalDate.of(2024, 12, 5), "kk", "oo", 11, 22, 33);
bbbbbbbbbbbb.addbil_p2(aaaaaaaaaaaa);
Bill_info.addbil_p(aaaaaaaaaaaa);
bil.add(bbbbbbbbbbb);





}
    public static void setBil(Bill_info obj) {
        bil.add(obj);
    }
    public static void add(product obj){
    prd.add(obj);
    
    }
    public static ArrayList productlist (){
    return prd;
    }
   /* public  void addprd2(product obj){
    prd2.add(obj);
    
    }
    public  ArrayList productlist2 (){
    return prd2;
    }*/
}
