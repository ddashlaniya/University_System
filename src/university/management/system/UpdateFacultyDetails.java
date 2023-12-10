package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

    public class UpdateFacultyDetails extends JFrame implements ActionListener {

    JTextField Tphone,Taddress;
    JLabel labelID, visiID,country, visicountry, Xmarks,Xllmarks;
    JLabel showdob,EduQua,department;
    JLabel showName,showfname,showEmail,showxmarks,showxllmarks;
    Choice sID;
    JButton update,cencel;
    
    UpdateFacultyDetails() {
        setSize(900, 680);
        setLocation(250, 40);
        setLayout(null);

        JLabel heading = new JLabel("Verify Faculty Details");
        heading.setBounds(350, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        add(heading);
        
        JLabel searchR = new JLabel("Search by Employee ID");
        searchR.setBounds(50,100,150,20);
        searchR.setFont(new Font("Tamoha",Font.BOLD,15));
        add(searchR);
        
        sID = new Choice();
        sID.setBounds(220,100,200,20);
        sID.setBackground(Color.white);
        add(sID);
        
        try{
            Connect c = new Connect();
            ResultSet rs = c.S.executeQuery("select * from Faculty");
            while(rs.next()){
                sID.add(rs.getString("Em_ID"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        JLabel lbname = new JLabel("Name");
        lbname.setBounds(50, 150, 100, 20);
        lbname.setFont(new Font("serif", Font.BOLD, 15));
        add(lbname);
        
        showName = new JLabel();
        showName.setBounds(160, 150, 150, 20);
        add(showName);

        JLabel lbfname = new JLabel("Father's Name");
        lbfname.setBounds(360, 150, 150, 20);
        lbfname.setFont(new Font("serif", Font.BOLD, 15));
        add(lbfname);

        showfname = new JLabel();
        showfname.setBounds(560, 150, 150, 20);
        add(showfname);

        labelID = new JLabel("Employee ID Number");
        labelID.setBounds(50, 200, 200, 20);
        labelID.setFont(new Font("serif", Font.BOLD, 15));
        add(labelID);

        visiID = new JLabel();
        visiID.setBounds(180, 200, 200, 20);
        visiID.setFont(new Font("serif", Font.BOLD, 15));
        add(visiID);
        
        JLabel calendar = new JLabel("Date Of Birth");
        calendar.setBounds(360, 200, 200, 20);
        calendar.setFont(new Font("serif",Font.BOLD,15));
        add(calendar);
        
        showdob = new JLabel();
        showdob.setBounds(560,200,170,20);
        add(showdob);
        
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
        
        showEmail = new JLabel();
        showEmail.setBounds(560,250,150,20);
        add(showEmail);
        
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

        showxmarks = new JLabel();
        showxmarks.setBounds(150,350,150,20);
        add(showxmarks);
        
        Xllmarks = new JLabel("Class Xll%");
        Xllmarks.setBounds(360,350,200,20);
        Xllmarks.setFont(new Font("serif",Font.BOLD,15));
        add(Xllmarks);
        
        showxllmarks = new JLabel();
        showxllmarks.setBounds(560,350,150,20);
        add(showxllmarks);

        JLabel Education = new JLabel("Educational");
        Education.setBounds(50,400,200,20);
        Education.setFont(new Font("serif",Font.BOLD,15));
        add(Education);
        
        //String Lcourse[]={"Select","B.Tech/BE","B.Pharma","BCA","BBA","B.sc","BA","MCA","M.Tech","M.Pharma","MBA","M.sc","MA"};
        EduQua = new JLabel();
        EduQua.setBounds(150,400,150,20);
        EduQua.setBackground(Color.white);
        add(EduQua);
        
        JLabel branch = new JLabel("Department");
        branch.setBounds(350,400,200,20);
        branch.setFont(new Font("serif",Font.BOLD,15));
        add(branch);
        
        //String Lbranch[]={"Select","Computer Science","Information Technology","Civi Engineering","Mechanical Engineering","EC","EX","Agriculture"};
        department = new JLabel();
        department.setBounds(560,400,150,20);
        department.setBackground(Color.white);
        add(department);
        
      try{
            Connect c = new Connect();
            String Query ="select * from Faculty where Em_ID='"+sID.getSelectedItem()+"'";
            ResultSet rs = c.S.executeQuery(Query);
            while(rs.next()){
                showName.setText(rs.getString("name"));
                showfname.setText(rs.getString("Fathers_name"));
                visiID.setText(rs.getString("Em_ID"));
                showdob.setText(rs.getString("Date_Of_Birth"));
                Tphone.setText(rs.getString("Phone"));
                showEmail.setText(rs.getString("Email"));
                visicountry.setText(rs.getString("Country"));
                Taddress.setText(rs.getString("Address"));
                showxmarks.setText(rs.getString("Class_X"));
                showxllmarks.setText(rs.getString("Class_Xll"));
                EduQua.setText(rs.getString("Education_Qua"));             
                department.setText(rs.getString("Department"));
                
            }          
            
            
        }catch(Exception e){
            e.printStackTrace();
    }
      sID.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent ie){
             try{
            Connect c = new Connect();
            String Query ="select * from Faculty where Em_ID='"+sID.getSelectedItem()+"'";
            ResultSet rs = c.S.executeQuery(Query);
            while(rs.next()){
                showName.setText(rs.getString("name"));
                showfname.setText(rs.getString("Fathers_name"));
                visiID.setText(rs.getString("Em_ID"));
                showdob.setText(rs.getString("Date_Of_Birth"));
                Tphone.setText(rs.getString("Phone"));
                showEmail.setText(rs.getString("Email"));
                visicountry.setText(rs.getString("Country"));
                Taddress.setText(rs.getString("Address"));
                showxmarks.setText(rs.getString("Class_X"));
                showxllmarks.setText(rs.getString("Class_Xll"));
                EduQua.setText(rs.getString("Education_Qua"));             
                department.setText(rs.getString("Department"));
                
            }          
            
            
        }catch(Exception e){
            e.printStackTrace();
    }
           }
       });
                
                     
            
    
        //Update button and Cencel
       update = new JButton("Update");
       update.setBounds(140,500,150,30);
       update.setForeground(Color.white);
       update.setBackground(Color.black);
       update.setFont(new Font("Tamoha",Font.BOLD,15));
       update.addActionListener(this);
       add(update);
       
       cencel = new JButton("Cencel");
       cencel.setBounds(340,500,150,30);
       cencel.setForeground(Color.white);
       cencel.setBackground(Color.black);
       cencel.setFont(new Font("serif",Font.BOLD,15));
       cencel.addActionListener(this);
       add(cencel);
       
        setVisible(true);
       
    }
        
       public void actionPerformed(ActionEvent ae){
           
            if(ae.getSource()==update){
            String EmID = visiID.getText();
            String phone = Tphone.getText();
            String address = Taddress.getText();
            
            try{
                String Query="update Faculty set Where Em_ID='"+EmID+"' Address='"+address+"' , Phone='"+phone+"' ";  //where roll= '"+rollno+"
                Connect c = new Connect();
                c.S.executeUpdate(Query);
               
                JOptionPane.showMessageDialog(null,"Faculty Details Verify Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            } else{
                setVisible(false);
            }
     
    }
    public static void main(String args[]) {
        new UpdateFacultyDetails();
    }
}
