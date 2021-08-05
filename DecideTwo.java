import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
import java.awt.image.BufferedImage;
import java.io.File;    
import javax.swing.ImageIcon;

public class DecideTwo implements ActionListener{
    public JPanel f;
    DecideTwo(){
    f=new JPanel();
        ImageIcon icon = new ImageIcon("decideimage.jpg");
       JLabel label = new JLabel(icon);
       label.setBounds(700,100,500,500);
       JButton LF=new JButton("Loginnnn as farmer");
       JButton LC=new JButton("Loginnnn as customer");
       JButton SF=new JButton("Signup as farmer");
       JButton SC=new JButton("Signup as customer");
      LF.addActionListener(this);  

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
       f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){ 
        DecidePage d=new DecidePage();
        // d.test();
        JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
}  
    public JPanel getPanel() {
        return f;
    }
 public static void main(String args[]) {
    new DecideTwo();
 }
}