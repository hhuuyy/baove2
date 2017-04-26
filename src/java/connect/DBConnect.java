/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nguyen
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection cons = null;
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-03.cleardb.net:3306/ad_33f979c3dabc8ab",
                    "b4bd08c44f68db","990ba17c");
//            cons = DriverManager.getConnection("jdbc:sqlserver://Mobileweb.mssql.somee.com;"
//                    + "databaseName=Mobileweb;"
//                    + "user=hhuuyy009_SQLLogin_1;"
//                    + "password=vxsuxtg25o");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
