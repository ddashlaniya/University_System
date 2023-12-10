 
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.MouseAdapter;
//import org.w3c.dom.events.MouseEvent;
public class ExamResult extends JFrame implements ActionListener{
    JTextField had;
    JButton search,cencel;
    JTable table;
    JLabel roll;
      ExamResult(){
          setSize(1000,500);
          setLocation(250,100);
          setLayout(null);
          JLabel heading = new JLabel("Check Result ");
          heading.setBounds(20, 10, 500, 50);
          heading.setFont(new Font("serif", Font.BOLD, 20));
          add(heading);
          
          roll = new JLabel("Enter Roll Number ");
          roll.setBounds(20, 60, 150, 20);
          roll.setFont(new Font("serif", Font.BOLD, 15));
          add(roll);
          
          had = new JTextField();
          had.setBounds(180,60,150,20);
          add(had);
          
          //Search button and Cencel
          search = new JButton("Search");
          search.setBounds(60,100,100,20);
          search.setForeground(Color.white);
          search.setBackground(Color.black);
          search.setFont(new Font("Tamoha",Font.BOLD,15));
          search.addActionListener(this);
           add(search);
       
         cencel = new JButton("Cencel");
         cencel.setBounds(180,100,100,20);
         cencel.setForeground(Color.white);
         cencel.setBackground(Color.black);
         cencel.setFont(new Font("serif",Font.BOLD,15));
         cencel.addActionListener(this);
         add(cencel);
         
        table = new JTable();
        table.setFont(new Font("Tamoha", Font.PLAIN,16));
        
        JScrollPane Scroll = new JScrollPane(table);
        Scroll.setBounds(0,130,1000,310);
        add(Scroll);
        try{
            Connect c = new Connect();
            ResultSet rs = c.S.executeQuery("select * From Students");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        } 
        /*             
        table.addMouseListener(new MouseAdapter(){
           //@Override         
            public void mouseClicked(MouseEvent me){
                int row  = table.getSelectedRow();
                roll.setText(table.getModel().getValueAt(row,2).toString());
            }
        }
        );*/
          
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int row = table.getSelectedRow();
                had.setText(table.getModel().getValueAt(row, 2).toString());
            }
        });

          setVisible(true);
          
        
    }
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==search){
              setVisible(false);
              new SeeResult(had.getText());
          }else{
              setVisible(false);
          }
      }
    public static void main(String args[]){
        new ExamResult();
    }
/*
    private static class MouseEvent {

        public MouseEvent() {
        }
    }*/
}

