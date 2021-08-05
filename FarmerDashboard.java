
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.*;
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
public class  FarmerDashboard  extends Canvas{
    JFrame f;
    JLabel l;
    JPanel top,p,home,history,cardPane;
    CardLayout layout ;
    JButton b;
    JPanel ar[];
    // ar=new JPanel[10];
    FarmerDashboard(String number,String mandalPinCode){
      System.out.println("i am from farmer dashboard and your mobile no is"+number+mandalPinCode);
            f=new JFrame("farmer Dashboard");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            f.setBounds(0,0,screenSize.width, screenSize.height);
            f.setLayout(null);
            // top=new JPanel();
            p=new JPanel();
            JLabel m=new JLabel("MANA BAZAR");
            m.setFont(new Font("Calibri", Font.BOLD, 30));
            m.setBounds(50,20,200,40);
            m.setForeground(Color.red);
            p.add(m);
            JLabel h=new JLabel("Home");
            h.setFont(new Font("Calibri", Font.BOLD, 30));
            h.setBounds(1450,20,80,40);
            h.setForeground(Color.red);
            h.setOpaque(true);
           h.setBackground(Color.white);

            p.add(h);
            JLabel h1=new JLabel("History");
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
        home=new FarmerDashboardHome(number,mandalPinCode).getPanel();
        //   home.setBounds(0,0,screenSize.width,screenSize.height-90);
        //   home.setBackground(Color.red);
          home.setLayout(null);
        //   home.add(m);
        // history=new FarmerHistory(number,mandalPinCode).getPanel();
        // history.setLayout(null);
          layout = new CardLayout();
          cardPane.setLayout(layout);
          cardPane.setBounds(0,90,screenSize.width,screenSize.height-90);

          cardPane.add(home,"home");
          // cardPane.add(history,"history");
          f.add(cardPane);
           
    f.setVisible(true);
    
    h.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked home");
          layout.show(cardPane,"home");
          h.setOpaque(true);
          h.setBackground(Color.white);
        //   h1.setOpaque(false);
          h1.setBackground(Color.green); 
          
    
        }  
    }); 
    h1.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked history");
          history=new FarmerHistory(number,mandalPinCode).getPanel();
          history.setLayout(null);
          cardPane.add(history,"history");

          layout.show(cardPane,"history");

          h1.setOpaque(true);
        //   h.setOpaque(false);
          h1.setBackground(Color.white); 
          h.setBackground(Color.green); 
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
        f.dispose();
        FarmerLoginPage flp=new FarmerLoginPage();
        flp.setVisible(false);
        }  
    }); 
    }
   
     public static void main(String[] args) {
        new FarmerDashboard("8688696792","522402");
         
     }
}