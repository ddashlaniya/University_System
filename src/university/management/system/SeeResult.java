package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class SeeResult extends JFrame implements ActionListener{
    String rollno;
    JButton cencel;
    SeeResult(String rollno){
          setSize(800,600);
          setLocation(250,100);
          setLayout(null);
          
          JLabel heading = new JLabel("Rajiv Gandhi Prodyogiki Vishwavidhalaya");
          heading.setBounds(190, 10, 500, 50);
          heading.setFont(new Font("serif", Font.BOLD, 20));
          add(heading);
          
          JLabel subheading = new JLabel("Result of Examination Session 2023");
          subheading.setBounds(220, 50, 500, 20);
          subheading.setFont(new Font("serif", Font.PLAIN, 15));
          add(subheading);
         
          
          JLabel name = new JLabel("Name of Student");
          name.setBounds(10, 120, 150, 20);
          name.setFont(new Font("serif", Font.PLAIN, 20));
          add(name);
          
         
          JLabel semester = new JLabel("Semester");
          semester.setBounds(10, 150, 150, 20);
          semester.setFont(new Font("serif", Font.PLAIN, 20));
          add(semester);
          
          JLabel roll = new JLabel("Roll No. "+rollno);
          roll.setBounds(10, 180,300 , 20);
          roll.setFont(new Font("serif", Font.PLAIN, 20));
          add(roll);
          
          JLabel Subject = new JLabel("Subject");
          Subject.setBounds(100, 230, 150, 20);
          Subject.setFont(new Font("serif", Font.PLAIN, 20));
          add(Subject);

          JLabel sub1 = new JLabel();
          sub1.setBounds(100,250,150,150);
          sub1.setFont(new Font("serif",Font.PLAIN,20));
          add(sub1);
          
          JLabel sub2 = new JLabel();
          sub2.setBounds(100,270,150,150);
          sub2.setFont(new Font("serif",Font.PLAIN,20));
          add(sub2);
          
          JLabel sub3 = new JLabel();
          sub3.setBounds(100,290,150,150);
          sub3.setFont(new Font("serif",Font.PLAIN,20));
          add(sub3);
          
          JLabel sub4 = new JLabel();
          sub4.setBounds(100,310,150,150);
          sub4.setFont(new Font("serif",Font.PLAIN,20));
          add(sub4);
          
          JLabel sub5 = new JLabel();
          sub5.setBounds(100,330,150,150);
          sub5.setFont(new Font("serif",Font.PLAIN,20));
          add(sub5);
          
          JLabel Marks = new JLabel("Marks");
          Marks.setBounds(420, 230, 150, 20);
          Marks.setFont(new Font("serif", Font.PLAIN, 20));
          add(Marks);
          
          JLabel mark1 = new JLabel();
          mark1.setBounds(420,250,150,150);
          mark1.setFont(new Font("serif",Font.PLAIN,20));
          add(mark1);
          
          JLabel mark2 = new JLabel();
          mark2.setBounds(420,270,150,150);
          mark2.setFont(new Font("serif",Font.PLAIN,20));
          add(mark2);
          
          JLabel mark3 = new JLabel();
          mark3.setBounds(420,290,150,150);
          mark3.setFont(new Font("serif",Font.PLAIN,20));
          add(mark3);
          
          JLabel mark4 = new JLabel();
          mark4.setBounds(420,310,150,150);
          mark4.setFont(new Font("serif",Font.PLAIN,20));
          add(mark4);
          
          JLabel mark5 = new JLabel();
          mark5.setBounds(420,330,150,150);
          mark5.setFont(new Font("serif",Font.PLAIN,20));
          add(mark5);
          
          try{
             // Get student marks in two deferent tables , Subject and Marks
             Connect c = new Connect();
            
            ResultSet rs1 = c.S.executeQuery("select * from Subjects where Roll_No = '"+roll+"'");
            while(rs1.next()) {
                sub1.setText(rs1.getString("Subject_1"));
                sub2.setText(rs1.getString("Subject_2"));
                sub3.setText(rs1.getString("Subject_3"));
                sub4.setText(rs1.getString("Subject_4"));
                sub5.setText(rs1.getString("Subject_5"));
            }
            
            ResultSet rs2 = c.S.executeQuery("select * from Marks where Roll_No = '"+roll+"'");
            while(rs2.next()) {
                mark1.setText(rs2.getString("Marks_1"));
                mark2.setText(rs2.getString("Marks_2"));
                mark3.setText(rs2.getString("Marks_3"));
                mark4.setText(rs2.getString("Marks_4"));
                mark5.setText(rs2.getString("Marks_5"));
                
                semester.setText(rs2.getString("Semester"));
                name.setText(rs2.getString("Name"));
            }
            
          }catch(Exception e){
              e.printStackTrace();
          }
          
         cencel = new JButton("Cencel");
         cencel.setBounds(600,480,150,40);
         cencel.setForeground(Color.white);
         cencel.setBackground(Color.black);
         cencel.setFont(new Font("serif",Font.BOLD,25));
         cencel.addActionListener(this);
         add(cencel);
          
          setVisible(true);
          
           
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
public static void main(String args[]){
    new SeeResult("");
}    
}
