import java.util.*;
import java.sql.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class CustomerMainCart extends CustomerDashboard{ 
    
   JPanel panel=new JPanel(),mainPanel=new JPanel();
   int i=0;
   public int ist=0;
 
    CustomerCart(String mandalPinCode){
        System.out.println("length broo"+at.length);
        // super(mandalPinCode);
        // try {
        //     for(int k=0;k<at1.length;k++){
        //         System.out.println(at1[k].returnqty()+"is quantity of product"+k);
        //     }
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     ImageIcon icon = new ImageIcon("potatoimg.jpg");
        JLabel label = new JLabel(icon);
        label.setBounds(50,20,150,150);
        panel.add(label);
    JLabel in=new JLabel("name :potato ");
    in.setBounds(250,30,200,50);
    in.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    panel.add(in);
    JLabel ic=new JLabel("Cost : 20 rs");
    ic.setBounds(250,100,200,50);
    ic.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    panel.add(ic);
    JLabel yo=new JLabel("You ordered :5 Kgs");
    yo.setBounds(650,30,250,50);
    yo.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    panel.add(yo);
    JLabel tc=new JLabel("Cost :100 Rs");
    tc.setBounds(650,100,250,50);
    tc.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    panel.add(tc);
    
    JButton r=new JButton("Remove");
    r.setBounds(1050,70,150,40);
    r.setBackground(Color.black);
    r.setForeground(Color.white);
    r.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    panel.add(r);
    
    // ............................2nd item...................

    ImageIcon icon1 = new ImageIcon("tamatoimg.jpg");
    JLabel label1 = new JLabel(icon1);
    label1.setBounds(50,300,150,150);
    panel.add(label1);
JLabel in1=new JLabel("name :tamato ");
in1.setBounds(250,300,200,50);
in1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
panel.add(in1);
JLabel ic1=new JLabel("Cost : 20 rs");
ic1.setBounds(250,370,200,50);
ic1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
panel.add(ic1);
JLabel yo1=new JLabel("You ordered :5 Kgs");
yo1.setBounds(650,300,250,50);
yo1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
panel.add(yo1);
JLabel tc1=new JLabel("Cost :100 Rs");
tc1.setBounds(650,370,250,50);
tc1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
panel.add(tc1);

JButton r1=new JButton("Remove");
r1.setBounds(1050,340,150,40);
r1.setBackground(Color.black);
r1.setForeground(Color.white);
r1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
panel.add(r1);

    JLabel tc3=new JLabel("Total Cost :200 Rs");
tc3.setFont(new Font("Times New Roman", Font.PLAIN, 26));

    tc3.setBounds(650,500,300,70);
    panel.add(tc3);

    JButton clc=new JButton("Clear cart");
    clc.setBounds(650,650,150,40);
    clc.setBackground(Color.black);
    clc.setForeground(Color.white);
    clc.setFont(new Font("Times New Roman", Font.PLAIN, 24));
    panel.add(clc);
    JButton clc1=new JButton("Confirm Order");
    clc1.setBounds(850,650,200,40);
    clc1.setBackground(Color.black);
    clc1.setForeground(Color.white);
    clc1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
    panel.add(clc1);
     panel.setBounds(300,60,screenSize.width-200,screenSize.height-200);
     panel.setLayout(null);
    //  panel.setBackground(Color.red);
     mainPanel.add(panel);
     mainPanel.setLayout(null);
     mainPanel.setVisible(true);

     mainPanel.setBounds(0,0,screenSize.width, screenSize.height);
    //  mainPanel.setBackground(Color.blue);


      
}  
public JPanel getPanel() {
    // this.at=at;
  

    return mainPanel;
}

    public static void main(String[] args) {
        // CustomerCart af=new CustomerCart("522402");
        // af.CustomerCart1("522402"); 
        
    }
}

//   class PageActionListener implements ActionListener {
//     private int page;
//     public String itemName;
//     public String number;
//     public String mandalPinCode;
//     // public String itemName;

//     public PageActionListener(int page,String itemName,String number,String mandalPinCode) {
//         this.page = page;
//         this.itemName=itemName;
//         this.number=number;
//         this.mandalPinCode=mandalPinCode;
//     }

//     public void actionPerformed(ActionEvent e) {
//         System.out.println("page is"+page+itemName+number+mandalPinCode);
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");  
//             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");  
//             System.out.println("database connected");
//             String query = "update items set isTaken=? where item_name=? and MOBILE_NUMBER=? and mandalPinCode=? ";
//             PreparedStatement  ps = con.prepareStatement(query);
//             ps.setInt(1,1);
//             ps.setString(2, itemName);
//             ps.setString(3, number);
//             ps.setString(4, mandalPinCode);
//             int i =   ps.executeUpdate();
//             if (i > 0) {
//                 System.out.println("success");
//                 System.out.println("Record is updated successfully......");
               
//                 // AdminDashboard ad =new AdminDashboard();
//                 // ad.setVisible(false);
//                 // ad.reload();
//             } else {
//                 System.out.println("stuck somewhere");
//             }
         
//         } catch (Exception e1) {
//             //TODO: handle exception
//         }
//     }
// }

