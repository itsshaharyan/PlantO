package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    static public Connection c;
    static public Statement st;
    static{
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/planto",
            "root","Incapp@12");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    static public void dbClose(){
        try{
            c.close();
            st.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
