import java.util.*;
import java.sql.*;  
import java.awt.*;
import javax.swing.*;
public class FarmerOrderCard {
    JPanel card=new JPanel();
    FarmerOrderCard(int x,int y){
        System.out.println("x is"+x+"y is"+y);
         JLabel l=new JLabel("hello world");
         l.setBounds(x,y,40,50);
         l.setForeground(Color.green);
         card.add(l);
         card.repaint();
         card.setBounds(100,100,500,300);
         card.setBackground(Color.blue);
         card.setLayout(null);
         card.setVisible(true);


    }
    public JPanel getPanel() {
        return card;
    }
    public static void main(String[] args) {
        FarmerOrderCard af=new FarmerOrderCard(100,100);
        
    }   
}