/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NMbank;

import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class BankSystem {
    private static java.sql.Connection BankSystem;
    
    public static java.sql.Connection getBankSystem(){
      if (BankSystem==null){
          try{
              String url ="jdbc:mysql://localhost:3306/banking";
              String user = "root";
              String password = "";
              DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
              BankSystem = DriverManager.getConnection(url,user,password);
              System.out.println("Connection Successfully");
          }catch (SQLException e){
              System.out.println("Eror");
          }
      }  
      return BankSystem;
    }
    public static void main(String args[]){
        getBankSystem();
        Screen m = new Screen();
          m.setVisible(true);
          m.pack();
          m.setLocationRelativeTo(null);
          m.setDefaultCloseOperation(Screen.EXIT_ON_CLOSE);
       
    }
}
