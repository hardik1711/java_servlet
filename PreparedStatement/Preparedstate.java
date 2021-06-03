/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstate;
import java.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author hardik
 */
public class Preparedstate {

  public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hardik","root","");  
  
PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?,?)");  
stmt.setInt(1,4);
stmt.setInt(2,754);
stmt.setString(3,"Sharma");
stmt.setString(4,"pass");
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
} 