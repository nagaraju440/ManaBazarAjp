
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.*;
// import java.util.*;  
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.*;
public class  CustomerDashboard  {
    JFrame f;
    JLabel l;
    JPanel top,p=new JPanel(),home,history,cardPane;
    CardLayout layout ;
    JButton b;
     JLabel cn=new JLabel("0");
     AddToCart at[]=new AddToCart[100];
     public void setCart(int total) {
       

      cn.setText(String.valueOf(total));
      // JLabel cn=new JLabel("8");
          //  cn.setText("2");
          System.out.println("i am from customer dashboard qty is "+total+cn.getText());
         
        
              // return 1;
    }
   public void CustomerDashboard1(){
      // for (int k=0;k<ar.length;k++){
      //     System.out.println("array dast is"+ar[k]);
      // }
            f=new JFrame("Customer Dashboard");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            f.setBounds(0,0,screenSize.width, screenSize.height);
            f.setLayout(null);
            // top=new JPanel();
            // p=new JPanel();
            JLabel m=new JLabel("MANA BAZAR");
            m.setFont(new Font("Calibri", Font.BOLD, 30));
            m.setBounds(50,20,200,40);
            m.setForeground(Color.red);
            p.add(m);
            JLabel ho=new JLabel("Home");
            ho.setFont(new Font("Calibri", Font.BOLD, 30));
            ho.setBounds(1300,20,80,40);
            ho.setForeground(Color.red);
            ho.setOpaque(true);
            ho.setBackground(Color.white);
            p.add(ho);
            JLabel h=new JLabel("Cart");
            h.setFont(new Font("Calibri", Font.BOLD, 30));
            h.setBounds(1450,20,55,40);
            h.setForeground(Color.red);
            p.add(h);
          //  cn=new JLabel("0");
            cn.setFont(new Font("Calibri", Font.BOLD, 25));
            cn.setBounds(1510,28,30,25);
            cn.setBackground(Color.black);
            cn.setForeground(Color.white);
            cn.setOpaque(true);
            p.add(cn);

            JLabel h1=new JLabel("Orders");
            h1.setFont(new Font("Calibri", Font.BOLD, 30));
            h1.setBounds(1600,20,90,40);
            h1.setForeground(Color.red);
            p.add(h1);
            JLabel lo=new JLabel("Log Out");
            lo.setFont(new Font("Calibri", Font.BOLD, 30));
            lo.setBounds(1750,20,100,40);
            lo.setForeground(Color.red);
            p.add(lo);

            p.setBounds(0,0,screenSize.width,90);
            p.setBackground(Color.green);
            p.setLayout(null);
            f.add(p);
         
        //     ...................................bottom Dashboard.....................
          cardPane=new JPanel();
        home=new CustomerHome("522402",cn,at).getPanel();
        //   home.setBounds(0,0,screenSize.width,screenSize.height-90);
        //   home.setBackground(Color.red);
          home.setLayout(null);
        JPanel  cart=new CustomerCart("522402").getPanel();
          cart.setLayout(null);

        //   home.add(m);
        history=new JPanel();
        // history.setBounds(0,0,screenSize.width,screenSize.height-90);
        // history.setBackground(Color.blue);
        history.setLayout(null);
          layout = new CardLayout();
          cardPane.setLayout(layout);
          cardPane.setBounds(0,90,screenSize.width,screenSize.height-90);

          cardPane.add(home,"home");
          cardPane.add(history,"history");
          cardPane.add(cart,"cart");
          f.add(cardPane);
           
    f.setVisible(true);
   
    ho.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked home");
          layout.show(cardPane,"home");
          ho.setOpaque(true);
          ho.setBackground(Color.white);
        //   h1.setOpaque(false);
          h1.setBackground(Color.green); 
          h.setBackground(Color.green); 
        }  
    });  
    h.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked cart");
          // CustomerHome ch=new CustomerHome("",cn);
         try {
         
         } catch (Exception e1) {
           //TODO: handle exception
         }
          layout.show(cardPane,"cart");
          h.setOpaque(true);
          h.setBackground(Color.white);
        //   h1.setOpaque(false);
          h1.setBackground(Color.green); 
          ho.setBackground(Color.green); 

          
    
        }  
    }); 
    h1.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked history");
          layout.show(cardPane,"history");
          h1.setOpaque(true);
        //   h.setOpaque(false);
          h1.setBackground(Color.white); 
          h.setBackground(Color.green);
          ho.setBackground(Color.green); 

        }  
    }); 
    lo.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
        //   f.dispose();
          lo.setOpaque(true);
        //   h.setOpaque(false);
          lo.setBackground(Color.white); 
        //   do.setVisible(true);
        }  
    }); 
    // this.setCart(1);
    }
   
   
     public static void main(String[] args) {
      
      CustomerDashboard cd=new CustomerDashboard();
        cd.CustomerDashboard1();
         
     }
}