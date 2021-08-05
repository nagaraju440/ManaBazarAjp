
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

public class FarmerLoginPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    public JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FarmerLoginPage frame = new FarmerLoginPage();
                    frame.setBackground(Color.decode("#ADD8E6"));
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void disposeFarmerDashboard(){
        System.out.println("farmer logged out");
        contentPane.setVisible(false);
    }

    /**
     * Create the frame.
     */
    public FarmerLoginPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon icon = new ImageIcon("farmerimg.png");
        JLabel label = new JLabel(icon);
        label.setBounds(700,70,500,300);
        contentPane.add(label);


        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        lblNewLabel.setBounds(880, 400, 273, 83);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
        textField.setBounds(920, 500, 281, 48);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
        passwordField.setBounds(920, 620, 281, 48);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(720, 500, 193, 42);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(720, 620, 193, 42);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(850, 720, 162, 53);
        btnNewButton.setBackground(Color.black);
        btnNewButton.setForeground(Color.white);

        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userName = textField.getText() ;
                String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test1",
                        "root", "");

                    PreparedStatement st = (PreparedStatement) connection
                        // .prepareStatement( "Select user_name, password from farmersdata where user_name = '" + userName + "'");
                        .prepareStatement("Select * from farmersdata where user_name=? and password=?");


                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    System.out.println("you enterd this"+userName+password);

                    if (rs.next()) {
                        // dispose();
                        // FarmerDashboard fh=new FarmerDashboard();
                        // fh.setVisible(true);
                        // FarmerLoginPage fl=new FarmerLoginPage();
                        // fl.setVisible(true);
                        // FarmerDashboard fh1=new FarmerDashboard();
                        // fh1.setVisible(true);
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                          DecidePage dp=new DecidePage();
                          dp.test1(String.valueOf(rs.getString("mobile_number")),String.valueOf(rs.getString("mandalPinCode")));
                        
                        // UserHome ah = new UserHome(userName);
                        // ah.setTitle("Welcome");

                        // ah.setVisible(true);rs.getString("user_name")
                        System.out.println(rs.getString("user_name")+rs.getString("password"));
                    } 
                    else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
        contentPane.setBackground(Color.decode("#FFFF66"));

    }
   
}
