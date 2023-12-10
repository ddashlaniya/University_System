package university.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
               
             JButton login,cencel;
             JTextField TUsername;
             JPasswordField PUsername;
    Login() {
        //Background Color
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        setLocation(310, 200);
       setSize(600, 400);
        
         //user name
       JLabel LoUsername = new JLabel("Username");
        add(LoUsername);
        LoUsername.setBounds(40,20,100,20);
        
       TUsername = new JTextField();
       TUsername.setBounds(150,20,150,20);
       add(TUsername);
       
       // password
       JLabel LoPassword = new JLabel("Password");
        add(LoPassword);
        LoPassword.setBounds(40,80,100,20);
        
       PUsername = new JPasswordField();
       PUsername.setBounds(150,80,150,20);
       add(PUsername);
       
       //Login button and Cencel Button
       login = new JButton("Login");
       login.setBounds(40,160,120,30);
       login.setForeground(Color.white);
       login.setBackground(Color.black);
       login.setFont(new Font("Tamoha",Font.BOLD,15));
       login.addActionListener(this);
       add(login);
       cencel = new JButton("Cencel");
       cencel.setBounds(190,160,120,30);
       cencel.setForeground(Color.white);
       cencel.setBackground(Color.black);
       cencel.setFont(new Font("Tamoha",Font.BOLD,15));
       cencel.addActionListener(this);
     //   login.setFont(new Font("Tahoma", Font.BOLD, 15));
       add(cencel);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(350, 0, 200, 200);
        add(Image);
       
      
       setVisible(true);
       
        
    }
             @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == login){
            String username= TUsername.getText();
            String password=PUsername.getText();
            String query="select * from login where username='"+username+"'and password='"+password+"'";
            
            try{
                //SQL Server connection
                Connect c = new Connect();
                ResultSet rs=c.S.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Project();
                 }
                else{
                    JOptionPane.showMessageDialog(null,"Invailid Username or Password");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
          
          
      }
        else if (ae.getSource()== cencel)
    {
        setVisible(false);
    }
    }
    public static void main(String[] args) {
        // Both are method same for creating object
        //  new Login();
        Login Lg = new Login();
    }
}
