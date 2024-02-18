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
public class ChufangInterface {

    public boolean addChufang(Chufang chufang) {
        String pername = chufang.getPername();
        String sex = chufang.getSex();
        int age = chufang.getAge();
        String address = chufang.getAddress();
        String phone = chufang.getPhone();
        int fushu = chufang.getFushu();
        String today = chufang.getToday();
        String rp = chufang.getRp();
        float sum = chufang.getSum();

        DbUtil db = new DbUtil();
        try {
            String sql = "INSERT INTO CHUFANG(pername,sex,age,address,phone,fushu,today,rp,sum)values(?,?,?,?,?,?,?,?,?)";
            Connection conn = db.getCon();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pername);
            ps.setString(2, sex);
            ps.setInt(3, age);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setInt(6, fushu);
            ps.setString(7, today);
            ps.setString(8, rp);
            ps.setFloat(9, sum);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }
}
