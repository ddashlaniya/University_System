package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class EnterMarks extends JFrame implements ActionListener {
    JTextField subject1,subject2,subject3,subject4,subject5,marks1,marks2,marks3,marks4,marks5;
    Choice sroll;
    JButton submit , cencel;
    JComboBox csemester;
    EnterMarks(){
        setSize(1000,500);
        setLocation(220,100);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(500, 40, 400, 300);
        add(Image);
               
        JLabel lblroll = new JLabel("Select Roll No.");
        lblroll.setBounds(20,30,100,30);
        add(lblroll);
        
        sroll = new Choice();
        sroll.setBounds(160,30,150,30);
        add(sroll);
        try{
            Connect c = new Connect();
            ResultSet rs = c.S.executeQuery("select * from Students");
            while(rs.next()){
              //  sroll.add(rs.getString("roll"));
                 sroll.add(rs.getString("roll"));
            }
            
         JLabel lblsemester = new JLabel("Select Semester");
          lblsemester.setBounds(20,70,100,30);
          add(lblsemester);
          
          String option[] ={"1st Semester","2nd Semester","3rd Semester","4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};
          csemester = new JComboBox(option);
          csemester.setBounds(160,70,150,30);
          add(csemester);          
        }catch(Exception e){
            e.printStackTrace();
        }
        JLabel lblsub = new JLabel("Subject");
        lblsub.setBounds(60,120,100,30);
        add(lblsub);
        
        JLabel lblmarks = new JLabel("Marks");
        lblmarks.setBounds(300,120,100,30);
        add(lblmarks);
         
        // Text fiels of Subjct
        subject1 = new JTextField();
        subject1.setBounds(30,150,200,30);
        add(subject1);
        
        subject2 = new JTextField();
        subject2.setBounds(30,190,200,30);
        add(subject2);
        
        subject3 = new JTextField();
        subject3.setBounds(30,230,200,30);
        add(subject3);
        
        subject4 = new JTextField();
        subject4.setBounds(30,270,200,30);
        add(subject4);
        
        subject5 = new JTextField();
        subject5.setBounds(30,310,200,30);
        add(subject5);
        
        // Text fiels of Marks
        marks1 = new JTextField();
        marks1.setBounds(250,150,100,30);
        add(marks1);
        
        marks2 = new JTextField();
        marks2.setBounds(250,190,100,30);
        add(marks2);
        
        marks3 = new JTextField();
        marks3.setBounds(250,230,100,30);
        add(marks3);
        
        marks4 = new JTextField();
        marks4.setBounds(250,270,100,30);
        add(marks4);
        
        marks5 = new JTextField();
        marks5.setBounds(250,310,100,30);
        add(marks5);
        
       //submit button, Cencel and reset Button
       submit = new JButton("Submit");
       submit.setBounds(60,370,100,30);
       submit.setForeground(Color.white);
       submit.setBackground(Color.black);
       submit.setFont(new Font("Tamoha",Font.BOLD,15));
       submit.addActionListener(this);
       add(submit);
       
       cencel = new JButton("Cencel");
       cencel.setBounds(210,370,150,30);
       cencel.setForeground(Color.white);
       cencel.setBackground(Color.black);
       cencel.setFont(new Font("serif",Font.BOLD,15));
       cencel.addActionListener(this);
       add(cencel);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
     
        if (ae.getSource() == submit) {
            try {
            
     
            Connect c = new Connect();
           // String query1 = "insert into Subjects values('"+roll+"','"+sem+"','"+sub1+"','"+sub2+"','"+sub3+"','"+sub4+"','"+sub5+"',)";
           // String query2 ="insert into Marks values('"+roll+"','"+sem+"','"+mark1+"','"+mark2+"','"+mark3+"','"+mark4+"','"+mark5+"')"; 
             
                
               String query1 = "insert into Subjects values('"+sroll.getSelectedItem()+"', '"+csemester.getSelectedItem()+"', '"+subject1.getText()+"', '"+subject2.getText()+"', '"+subject3.getText()+"', '"+subject4.getText()+"', '"+subject5.getText()+"')";
               String query2 = "insert into Marks values('"+sroll.getSelectedItem()+"', '"+csemester.getSelectedItem()+"', '"+marks1.getText()+"', '"+marks2.getText()+"', '"+marks3.getText()+"', '"+marks4.getText()+"', '"+marks5.getText()+"')";
            
                c.S.executeUpdate(query1);
                c.S.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Marks Inserted Sucessfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
public static void main(String []args){
    new EnterMarks();
}    
}
