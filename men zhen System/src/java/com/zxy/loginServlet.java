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
public class loginServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection dbconn = null;
     Statement stmt = null;
    public void init() {
        
       
    }

     

   
    
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();//获取session
		Object name = session.getAttribute("name");//从session中获取用户名
		
		System.out.println(name); //测试一下，输出获取的用户名和密码
		session.invalidate(); //注销session
		response.sendRedirect("2.html"); //跳转到login.jsp页面


		
	}


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    

          
        
        
        String name = null;
        String pas = null;
        String name1 = null;
        String pas1= null;
        PrintWriter out = response.getWriter();
                
                
                // 获取表单Post过来的数据
                String btn=request.getParameter("btn_Login");
                name = request.getParameter("name");
                pas = request.getParameter("pas");
                System.out.println(btn);
        
            
            
            
            
            
            if(btn!=null){
                
                
            try {
                stmt = dbconn.createStatement();
                String sql;
                sql = "SELECT username,passwd FROM users WHERE (username=\""+name+"\")";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
               // 通过字段检索
                name1 = rs.getString("username");
                pas1= rs.getString("passwd");
               rs.close();
               stmt.close();
               dbconn.close();
                }
                } catch (SQLException ex) {
                Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
                 }
               System.out.println(name1);
               System.out.println(name);
            if(name.equals(name1)&&pas.equals(pas1)){
                
                response.sendRedirect("HomePage.jsp");
                
            }
            else{
                response.sendRedirect("Login.jsp");
                
            }
            
           
            }
        }
     
    }
