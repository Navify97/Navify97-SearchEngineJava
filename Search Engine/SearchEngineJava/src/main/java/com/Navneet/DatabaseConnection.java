package com.Navneet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String db = "searchenginejava";
        String user = "root";
        String pwd = "Nav123@#";
        return getConnection(db, user, pwd);
    }
    private static Connection getConnection(String db, String user, String pwd){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"?user="+user+"&password="+pwd);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db , user,pwd);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return connection;
    }
}
