/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultset;

import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.*;
/**
 *
 * @author hardik
 */
public class Rsmd {

public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hardik","root","");  
  
PreparedStatement ps=con.prepareStatement("select * from emp");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  