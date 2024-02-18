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

/**
 *
 * @author 张晓宇
 */
public class ChufangServlet extends HttpServlet {

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
        String name = null;
       response.setCharacterEncoding("UTF-8");
      ArrayList<Object> list = new ArrayList<Object>();
        PrintWriter out = response.getWriter();
                // 获取表单Post过来的数据
                String btn=request.getParameter("btn_all");
                
                //System.out.println(name);
            if(btn!=null){
                 String[][] tableDate=new String[500][7];
                ResultSet rs =null;
            try {
                stmt = dbconn.createStatement();
                String sql;
                sql = "SELECT pername,sex,age,address,today,fushu,phone,rp FROM chufang";
                rs = stmt.executeQuery(sql);
                while(rs.next()){
               // 通过字段检索
                String pername = rs.getString("pername");
               String sex = rs.getString("sex");
               String age  = rs.getString("age");
               String address = rs.getString("address");
               String today = rs.getString("today");
               String fushu=rs.getString("fushu");
               String phone = rs.getString("phone");
               String rp = rs.getString("rp");
                list.add(pername);
                list.add(sex);
                list.add(age);
                list.add(address);
                list.add(today);
                list.add(fushu);
                list.add(phone);
                list.add(rp);
                //数据库信息存入object中
                }
                rs.close();
                stmt.close();
                //将数据打包
                request.setAttribute("list", list);
                
                } catch (SQLException ex) {
                Logger.getLogger(ChufangServlet.class.getName()).log(Level.SEVERE, null, ex);
                 }
            //将list数据发送到.jap文件中
           request.getRequestDispatcher("Chufang.jsp").forward(request, response);
            }
            else{
                 System.out.println("提交失败！");
            }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		doGet(request, response);
        } 
}
    