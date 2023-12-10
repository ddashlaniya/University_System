package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;
import java.awt.event.*;

    public class StudentRegistration extends JFrame implements ActionListener {

//    private static void JTextFields(String a_) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    JTextField tname, tfname,txmarks,txllmarks,Tphone,Tmail,Taddress;
    JLabel labelroll, visiroll,country, visicountry, Xmarks,Xllmarks;
    JDateChooser dob;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 90000L) + 1000L);
    JComboBox Cocourse,branchName;
    JButton submit, cencel,reset;

    StudentRegistration() {
        setSize(900, 680);
        setLocation(250, 40);
        setLayout(null);

        JLabel heading = new JLabel("Students Registration");
        heading.setBounds(350, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        add(heading);

        JLabel lbname = new JLabel("Name");
        lbname.setBounds(50, 150, 100, 20);
        lbname.setFont(new Font("serif", Font.BOLD, 15));
        add(lbname);
        tname = new JTextField();
        tname.setBounds(160, 150, 150, 20);
        add(tname);

        JLabel lbfname = new JLabel("Father's Name");
        lbfname.setBounds(360, 150, 150, 20);
        lbfname.setFont(new Font("serif", Font.BOLD, 15));
        add(lbfname);

        tfname = new JTextField();
        tfname.setBounds(560, 150, 150, 20);
        add(tfname);

        labelroll = new JLabel("Roll Number");
        labelroll.setBounds(50, 200, 200, 20);
        labelroll.setFont(new Font("serif", Font.BOLD, 15));
        add(labelroll);

        visiroll = new JLabel("20230" + first4);
        visiroll.setBounds(180, 200, 200, 20);
        visiroll.setFont(new Font("serif", Font.BOLD, 15));
        add(visiroll);
        
        JLabel calendar = new JLabel("Date Of Birth");
        calendar.setBounds(360, 200, 200, 20);
        calendar.setFont(new Font("serif",Font.BOLD,15));
        add(calendar);
        
        dob = new JDateChooser();
        dob.setBounds(560,200,170,20);
        add(dob);
        
        JLabel phnumber = new JLabel("Phone Number");
        phnumber.setBounds(50,250,200,20);
        phnumber.setFont(new Font("serif",Font.BOLD,15));
        add(phnumber);
        
        Tphone = new JTextField();
        Tphone.setBounds(160,250,150,20);
        add(Tphone);
        
        JLabel mail = new JLabel("Email");
        mail.setBounds(360, 250, 150, 20);
        mail.setFont(new Font("serif",Font.BOLD,15));
        add(mail);
        
        Tmail = new JTextField();
        Tmail.setBounds(560,250,150,20);
        add(Tmail);
        
        country = new JLabel("Country");
        country.setBounds(50, 300, 200, 20);
        country.setFont(new Font("serif", Font.BOLD, 15));
        add(country);

        visicountry = new JLabel("India");
        visicountry.setBounds(160, 300, 200, 20);
        visicountry.setFont(new Font("serif", Font.BOLD, 15));
        add(visicountry);
        
        JLabel address = new JLabel("Address");
        address.setBounds(360,300,200,20);
        address.setFont(new Font("serif",Font.BOLD,15));
        add(address);
        
        Taddress = new JTextField();
        Taddress.setBounds(560,300,150,20);
        add(Taddress);
        
        Xmarks = new JLabel("Class X%");
        Xmarks.setBounds(50, 350, 200, 20);
        Xmarks.setFont(new Font("serif", Font.BOLD, 15));
        add(Xmarks);

        txmarks = new JTextField();
        txmarks.setBounds(150,350,150,20);
        add(txmarks);
        
        Xllmarks = new JLabel("Class Xll%");
        Xllmarks.setBounds(360,350,200,20);
        Xllmarks.setFont(new Font("serif",Font.BOLD,15));
        add(Xllmarks);
        
        txllmarks = new JTextField();
        txllmarks.setBounds(560,350,150,20);
        add(txllmarks);

        JLabel courses = new JLabel("Course");
        courses.setBounds(50,400,200,20);
        courses.setFont(new Font("serif",Font.BOLD,15));
        add(courses);
        
        String Lcourse[]={"Select","B.Tech/BE","B.Pharma","BCA","BBA","B.sc","BA","MCA","M.Tech","M.Pharma","MBA","M.sc","MA"};
        Cocourse = new JComboBox(Lcourse);
        Cocourse.setBounds(150,400,150,20);
        Cocourse.setBackground(Color.white);
        add(Cocourse);
        
        JLabel branch = new JLabel("Branch");
        branch.setBounds(350,400,200,20);
        branch.setFont(new Font("serif",Font.BOLD,15));
        add(branch);
        
        String Lbranch[]={"Select","Computer Science","Information Technology","Civi Engineering","Mechanical Engineering","EC","EX","Agriculture"};
        branchName = new JComboBox(Lbranch);
        branchName.setBounds(560,400,150,20);
        branchName.setBackground(Color.white);
        add(branchName);
        
        JLabel username = new JLabel("Password");
        username.setBounds(50,450,200,15);
        username.setFont(new Font("serif", Font.BOLD,15));
        add(username);
        
        JTextField User = new JTextField();
        User.setBounds(150, 450, 150, 20);
        add(User);
        
        JLabel reEnter = new JLabel("Re - Password");
        reEnter.setBounds(350,450,150,15);
        reEnter.setFont(new Font("serif", Font.BOLD,15));
        add(reEnter);
        
        JTextField T_Enter = new JTextField();
        T_Enter.setBounds(560, 450, 150, 20);
        add(T_Enter);
        
        //submit button, Cencel and reset Button
       submit = new JButton("Submit");
       submit.setBounds(140,500,150,30);
       submit.setForeground(Color.white);
       submit.setBackground(Color.black);
       submit.setFont(new Font("Tamoha",Font.BOLD,15));
       submit.addActionListener(this);
       add(submit);
       
       cencel = new JButton("Cencel");
       cencel.setBounds(340,500,150,30);
       cencel.setForeground(Color.white);
       cencel.setBackground(Color.black);
       cencel.setFont(new Font("serif",Font.BOLD,15));
       cencel.addActionListener(this);
       add(cencel);
       
       reset = new JButton("Reset");
       reset.setBounds(540,500,150,30);
       reset.setForeground(Color.white);
       reset.setBackground(Color.black);
       reset.setFont(new Font("serif",Font.BOLD,15));
       reset.addActionListener(this);
       add(reset);
         setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name= tname.getText();
            String Fathername= tfname.getText();
            String roll= visiroll.getText();
            String birthdate = ((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String phone = Tphone.getText();
            String Mail = Tmail.getText();
            String Country= visicountry.getText();
            String Address=Taddress.getText();
            String X = txmarks.getText();
            String Xll=txllmarks.getText();
            String Course=(String)Cocourse.getSelectedItem();
            String stobranch=(String)branchName.getSelectedItem();
            
            
            try{
                String Query ="insert into Students value('"+name+"','"+Fathername+"','"+roll+"','"+birthdate+"','"+phone+"','"+Mail+"','"+Country+"','"+Address+"','"+X+"','"+Xll+"','"+Course+"','"+stobranch+"')";
                
                Connect con =new Connect();
                con.S.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Registration Successfully");
               // setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            setVisible(false);
        }else if(ae.getSource()== reset){
         
//            StudentRegistration.JTextFields(" ");
              tname.setText("");
         
        }else{
            setVisible(false);
        }
        
    }
    public static void main(String args[]) {
        new StudentRegistration();
    }
     private static void JTextFields(String a_) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
