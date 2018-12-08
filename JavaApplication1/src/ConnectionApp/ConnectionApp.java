/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionApp;
import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lk09Nu25Uty
 */
public class ConnectionApp {
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
          
          System.out.println("mencoba membangun connection ke ` "+ url + "` dengan user ` "+ user +"` dan password ` "+ pwd +"` ...");
          conn = DriverManager.getConnection(url,user,pwd);
          
          System.out.println("succes!!");
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
                                  System.out.println("Menutup connection");
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
     

    

