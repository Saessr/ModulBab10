/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionSelect;
import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lk09Nu25Uty
 */
public class SelectApp {
    public static void main(String[] args) {
      Connection conn = null;
      try
      {
          String jdbcDriver
                  = "org.gjt.mm.mysql.Driver";
          Class.forName(jdbcDriver);
          
          String url = "jdbc:mysql://localhost:3306/latihan";
          String user = "root";
          String pwd = "";      
          conn = DriverManager.getConnection(url,user,pwd);
          String sqlSelect =
                  "SELECT * FROM pegawai";
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sqlSelect);
          while(rs.next())
          {
              String id = rs.getString("id");
          String name = rs.getString("name");
          String departement = rs.getString("departement");
          String jobTitle = rs.getString("jobTitle");;
          double salary = rs.getDouble("salary");
              System.out.println("PEGAWAI");
              System.out.println("id : "+ id);
              System.out.println("name : "+ name);
              System.out.println("departement : "+ departement);
              System.out.println("Salary : "+ salary);
              System.out.println();
          }
            }
              catch (ClassNotFoundException cnfe)
                  
                      {
                          cnfe.printStackTrace();
                      }
              catch (SQLException sqle)
                      {
                      sqle.printStackTrace();
                      }
              finally
                      {
                          try
                          {
                              if (conn != null)
                              {
                                  conn.close();
                              }
                          }
                          catch (SQLException sqle)
                          {
                              sqle.printStackTrace();
                          }
                      }
             }  
        } 
     

    

