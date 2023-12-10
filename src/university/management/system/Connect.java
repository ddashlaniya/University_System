package university.management.system;
import java.sql.*;

public class Connect {
    Connection C;
    Statement S;
    Connect()  {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        C = DriverManager.getConnection("jdbc:mysql://localhost:3306/Management","root","Golu@888");
        S = C.createStatement();
        
    }catch(Exception e){
        e.printStackTrace();
    }
}  
}
