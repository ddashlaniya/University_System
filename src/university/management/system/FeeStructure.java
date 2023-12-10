package university.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class FeeStructure extends JFrame {
     JButton done;
    FeeStructure(){
        setSize(700,500);
        setLocation(300,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        JLabel hading = new JLabel("Courses & Fees ");
        hading.setBounds(10,20,250,35);
        hading.setFont(new Font("tamoha",Font.PLAIN,25));
        add(hading);
        
        JTable tb = new JTable();
        try{
            Connect c = new Connect();
            ResultSet rs = c.S.executeQuery("select * from Fees");
            tb.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(tb);
        
        sp.setBounds(0,70,700,400);
        add(sp);
       
        setVisible(true);
    }    
    public static void main(String args[]){
        new FeeStructure();
    }

    
}
