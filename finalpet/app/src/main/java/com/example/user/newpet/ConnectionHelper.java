package com.example.user.newpet;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    String IP,DB,DBUserName,DBPassword;
    @SuppressLint("NewApi")
    public Connection connections () {
        IP = "120.126.19.49";
        DB = "lab";
        DBUserName = "Data Source=DESKTOP-GHFFV32\\SQLEXPRESS";
        DBPassword = "";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        java.sql.Connection connection = null;
        String ConnectionURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://" + IP + ";databaseName=" + DB + ";user=" + DBUserName + ";password=" + DBPassword + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        }catch (SQLException se) {
            Log.e("error Pom SQL",se.getMessage());}
        catch (ClassNotFoundException e) {Log.e("Error from Class", e.getMessage());}
        catch (Exception ex) {Log.e("Error from Exception", ex.getMessage());}
        return connection;
    }
}
