/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 张晓宇
 */
public class yaokuchangeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection dbconn = null;
     Statement stmt = null;
     
    public void init() {
        String dburl  = "jdbc:mysql://localhost:3306/menzhen";
        String username ="root";
        String password = "123456";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbconn = DriverManager.getConnection(dburl,username,password);
            System.out.println("数据库连接成功");
        }catch (ClassNotFoundException e1){
            System.out.println(e1+"驱动程序找不到");
        }catch(SQLException e2){
            System.out.println(e2);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
       response.setCharacterEncoding("UTF-8");
      ArrayList<Object> list = new ArrayList<Object>();
        PrintWriter out = response.getWriter();
                // 获取表单Post过来的数据
                String btn=request.getParameter("action");
                
               String name1 = new String(request.getParameter("yaoming").getBytes("ISO-8859-1"),"UTF-8");
                String name2 = new String(request.getParameter("jiancheng").getBytes("ISO-8859-1"),"UTF-8");
                String name3 = new String(request.getParameter("yuliang").getBytes("ISO-8859-1"),"UTF-8");
                String name4 = new String(request.getParameter("chengben").getBytes("ISO-8859-1"),"UTF-8");
                String name5 = new String(request.getParameter("shoujia").getBytes("ISO-8859-1"),"UTF-8");
                String name6 = new String(request.getParameter("changjia").getBytes("ISO-8859-1"),"UTF-8");
                String name7 = new String(request.getParameter("yujing").getBytes("ISO-8859-1"),"UTF-8");
                
                
               
            if(btn.equals("zxy")){
                 
                
              
            try {
                stmt = dbconn.createStatement();
                String sql;
                sql = "UPDATE yaoku set shortname=\""+name2+"\",mednumber=\""+name3+"\",cost=\""+name4+"\",price=\""
                        +name5+"\",maker=\""+name6+"\",early=\""+name7+"\" WHERE (medname=\""+name1+"\" )";
                stmt.executeUpdate(sql);
               
                
                stmt.close();
                
               
                
                } catch (SQLException ex) {
                Logger.getLogger(PatientServlet.class.getName()).log(Level.SEVERE, null, ex);
                 }
            //将list数据发送到.jap文件中
           response.sendRedirect("YaoKu.jsp");
            }
            
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		doGet(request, response);
        } 
   
}
