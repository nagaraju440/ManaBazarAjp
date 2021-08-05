import java.awt.*;  
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class DecidePage extends JPanel  {  
JFrame mainFrame;  
CardLayout card;
JPanel pane1, pane2, pane3, cardPane;

public void DecidePageCon(){ 
    // .......................first page......................
    DecideOne f=new DecideOne();
    DecideTwo f1=new DecideTwo();

    mainFrame=new JFrame("Decide Page"); 
    // ..........................signupfarmer page...........................................

    
    cardPane = new JPanel();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    mainFrame.setBounds(0,0,screenSize.width, screenSize.height);
    card = new CardLayout();
    cardPane.setLayout(card);
    cardPane.add(f.getPanel(), "First Pane");
    cardPane.add(f1.getPanel(), "second Pane");
    mainFrame.add(cardPane);
    mainFrame.setVisible(true);
}
    public void test1(String number,String mandalPinCode){
      
        FarmerDashboard fh=new FarmerDashboard(number,mandalPinCode);
     

        // fh.setVisible(true);
    }
public void test(){
    FarmerLoginPage fl=new FarmerLoginPage();
    fl.setVisible(true);
    // DecideOne f=new DecideOne();
    // // DecideTwo f1=new DecideTwo();
    // // farmerSignUpPage fs=new farmerSignUpPage();
    // mainFrame=new JFrame("Decide Page"); 
    // // ..........................signupfarmer page...........................................

    
    // cardPane = new JPanel();
    // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    // mainFrame.setBounds(0,0,screenSize.width, screenSize.height);
    // card = new CardLayout();
    // cardPane.setLayout(card);
    // cardPane.add(f.getPanel(), "First Pane");
    // // cardPane.add(fs.getPanel(), "second Pane");
    // mainFrame.add(cardPane);
    // mainFrame.setVisible(true);
    // return 
    // System.out.println("hello");
    // return (
        // card.show(cardPane,"second Pane");
    // JOptionPane.showMessageDialog(mainFrame,"Hello, Welcome to Javatpoint.") ;

    // );

}

public void farmerUp(){
    DecideOne f=new DecideOne();
    // DecideTwo f1=new DecideTwo();
    FarmerSignUpPage fs=new FarmerSignUpPage();
    fs.setVisible(true);
    // mainFrame=new JFrame("Decide Page"); 
    // // ..........................signupfarmer page...........................................

    
    // cardPane = new JPanel();
    // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    // mainFrame.setBounds(0,0,screenSize.width, screenSize.height);
    // card = new CardLayout();
    // cardPane.setLayout(card);
    // cardPane.add(f.getPanel(), "First Pane");
    // cardPane.add(fs.getPanel(), "second Pane");
    // mainFrame.add(cardPane);
    // mainFrame.setVisible(true);
    // // return 
    // // System.out.println("hello");
    // // return (
    //     card.show(cardPane,"second Pane");
    // JOptionPane.showMessageDialog(mainFrame,"Hello, Welcome to Javatpoint.") ;

    // );

}
public void CustomerUp(){
    DecideOne f=new DecideOne();
    // DecideTwo f1=new DecideTwo();
    CustomerSignUpPage fs=new CustomerSignUpPage();
    fs.setVisible(true);
    // mainFrame=new JFrame("Decide Page"); 
    // // ..........................signupfarmer page...........................................
    // cardPane = new JPanel();
    // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    // mainFrame.setBounds(0,0,screenSize.width, screenSize.height);
    // card = new CardLayout();
    // cardPane.setLayout(card);
    // cardPane.add(f.getPanel(), "First Pane");
    // cardPane.add(fs.getPanel(), "customerSignUp");
    // mainFrame.add(cardPane);
    // mainFrame.setVisible(true);
    // // return 
    // // System.out.println("hello");
    // // return (
    //     card.show(cardPane,"customerSignUp");
    // // JOptionPane.showMessageDialog(mainFrame,"Hello, Welcome to Javatpoint.") ;

    // // );

}
public void  customerlogin(){
    customerLoginPage cl=new customerLoginPage();
    cl.setVisible(true);
}
public static void main(String[] args) {  
   DecidePage dp= new DecidePage();  
   dp.DecidePageCon();
}  
}  




// https://stackoverflow.com/questions/11512232/including-a-panel-from-external-java-file/11512368