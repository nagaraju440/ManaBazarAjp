import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
import java.awt.image.BufferedImage;
import java.io.File;    
import javax.swing.ImageIcon;

public class DecideOne implements ActionListener{
    public JPanel f;
    DecidePage d=new DecidePage();
    DecideOne(){
    f=new JPanel();
        ImageIcon icon = new ImageIcon("final1.jpg");
       JLabel label = new JLabel(icon);
       label.setBounds(600,100,700,500);
       JButton LF=new JButton("Login as farmer");
       JButton LC=new JButton("Login as customer");
       JButton SF=new JButton("Signup as farmer");
       JButton SC=new JButton("Signup as customer");
    //    LF.setActionCommand("LF");
    //    SF.setActionCommand("SF");
    //    SC.setActionCommand("SC");
    //    LC.setActionCommand("LC");
    LF.addActionListener(e-> d.test());  
    SF.addActionListener(e-> d.farmerUp()); 
    SC.addActionListener(e-> d.CustomerUp()); 
    LC.addActionListener(e->d.customerlogin()); 



       LF.setBounds(700,700,230,40); 
      LF.setBackground(Color.BLACK);
      LF.setForeground(Color.WHITE);
      LF.setFont(new Font("Arial", Font.PLAIN, 20));
       LC.setBounds(970,700,230,40);  
       LC.setBackground(Color.BLACK);
       LC.setForeground(Color.WHITE);
       LC.setFont(new Font("Arial", Font.PLAIN, 20));
       SF.setBounds(700,800,230,40);  
       SF.setBackground(Color.BLACK);
       SF.setForeground(Color.WHITE);
       SF.setFont(new Font("Arial", Font.PLAIN, 20));
       SC.setBounds(970,800,230,40);  
       SC.setBackground(Color.BLACK);
       SC.setForeground(Color.WHITE);
       SC.setFont(new Font("Arial", Font.PLAIN, 20));
       f.add(LF);
       f.add(LC);
       f.add(SF);
       f.add(SC);
       f.add(label);
    f.setBackground(Color.decode("#FFFF66"));
    f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){ 
        
        // JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
}  
    public JPanel getPanel() {
        return f;
    }
 public static void main(String args[]) {
    new DecideOne();
 }
}