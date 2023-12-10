package university.management.system;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

    public class Support extends JFrame //implements ActionListener {
            {
    JButton done;

    Support() {

        setSize(600, 500);
        setLocation(300, 180);
        setLayout(null);
        
        JLabel hading = new JLabel("Help Center");
        hading.setBounds(10,20,150,35);
        hading.setFont(new Font("tamoha",Font.PLAIN,25));
        add(hading);
        
        JLabel phone1 = new JLabel("Contact  "+"1800XXXXXX");
        phone1.setBounds(10,60,150,15);
        phone1.setFont(new Font("tamoha",Font.PLAIN,15)); 
        add(phone1);
        
        JLabel phone2 = new JLabel("Contact  "+"6264XXXXXX");
        phone2.setBounds(10,90,150,20);
        phone2.setFont(new Font("tamoha",Font.PLAIN,15)); 
        add(phone2);
        
        JLabel mail = new JLabel("E-Mail  "+"help@miniuniversity.com");
        mail.setBounds(10,120,250,20);
        mail.setFont(new Font("tamoha",Font.PLAIN,15)); 
        add(mail);
        
         done = new JButton("Done");
         done.setBounds(200,400,150,30);
         done.setForeground(Color.white);
         done.setBackground(Color.black);
         done.setFont(new Font("serif",Font.BOLD,20));
       //  done.addActionListener(this);
         add(done);
        
        setVisible(true);
    }
    
   /* public void actionPerfomed(ActionEvent ae){
       setVisible(false);
    }*/
    public static void main(String args[]) {
        new Support();
    }

  /*  @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
}
 