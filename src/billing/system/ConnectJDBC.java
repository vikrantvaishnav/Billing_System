package billing.system;

import java.sql.*;

public class ConnectJDBC {
    
    Connection c;
    Statement s;
    ConnectJDBC(){
        
        try{
        
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","zxc@7410");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }    
            
    }   
    
}
