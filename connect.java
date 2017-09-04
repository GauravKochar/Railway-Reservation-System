
package connection;

import java.sql.*;

public class connect {
   static  Connection con =null;
    public static  Connection getconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","1234");
        }
        catch(Exception e)
         {
            System.out.println(e);
        }
         return con;
        }
    }
    

