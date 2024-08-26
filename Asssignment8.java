/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asssignment8;
import files.Loading;
import files.welcome;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hp
 */
public class Asssignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loading load=new Loading();
        load.setVisible(true);
        // TODO code application logic here
        for(int i=0;i<=100;i++){
        load.getjLabel2().setText(String.valueOf(i));
        load.getjProgressBar1().setValue(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Asssignment8.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());
            }
    }
        load.setVisible(false);
        load.dispose();
        new welcome().setVisible(true);
    
}}
