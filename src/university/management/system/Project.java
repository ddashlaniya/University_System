package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener {
    
    Project(){
        setSize(1466,780);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
      
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        add(Image);
         //<<<<<<<<<-----------------------------Menu fields code----------------->>>>>>>>
        JMenuBar mb= new JMenuBar();
        
         //Information
        JMenu newInformation = new JMenu("Menu");
        mb.add(newInformation);
        newInformation.setForeground(Color.red);
        setJMenuBar(mb);
        
        JMenuItem FacultyInfo = new JMenuItem("New Faculty");
        FacultyInfo.setBackground(Color.white);
        FacultyInfo.addActionListener(this);
        newInformation.add(FacultyInfo);
        
        JMenuItem StudentInfo = new JMenuItem("New Students");
        StudentInfo.setBackground(Color.white);
        StudentInfo.addActionListener(this);
        newInformation.add(StudentInfo);
             
        JMenuItem VerifyStudent = new JMenuItem("Update Students Details");
        VerifyStudent.setBackground(Color.white);
        VerifyStudent.addActionListener(this);
        newInformation.add(VerifyStudent);
        
        JMenuItem VerifyFaculty = new JMenuItem("Update Faculty Details");
        VerifyFaculty.setBackground(Color.white);
        VerifyFaculty.addActionListener(this);
        newInformation.add(VerifyFaculty);
        
        JMenu Exam = new JMenu("Examination");
        mb.add(Exam);
        Exam.setForeground(Color.red);
        setJMenuBar(mb);
        
        JMenuItem ExamForm = new JMenuItem("Fill Exam Form");
        ExamForm.setBackground(Color.white);
        Exam.add(ExamForm);
        
        JMenuItem enterResult = new JMenuItem("Enter Marks");
        enterResult.setBackground(Color.white);
       enterResult.addActionListener((ActionListener) this);
        Exam.add(enterResult);
        
        JMenuItem Result = new JMenuItem("View Result");
        Result.setBackground(Color.white);
        Result.addActionListener((ActionListener) this);
        Exam.add(Result);
        
        
          //Acadmics
        JMenu Acadmics = new JMenu("Acadmics");
        mb.add(Acadmics);
        Acadmics.setForeground(Color.red);
        setJMenuBar(mb);
        
        JMenuItem Acts = new JMenuItem("Acts");
        Acts.setBackground(Color.white);
        Acadmics.add(Acts);
        
        JMenuItem Scheme = new JMenuItem("Scheme Or Syllabus");
        Scheme.setBackground(Color.white);
       // FacultyInfo.addActionListener((ActionListener) this);
        Acadmics.add(Scheme);
        
        JMenuItem Celender = new JMenuItem("Acadmics Celender");
        Celender.setBackground(Color.white);
       // FacultyInfo.addActionListener((ActionListener) this);
        Acadmics.add(Celender);
        
        JMenuItem Reserch = new JMenuItem("Reserch Portal");
        Reserch.setBackground(Color.white);
       // FacultyInfo.addActionListener((ActionListener) this);
        Acadmics.add(Reserch);
        
        JMenuItem Member = new JMenuItem("Executing Member");
        Member.setBackground(Color.white);
       // FacultyInfo.addActionListener((ActionListener) this);
        Acadmics.add(Member);
        
        // Quick Lines
        JMenu QuickLine = new JMenu("Quick Line");
        mb.add(QuickLine);
        QuickLine.setForeground(Color.red);
        setJMenuBar(mb);
        
        /*JMenuItem DLibary = new JMenuItem("Digital Libary");
        DLibary.setBackground(Color.white);
       // FacultyInfo.addActionListener((ActionListener) this);
        QuickLine.add(DLibary);*/
        
        JMenuItem Support= new JMenuItem("Help Support");
        Support.setBackground(Color.white);
        Support.addActionListener((ActionListener) this);
        QuickLine.add(Support);
        
        JMenuItem chat= new JMenuItem("Query Here");
        chat.setBackground(Color.white);
        chat.addActionListener((ActionListener) this);
        QuickLine.add(chat);
        
        // Utility
        JMenu Courses = new JMenu("Courses");
        Courses.setForeground(Color.red);
        
        mb.add(Courses);
       // setJMenuBar(mb);
       JMenuItem fee= new JMenuItem("Coures & Fee");
       fee.setBackground(Color.white);
       fee.addActionListener((ActionListener) this);
       Courses.add(fee);
         
        // About As
        JMenu About = new JMenu("About As");
        mb.add(About);
        About.setForeground(Color.red);
        setJMenuBar(mb);
        
        // Exit
        JMenu Exit = new JMenu("Exit");
        mb.add(Exit);
        Exit.setForeground(Color.red);
        setJMenuBar(mb);
        JMenuItem Ex= new JMenuItem("Exit");
        Ex.setBackground(Color.white);
       Ex.addActionListener(this);
        Exit.add(Ex);
        
        setVisible(true);
    }
    @Override
     public void actionPerformed(ActionEvent ae){
           String msg = ae.getActionCommand();
            if(msg.equals("Exit")){
                setVisible(false);
            }/* else if(msg.equals("Calculator")){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){
                    
                }
            }
            else if(msg.equals("Notepad")){
                        try{
                        Runtime.getRuntime().exec("notepad.exe");
                        }catch(Exception e){
                        }
                 }*/
            else if(msg.equals("New Faculty")){
                new FacultyRegistration();
            }
            else if(msg.equals("New Students")){
                new StudentRegistration();
            }
            else if(msg.equals("Update Students Details")){
                new VerifyStudentDetails();
            }
            else if(msg.equals("Update Faculty Details")){
                new UpdateFacultyDetails();
            }
            else if(msg.equals("View Result")){
                new ExamResult();
            }
            else if(msg.equals("Help Support")){
                new Support();
            }
            else if(msg.equals("Enter Marks")){
                new EnterMarks();
            }
            else if(msg.equals("Coures & Fee")){
                new FeeStructure();
            }
             else if(msg.equals("Query Here")){
                new chattoo();
            }
    
     }
       public static void main(String[]args){
       Project Pro= new Project();
    }
    
}