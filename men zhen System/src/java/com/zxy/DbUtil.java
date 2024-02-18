/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ChangInway
 */
public class DbUtil {

    private String url = "jdbc:mysql://localhost:3306/menzhen";
    private String user = "root";
    private String password = "123456";
    private String driver = "com.mysql.jdbc.Driver";

    public Connection getCon() throws Exception {
        //注册驱动
        Class.forName(driver);
        //建立连接
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }

    public static void getClose(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
