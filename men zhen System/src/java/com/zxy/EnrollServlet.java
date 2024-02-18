/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxy;

import com.zxy.DbUtil;
import com.zxy.User;
import com.zxy.UserInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ChangInway
 */
public class EnrollServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/jsp;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = new String(request.getParameter("username"));
        String passwd = new String(request.getParameter("passwd"));
        String username1 = null;

        DbUtil db = new DbUtil();
        try {
            Connection conn = db.getCon();
            Statement stmt = conn.createStatement();
            String sql = "SELECT username,passwd FROM users WHERE (username=\"" + username + "\")";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                // 通过字段检索
                username1 = rs.getString("username");
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(EnrollServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (username.equals(username1)) {
            response.sendRedirect("register.jsp");
        } else {
            User user = new User();
            user.setUsername(username);
            user.setPasswd(passwd);

            UserInterface userinterface = new UserInterface();
            userinterface.addUser(user);
            response.sendRedirect("Login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);

    }

}
