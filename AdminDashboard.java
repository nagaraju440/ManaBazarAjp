
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
public class  AdminDashboard  extends Canvas{
    public JFrame f;
    JLabel l;
    JPanel top,p,home,history,cardPane;
    CardLayout layout ;
    JButton b;
 public void   AdminDashboard1(String mandalPinCode){
      System.out.println("i am from farmer dashboard and your mobile no is"+mandalPinCode);
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
            JLabel h0=new JLabel("Farmer");
            h0.setFont(new Font("Calibri", Font.BOLD, 30));
            h0.setBounds(1200,20,90,40);
            h0.setForeground(Color.red);
            h0.setOpaque(true);
           h0.setBackground(Color.white);
           p.add(h0);
            JLabel h=new JLabel("Customer");
            h.setFont(new Font("Calibri", Font.BOLD, 30));
            h.setBounds(1360,20,125,40);
            h.setForeground(Color.red);
            // h.setOpaque(true);
        //    h.setBackground(Color.white);

            p.add(h);
            JLabel h1=new JLabel("Change Stock");
            h1.setFont(new Font("Calibri", Font.BOLD, 30));
            h1.setBounds(1550,20,180,40);
            h1.setForeground(Color.red);
            p.add(h1);
            JLabel lo=new JLabel("Log Out");
            lo.setFont(new Font("Calibri", Font.BOLD, 30));
            lo.setBounds(1780,20,100,40);
            lo.setForeground(Color.red);
            p.add(lo);

            p.setBounds(0,0,screenSize.width,90);
            p.setBackground(Color.green);
            p.setLayout(null);
            f.add(p);
         
        //     ...................................bottom Dashboard.....................
          cardPane=new JPanel();
        home=new AdminFarmer(mandalPinCode).getPanel();
        //   home.setBounds(0,0,1000,500);
        //   home.setBackground(Color.red);
          home.setLayout(null);
        //   home.add(m);
        history=new JPanel();
        // history.setBounds(0,0,screenSize.width,screenSize.height-90);
        // history.setBackground(Color.blue);
        history.setLayout(null);
          layout = new CardLayout( );
          cardPane.setLayout(layout);
          cardPane.setBounds(0,90,screenSize.width,screenSize.height-90);

          cardPane.add(home,"home");
          cardPane.add(history,"history");
          f.add(cardPane);
           
    f.setVisible(true);
    h0.addMouseListener(new MouseAdapter()  
    {  
        public void mouseClicked(MouseEvent e)  
        {  
          System.out.println("clicked home");
          layout.show(cardPane,"home");
          h0.setOpaque(true);
          h0.setBackground(Color.white);
        //   h1.setOpaque(false);
          h1.setBackground(Color.green);
          h.setBackground(Color.green); 

          
    
        }  
    });     
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
          h0.setBackground(Color.green); 

          
    
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
          h0.setBackground(Color.green); 

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
      
        }  
    }); 
    }
   public void reload(){
    // SwingUtilities.updateComponentTreeUI(f);
    System.out.println("please reload the page");
    // f.removeAll();
    // f.setVisible(false);
    // AdminDashboard ad =new AdminDashboard();
    // ad.AdminDashboard1("522402");
    // f.invalidate();
// f.revalidate();
// f.repaint();
   }
     public static void main(String[] args) {
        AdminDashboard ad =new AdminDashboard();
         ad.AdminDashboard1("522402");
     }
}