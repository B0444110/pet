package com.example.user.newpet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {

    Connection connection;
    String ConnectionResult = "";
    Boolean isSuccess = false;

    public List<Map<String, String>> getdata() {
        List<Map<String, String>> data=null;
        data = new ArrayList<Map<String, String>>();

        try {
            ConnectionHelper connectionHelper = new ConnectionHelper() ;
            connection = connectionHelper.connections();
            if(connection == null) {
                ConnectionResult = "Check Your Internet Access!";
            }
            else {
                String query = "select 名稱,地址,營業時間,連絡電話,其他資訊 from 美容醫院公園旅館 where [類型]='";
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    Map<String,String> datanum = new HashMap<String, String>();
                    datanum.put("ID",rs.getString("名稱"));
                    datanum.put("Address",rs.getString("地址"));
                    datanum.put("Time",rs.getString("營業時間"));
                    datanum.put("Phone",rs.getString("連絡電話"));
                    datanum.put("Other",rs.getString("其他資訊"));
                    data.add(datanum);
                }

                ConnectionResult = "Successful";
                isSuccess = true;
                connection.close();
            }
        }catch (Exception ex) {
            isSuccess = false;
            ConnectionResult = ex.getMessage();
        }
        return data;
    }
}
