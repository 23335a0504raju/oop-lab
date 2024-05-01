package bookmyticket;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sample{
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bookmyshow";
            String name="root";
            String pass="";
            Connection con = DriverManager.getConnection(url, name, pass);
            PreparedStatement pstmt=con.prepareStatement("select Name,Password,Address from login where Name=?");
            pstmt.setString(1,"raju");
            ResultSet rset = pstmt.executeQuery();
            String name1="";
            String pass1="";
            String address1="";
            while(rset.next()){
                name1=rset.getString("Name");
                pass1=rset.getString("Password");
                address1=rset.getString("Address");
            }
            System.out.println(name1+"    "+pass1+" "+address1);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}