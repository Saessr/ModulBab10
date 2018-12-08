/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lk09Nu25Uty
 */
public class DeleteApp {
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
          String id = "005";
          String name = "sakti";
          String sqlDelete =
                  "DELETE FROM pegawai" 
                  + " WHERE "
                  + "id = '" + id + "'";
          System.out.println("mysql >");
          System.out.println(sqlDelete);
          Statement stmt = conn.createStatement();
          int count = stmt.executeUpdate(sqlDelete);
          System.out.println();
          System.out.println("Query OK, "+ count +" row affected");
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
