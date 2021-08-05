  import java.awt.*;  
  import java.awt.event.*;  

  // import java.awt.*t;
  import java.awt.event.ActionListener;
  import javax.swing.*;  
  import java.awt.image.BufferedImage;
  import java.io.File;    
  import javax.swing.ImageIcon;
  import javax.imageio.ImageIO;
  import java.io.File;
  import java.io.IOException;
  import java.sql.*;
  import java.text.SimpleDateFormat;  
  import java.util.Date;
  import java.awt.image.BufferedImage;
  import java.time.LocalTime;
  class imageLoad extends Canvas  
  {  
  Image img;  
  public imageLoad(Image img)  
  {  
    this.img = img;  
  }  
  public void paint(Graphics g)  
  {  
    if (img != null)  
    {  
    g.drawImage(img,730,100,400,300, this);  
    }  
  }  
  public void setImage(Image img)  
  {  
    this.img = img;  
  }  
  } 
  public class FarmerDashboardHome extends Canvas implements ActionListener {
      public JPanel f=new JPanel();
      // DecidePage d=new DecidePage();
      JLabel a;
      String d ;
      String country[]={"vegetables","fruits","grains","flour"};    
      Image Image1;  
      imageLoad Canvas1;
      FileDialog fd = new FileDialog(new JFrame(), "Open", FileDialog.LOAD);
      int x=0;
      JPanel is;
      JTextField  itemName,cost1 ,qty1;
      JComboBox cb;
      // System.out.println("i am from farmer dashboard home and your mobile no is"+number);
      
      FarmerDashboardHome(String number,String mandalPinCode){
        // System.out.println("i am from farmer dashboard home and your mobile no is"+number);
      

          ImageIcon icon = new ImageIcon("uploadimage.png");
        JLabel label = new JLabel(icon);
        label.setBounds(730,100,400,300);

        f.add(label);
        
        a=new JLabel("Add an item");
        a.setBounds(850,50,200,20);
        a.setFont(new Font("Calibri", Font.BOLD, 30));
        a.setForeground(Color.blue);
      
          f.add(a);
      
        JLabel lblName = new JLabel("Item Name");
          lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
          lblName.setBounds(520, 440, 120, 43);
          f.add(lblName);
            itemName = new JTextField();
          itemName.setFont(new Font("Tahoma", Font.PLAIN, 20));
          itemName.setBounds(650, 440, 228, 50);
          f.add(itemName);
          itemName.setColumns(10);
          JLabel Category1 = new JLabel("Category");
          Category1.setFont(new Font("Tahoma", Font.PLAIN, 20));
          Category1.setBounds(950, 440, 120, 43);
          f.add(Category1);
          cb=new JComboBox(country);    
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
            cost1 = new JTextField();
          cost1.setFont(new Font("Tahoma", Font.PLAIN, 20));
          cost1.setBounds(650, 525, 228, 50);
          f.add(cost1);
          cost1.setColumns(10);
          JLabel qty = new JLabel("Quantity");
          qty.setFont(new Font("Tahoma", Font.PLAIN, 20));
          qty.setBounds(950, 525, 120, 43);
          f.add(qty);
          JLabel kg1 = new JLabel("(In kgs)");
          kg1.setFont(new Font("Tahoma", Font.PLAIN, 14));
          kg1.setBounds(950, 540, 120, 43);
          f.add(kg1);
            qty1 = new JTextField();
          qty1.setFont(new Font("Tahoma", Font.PLAIN, 20));
          qty1.setBounds(1050, 525, 228, 50);
          f.add(qty1);
          JButton submit=new JButton("Submit");
          submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
          submit.setBounds(820,650,200,50);
          submit.setBackground(Color.black);
          submit.setForeground(Color.white);
          // submit.addActionListener(this);  
          f.add(submit);
          qty1.setColumns(10);

          Canvas1 = new imageLoad(null);  
          Canvas1.setSize(6000,1500);  
          f.add(Canvas1);


        f.setLayout(null);
        f.setVisible(true);
        label.addMouseListener(new MouseAdapter()  
        {  
            public void mouseClicked(MouseEvent e)  
            {  
                //  System.out.println("hello clicking"+"time is"+java.time.LocalTime.now()+String.valueOf(java.time.LocalTime.now()));

                imageload(); 
                label.setVisible(false);
                
              //    label.setText("");
              //    x=1;
            // //   f.dispose();
            //   lo.setOpaque(true);
            // //   h.setOpaque(false);
            //   lo.setBackground(Color.white); 
            // //   do.setVisible(true);
            }  
        });
        submit.addActionListener( new ActionListener( ) {
          public void actionPerformed( ActionEvent e )
          {
          System.out.println("submit clicking"+"time is"+java.time.LocalTime.now()+"in stirngs "+String.valueOf(java.time.LocalTime.now()));

            String itemName1=itemName.getText();
            String category2=String.valueOf(cb.getSelectedItem());
            String Cost2=cost1.getText();
            String Quantity2=qty1.getText();
            String mobileNumber=number;
            String mandalPinCode1=mandalPinCode;
            String imgPath=d;
            try {
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test1", "root", "");
      
              String query = "INSERT INTO items values('" + itemName1 + "','" + category2 + "','" + Cost2 + "','" + mobileNumber + "','" +
              Quantity2 + "','" + imgPath + "','" + mandalPinCode1 + "','" + 0 + "','" + 0 + "','" + String.valueOf(java.time.LocalTime.now()) + "','" + String.valueOf(java.time.LocalDate.now()) + "')";
      
              Statement sta = connection.createStatement();
              int x = sta.executeUpdate(query);
              if (x == 0) {
                  JOptionPane.showMessageDialog(submit, "something problem");
              } else {
                  JOptionPane.showMessageDialog(submit,
                      "Item added succsessfully");
                      Canvas1.setVisible(false);
                      label.setVisible(true);
                      cost1.setText("");
                      qty1.setText("");
                      itemName.setText("");

              }
              connection.close();
          } catch (Exception exception) {
              exception.printStackTrace();
          }

            System.out.println( mandalPinCode+number +"d iss ..."+d);
          }
        });
      }


      void imageload()  
      {  
      fd.show();  
      if (fd.getFile() == null)  
      {  
        // label.setVisible(true);

      //   Label1.setText("You have not select");  
      } else  
      {  
        d = (fd.getDirectory() + fd.getFile());  
        // d.replaceAll("\", "\\");
        d=d.replaceAll("\\\\","\\\\\\\\");
        System.out.println("directory is "+d+d.getClass().getName());

        Toolkit toolkit = Toolkit.getDefaultToolkit();  
        Image1 = toolkit.getImage(d);  
        Canvas1.setImage(Image1);
        System.out.println(Image1+d);  
        Canvas1.repaint();  
      }  
          }  
      public JPanel getPanel() {
          return f;
      }
      public void actionPerformed(ActionEvent e){  
          // tf.setText("Welcome to Javatpoint.");  
        System.out.println("submit button clicked and d is"+d+itemName.getText()+cb.getSelectedItem()+"e is"+e);  
  }  

  public static void main(String args[]) {
    

      FarmerDashboardHome fd=   new FarmerDashboardHome("abc","a");

  }
  }