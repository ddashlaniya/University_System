package university.management.system;
import java.awt.Image;
import javax.swing.*;
//import java.awt.*;

public class Start extends JFrame implements Runnable  {
    Thread t;
    
    Start(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        add(Image);
        setVisible(true);
        
        t = new Thread(this);
        t.start();
        
        int x=1;
        for(int i=0; i<600; i+=4, x+=1){
        //setSize(i+3*x,i+x/4);
        setSize(i+3*x,i+x/2);
        setLocation(600 - ((i+x)/2),300 - (i/2));
       try {
        Thread.sleep(10);
           }catch(Exception e){}
        }
        
    }
    public void run(){
        
        try{
            Thread.sleep(7000);
            setVisible(false);
            //this is the next Frame
           new Login();  
        }catch(Exception e){   
        System.out.println("the fields is working");
        }
       
    }
    public static void main(String []args )
    {
        Start St = new Start();
    }
}
