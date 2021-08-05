import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SwingTester {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame frame = new JFrame("Swing Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(1560, 800);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   private static void createUI(final JFrame frame){  
      JPanel panel = new JPanel();
      JButton b[];
      JPanel p[];
           p=new JPanel[5];
    //   p=new JPanel()
      b=new JButton[5];
      String x[]=new String[5];
      x[0]="Color.black";
      x[1]="Color.red";
      x[2]="Color.blue";
      x[3]="Color.black";
      x[4]="Color.red";
    //   x=["black","red","blue","orange","black"];
      for (int i = 0;i<5;i++) {  
          p[i]=new JPanel();

        b[i] = new JButton ("Button " + (i + 1));
        b[i].setBounds(0,0,400,50);  
        // p[i].setBackground(x[i]);
        switch (i) {
            case 0:
        p[i].setBackground(Color.black);
        // p[i].setBounds(100,100,100,100);
        // p[i].setLayout(null);
                
                break;
                case 1:
        p[i].setBackground(Color.red);
                
                break;  
                
                case 2:
        p[i].setBackground(Color.blue);
                
                break; 
                  case 3:
                
                break;
                   case 4:
                
                break;   
            default:
                break;
        }

        p[i].add(b[i]);
        p[i].setLayout(null);
        panel.add(p[i]);  
      }  
  
      LayoutManager layout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);  
      panel.setLayout(layout);       
      
    //   panel.add(new JButton("One"));
    //   panel.add(new JButton("Two")); 
    //   panel.add(new JButton("Three"));
    //   panel.add(new JButton("Four"));         
      frame.getContentPane().add(panel);  

   }
}