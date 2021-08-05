import java.util.*;
import java.sql.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ScrollPaneConstants;
 class AddToCart  {
    private int page;
    public String itemName;
    public String number;
    public String mandalPinCode;
    // JButton alert;
    int qty=0;
    int cost;
    int totalQty=0;

    // public String itemName;

  AddToCart(int page,String itemName,String number,String mandalPinCode,String cost,int qty) {
        this.page = page;
        this.itemName=itemName;
        this.number=number;
        this.mandalPinCode=mandalPinCode;
        this.cost= Integer. parseInt(cost);

  
        this.qty=qty;
        // System.out.println("i am from add to cart page is"+page+itemName+number+mandalPinCode+"qty is "+qty);

    }
   public void increaseqty(){
       qty=qty+1;
       
    //    System.out.println("increased qty"+"qty is "+qty+"and cost is"+cost);
   }
   public int returnqty(){
       return qty;
   }
    // public void actionPerformed(ActionEvent e) {
    //     JOptionPane.showMessageDialog(alert, "successfully added to cart");

        // System.out.println("page is"+page+itemName+number+mandalPinCode);
     
    // }
}