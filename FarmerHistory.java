import java.util.*;
import java.sql.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public  class FarmerHistory{
    
   JPanel panel=new JPanel(),mainPanel=new JPanel();
   int i=0;
   public int ist=0;
    FarmerHistory(String number,String mandalPinCode){
        System.out.println(" i am from farmer history and number is"+number);
        JButton b[];
      JPanel p[];
           p=new JPanel[100];
    //   p=new JPanel()
      b=new JButton[100];
     ImageIcon ic[];
     ic=new ImageIcon[100];
     JLabel icl[];
     icl=new JLabel[100];
     JLabel nl[];
     nl=new JLabel[100];
     JLabel cl[];
     cl=new JLabel[100];
     JLabel ql[];
     ql=new JLabel[100];
     JLabel al[];
     al=new JLabel[100];
    JButton c[];
    c=new JButton[100];

        
  try {
    //   mainPanel.repaint();
    //   mainPanel.revalidate();

    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","");  
    System.out.println("database connected");
    Statement stmt=con.createStatement();  
// ResultSet rs=stmt.executeQuery("select * from items where mandal_pincode=?");  
PreparedStatement statement = con.prepareStatement("select * from items where mandalPinCode = ? and MOBILE_NUMBER=?"); 
statement.setString(1,mandalPinCode);
statement.setString(2,number);

ResultSet rs = statement.executeQuery();
while(rs.next())  {
  
    System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+i); 
    p[i]=new JPanel();

    // b[i] = new JButton ("Button " + (i + 1));
    // b[i].setBounds(0,0,400,50);  
    // p[i].add(b[i]);
    // switch (i) {
    //     case 0:
    // p[i].setBackground(Color.black);
    // // p[i].setBounds(100,100,100,100);
    // // p[i].setLayout(null);
            
    //         break;
    //         case 1:
    // p[i].setBackground(Color.red);
            
    //         break;  
            
    //         case 2:
    // p[i].setBackground(Color.blue);
            
    //         break; 
    //           case 3:
            
    //         break;
    //            case 4:
            
    //         break;   
    //     default:
    //         break;
    // }
    ic[i]=new ImageIcon(rs.getString(6));
    icl[i]=new JLabel(ic[i]);
    icl[i].setBounds(300,40,200,230);
    p[i].add(icl[i]);

    JLabel co=new JLabel("Cost :");
    co.setBounds(550,120,100,20);
    co.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(co);

    nl[i]=new JLabel(rs.getString(1));
    nl[i].setBounds(550,60,200,50);
    nl[i].setFont(new Font("Times New Roman", Font.PLAIN, 36));
    p[i].add(nl[i]);
    
    cl[i]=new JLabel(rs.getString(3)+" Rs");
    cl[i].setBounds(620,105,100,50);
    cl[i].setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(cl[i]);
     
    ql[i]=new JLabel("Quantity : "+rs.getString(5)+" Kgs");
    ql[i].setBounds(550,150,200,50);
    ql[i].setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(ql[i]);
  
    // al[i]=new JLabel("Are you taken this item :");
    // al[i].setBounds(550,190,250,50);
    // al[i].setFont(new Font("Times New Roman", Font.PLAIN, 24));
    // p[i].add(al[i]);   
   
    // c[i]=new JButton("Yes");
    // c[i].setBounds(800,200,70,30);
    // c[i].setFont(new Font("Times New Roman", Font.PLAIN, 22));
    // p[i].add(c[i]);
    // c[i].addActionListener(new PageActionListener(i,rs.getString(1),rs.getString(4),rs.getString(7)));

    JLabel tl=new JLabel("Time :"+rs.getString(10));
    tl.setBounds(900,45,170,80);
    tl.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(tl);


    JLabel dl=new JLabel("Date :"+rs.getString(11));
    dl.setBounds(900,85,230,80);
    dl.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(dl);
 
    // try {
    //     PreparedStatement statement1 = con.prepareStatement("select * from farmersdata where mandalPinCode = ? and mobile_number=? "); 
    //     statement1.setString(1,rs.getString(7));
    //     statement1.setString(2,rs.getString(4));
    //     ResultSet rs1 = statement1.executeQuery();
    //     while(rs1.next()){
    //         System.out.println(rs1.getString(2));
            
    //     }
    // } catch (Exception e) {
    //     //TODO: handle exception
    // }
    
    p[i].setLayout(null);
    p[i].setPreferredSize(new Dimension(0, 300));
    panel.add(p[i]);  
    i=i+1;  
}
con.close(); 
// p=new JFrame();


  } catch (Exception e) {
      //TODO: handle exception
  }
  panel.add(Box.createVerticalGlue());
  JPanel t=new JPanel();
  t.setPreferredSize(new Dimension(0, 300));
  t.setLayout(null);
  panel.add(t);

  LayoutManager layout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);  
      panel.setLayout(layout);  
    //   panel.setVisible(true);
    JScrollPane scrollableTextArea = new JScrollPane(panel);  
  
    // scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
    scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
    //   panel.setBackground(Color.red);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //   panel.setBounds(0,0,screenSize.width, screenSize.height);
      scrollableTextArea.setBounds(0,0,screenSize.width,screenSize.height);
    mainPanel.add(scrollableTextArea);
    mainPanel.setVisible(true);
    mainPanel.setLayout(null);
    mainPanel.setBounds(0,0,screenSize.width, screenSize.height);
   
}  
public JPanel getPanel() {
    return mainPanel;
}

    public static void main(String[] args) {
        FarmerHistory af=new FarmerHistory("8520852085","522402");
        
    }
}

  class PageActionListener implements ActionListener {
    private int page;
    public String itemName;
    public String number;
    public String mandalPinCode;
    // public String itemName;

    public PageActionListener(int page,String itemName,String number,String mandalPinCode) {
        this.page = page;
        this.itemName=itemName;
        this.number=number;
        this.mandalPinCode=mandalPinCode;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("page is"+page+itemName+number+mandalPinCode);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");  
            System.out.println("database connected");
            String query = "update items set isTaken=? where item_name=? and MOBILE_NUMBER=? and mandalPinCode=? ";
            PreparedStatement  ps = con.prepareStatement(query);
            ps.setInt(1,1);
            ps.setString(2, itemName);
            ps.setString(3, number);
            ps.setString(4, mandalPinCode);
            int i =   ps.executeUpdate();
            if (i > 0) {
                System.out.println("success");
                System.out.println("Record is updated successfully......");
               
                // AdminDashboard ad =new AdminDashboard();
                // ad.setVisible(false);
                // ad.reload();
            } else {
                System.out.println("stuck somewhere");
            }
         
        } catch (Exception e1) {
            //TODO: handle exception
        }
    }
}

