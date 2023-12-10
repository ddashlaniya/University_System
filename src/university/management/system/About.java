package university.management.system;

import java.awt.Font;
import javax.swing.*;
public class About extends JFrame{
    About(){
        setSize(600, 500);
        setLocation(300, 180);
        setLayout(null);
        
        JLabel hading = new JLabel("About As");
        hading.setBounds(10,20,150,35);
        hading.setFont(new Font("tamoha",Font.PLAIN,25));
        add(hading);
        
        
        JTextPane tx = new JTextPane();
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new About();
    }
    
}
 