/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcode;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sajith
 */
public class Dbconnect {

   
    
    public static Connection dconnect(){
    
     Connection con = null;
     
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/st2db","root","");
     
     
     }catch(Exception e){
         
         System.out.println(e);
                 
     
     
     }
     
         return con;
    
    }
}
