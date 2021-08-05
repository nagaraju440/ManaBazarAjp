import java.awt.*;  
// import java.awt.*t;
import java.awt.event.ActionListener;
import javax.swing.*;  
import java.awt.image.BufferedImage;
import java.io.File;    
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class CustomerDashboardHome {
    public JPanel f;
    // DecidePage d=new DecidePage();
    JLabel a;
    String country[]={"vegetables","fruits","grains","flour"};    
  
   CustomerDashboardHome(){
   
    f=new JPanel();
        ImageIcon icon = new ImageIcon("uploadimage.png");
       JLabel label = new JLabel(icon);
       label.setBounds(730,100,400,300);
      a=new JLabel("Add an item");
       a.setBounds(850,50,200,20);
       a.setFont(new Font("Calibri", Font.BOLD, 30));
       a.setForeground(Color.blue);
       f.add(a);
       f.add(label);
       JLabel lblName = new JLabel("Item Name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(520, 440, 120, 43);
        f.add(lblName);
        JTextField  itemName = new JTextField();
        itemName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        itemName.setBounds(650, 440, 228, 50);
        f.add(itemName);
        itemName.setColumns(10);
        JLabel Category1 = new JLabel("Category");
        Category1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Category1.setBounds(950, 440, 120, 43);
        f.add(Category1);
        JComboBox cb=new JComboBox(country);    
        cb.setBounds(1050, 440,228,43);    
        f.add(cb);        
        JLabel cost = new JLabel("Cost");
        cost.setFont(new Font("Tahoma", Font.PLAIN, 20));
        cost.setBounds(520, 520, 120, 43);
        f.add(cost);
        JLabel kg = new JLabel("(as per 1kg)");
        kg.setFont(new Font("Tahoma", Font.PLAIN, 14));
        kg.setBounds(520, 535, 120, 43);
        f.add(kg);
        JTextField  cost1 = new JTextField();
        cost1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        cost1.setBounds(650, 525, 228, 50);
        f.add(cost1);
        cost1.setColumns(10);
        JLabel qty = new JLabel("Quantity");
        qty.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qty.setBounds(950, 525, 120, 43);
        f.add(qty);
        JLabel kg1 = new JLabel("(as per 1kg)");
        kg1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        kg1.setBounds(950, 540, 120, 43);
        f.add(kg1);
        JTextField  qty1 = new JTextField();
        qty1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qty1.setBounds(1050, 525, 228, 50);
        f.add(qty1);
        JButton submit=new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBounds(820,650,200,50);
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        f.add(submit);
        qty1.setColumns(10);
       f.setLayout(null);
       f.setVisible(true);
    }
//     public void actionPerformed(ActionEvent e){ 
        
        // JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
// }  
    public JPanel getPanel() {
        return f;
    }
 public static void main(String args[]) {
  

   CustomerDashboardHome fd=   new CustomerDashboardHome();

 }
}