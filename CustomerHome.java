import java.util.*;
import java.sql.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ScrollPaneConstants;
public  class CustomerHome{
    
   JPanel panel=new JPanel(),mainPanel=new JPanel();
   int i=0,length=0;
   public int ist=0;
   AddToCart at[]=new AddToCart[100];
   JLabel cn1;
  //  public AddToCart[] returnCartItems(){
  //            return at;
  //  }
    CustomerHome(String mandalPinCode,JLabel cn,AddToCart at[]){
      this.cn1=cn;
      
      this.at=at;
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
    JButton atc[];
    atc=new JButton[100];
    String country1[][]=new String[20][20];
    JComboBox cb1[];
    cb1=new JComboBox[100];
    // JButton addl[];
    // addl=new JButton[100];
        
  try {
    //   mainPanel.repaint();
    //   mainPanel.revalidate();
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test1","root","");  
    System.out.println("database connected");
    Statement stmt=con.createStatement();  
// ResultSet rs=stmt.executeQuery("select * from items where mandal_pincode=?");  
PreparedStatement statement = con.prepareStatement("select * from items where mandalPinCode = ? and isTaken=?"); 
statement.setString(1,mandalPinCode);
statement.setInt(2,1);
ResultSet rs = statement.executeQuery();
while(rs.next())  {
    at[i]=new AddToCart(i,rs.getString(1),rs.getString(4),rs.getString(7),rs.getString(3),0);
    System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+i+"type is "+rs.getClass().getName()); 
    p[i]=new JPanel();
    ic[i]=new ImageIcon(rs.getString(6)); 
    icl[i]=new JLabel(ic[i]);
    icl[i].setBounds(200,40,200,230);
    p[i].add(icl[i]);

    JLabel co=new JLabel("Cost :");
    co.setBounds(450,120,100,20);
    co.setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(co);

    nl[i]=new JLabel(rs.getString(1));
    nl[i].setBounds(450,60,200,50);
    nl[i].setFont(new Font("Times New Roman", Font.PLAIN, 36));
    p[i].add(nl[i]);
    
    cl[i]=new JLabel(rs.getString(3)+" Rs");
    cl[i].setBounds(520,105,100,50);
    cl[i].setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(cl[i]);
     
    ql[i]=new JLabel("In Stock");
    // ql[i]=new JLabel("("+rs.getString(5)+" Kgs" +" Left )");
    ql[i].setBounds(450,150,200,50);
    ql[i].setFont(new Font("Times New Roman", Font.PLAIN, 26));
    p[i].add(ql[i]);
     
    atc[i]=new JButton("Add to cart");
    atc[i].setBounds(450,210,150,40);
    atc[i].setBackground(Color.black);
    atc[i].setForeground(Color.white);
    atc[i].setFont(new Font("Times New Roman", Font.PLAIN, 20));
    atc[i].addActionListener(new PageActionListener(i,rs.getString(1),rs.getString(4),rs.getString(7),atc[i],at,cn1));
    p[i].add(atc[i]);
    
    String country[]={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(630, 210,50,40);  

    p[i].add(cb);  
    //  for(int k=1;k<Integer.valueOf(rs.getString(5));k++){
    //     country1[i][k]=String.valueOf(k);
    //  }
    // cb1[i]=new JComboBox(country1[i]);
    // cb1[i].setBounds(630, 210,50,40);
    // p[i].add(cb1[i]);  

    
    p[i].setLayout(null);
    p[i].setPreferredSize(new Dimension(0, 300));
    panel.add(p[i]);  
    i=i+1;
    length=length+1;  
    
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

//   LayoutManager layout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);  
      panel.setLayout(new GridLayout(0, 2));  
    //   panel.setVisible(true);
    JScrollPane scrollableTextArea = new JScrollPane(panel);  
  
    // scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
    scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
    //   panel.setBackground(Color.red);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //   panel.setBounds(0,0,screenSize.width, screenSize.height);
      scrollableTextArea.setBounds(150,0,screenSize.width-300,screenSize.height);
     
    mainPanel.add(scrollableTextArea);
    mainPanel.setVisible(true);
    mainPanel.setLayout(null);
    mainPanel.setBounds(0,0,screenSize.width, screenSize.height);
   

}  
public JPanel getPanel() {
    return mainPanel;
}
   
      
    public static void main(String[] args) {
        // CustomerHome af=new CustomerHome("522402",);
        
    }
   
}

  class PageActionListener  implements ActionListener  {
    private int page;
    public String itemName;
    public String number;
    public String mandalPinCode;
    JButton alert;
    AddToCart at[];
    int length;
    int totalQty=0;
    JLabel cn2;


    // public String itemName;

    public PageActionListener(int page,String itemName,String number,String mandalPinCode,JButton b,AddToCart at[],JLabel cn1) {
        this.page = page;
        this.itemName=itemName;
        this.number=number;
        this.mandalPinCode=mandalPinCode;
        this.alert=b;
        this.at=at;
        // this.length=length;
        this.cn2=cn1;
    }

    public void actionPerformed(ActionEvent e) {
      at[page].increaseqty();
      // int x=at[page].returnqty();
      // totalQty=totalQty+1;
      // System.out.println("x is"+x);
      totalQty=0;
      for(int k=0;k<at.length;k++){
          try {
          totalQty=totalQty+at[k].returnqty();

          // System.out.println("see bro"+at[k].returnqty());
            
          } catch (Exception e1) {
            // System.out.println("something err"+e1);
            //TODO: handle exception
          }
      }
      // CustomerCart cc=new CustomerCart();
      // cc.getCartItems(at);
      
        JOptionPane.showMessageDialog(alert, "successfully added it to cart");

        // System.out.println("length is"+length);
        // CustomerDashboard cd=new CustomerDashboard();
        // cd.setCart(totalQty);
        // CustomerCart cc=new CustomerCart("522401");
        // cc.setTextOfLabel(page,at[page].returnqty());
        // cc.test();
        cn2.setText(String.valueOf(totalQty));
        // cd.cn.setText("1");
        // System.out.println("total quantity is "+totalQty);

     
    }
}

