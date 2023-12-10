package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class StudentDetails extends JFrame {
    Choice sroll;
    JTable table;
    
    StudentDetails(){
        getContentPane().setBackground(Color.white);
        setSize(900,700);
        setLocation(300,100);
        setLayout(null);
        
        JLabel searchR = new JLabel("Search by Rollnumber");
        searchR.setBounds(20,20,150,20);
        //searchR.setFont(new Font("Tamoha",Font.BOLD,15));
        add(searchR);
        
        sroll = new Choice();
        sroll.setBounds(220,100,200,20);
        //sroll.setBackground(Color.white);
        add(sroll);
        
        try{
            Connect C = new Connect();
            ResultSet rs = C.S.executeQuery("select * from Students");
            while(rs.next()){
                sroll.add(rs.getString("roll"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    public static void main(String args[]){
     new StudentDetails();   
    }
    
}

