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
import java.util.Arrays;
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
public class YaokuServlet extends HttpServlet {

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
                String btn=request.getParameter("btn");
                String name = new String(request.getParameter("sousuoname").getBytes("ISO-8859-1"),"UTF-8");
                System.out.println(btn);
               
            if(btn.equals("haha")){
                 String[][] tableDate=new String[500][7];
                ResultSet rs =null;
                
            try {
                stmt = dbconn.createStatement();
                String sql;
                sql = "SELECT medname,shortname,mednumber,cost,price,maker,early FROM yaoku WHERE (medname=\""+name+"\" or shortname=\""+name+"\")";
                rs = stmt.executeQuery(sql);
                while(rs.next()){
               // 通过字段检索
                String medname = rs.getString("medname");
               String shortname = rs.getString("shortname");
               String mednumber  = rs.getString("mednumber");
               String cost = rs.getString("cost");
               String price = rs.getString("price");
               String maker=rs.getString("maker");
               String early = rs.getString("early");
               System.out.println(medname);
                list.add(medname);
                list.add(shortname);
                list.add(mednumber);
                list.add(cost);
                list.add(price);
                list.add(maker);
                list.add(early); 
                //数据库信息存入list中
                }
                rs.close();
                stmt.close();
                //将数据打包
                request.setAttribute("list", list);
                } catch (SQLException ex) {
                Logger.getLogger(YaokuServlet.class.getName()).log(Level.SEVERE, null, ex);
                 }
            //将list数据发送到.jap文件中
            name=null;
           request.getRequestDispatcher("YaoKu.jsp").forward(request, response);
            }
            if(btn.equals("zxy")){
                response.sendRedirect("yaokuchange.jsp");
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
