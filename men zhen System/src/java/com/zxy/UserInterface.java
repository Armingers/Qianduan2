/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxy;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ChangInway
 */
public class UserInterface {
    
        public boolean addUser(User user) {
        String username = user.getUsername();
        String passwd = user.getPasswd();

        DbUtil db = new DbUtil();
        try {
            String sql = "INSERT INTO USERS(username,passwd)values(?,?)";
            Connection conn = db.getCon();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, passwd);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }
}
