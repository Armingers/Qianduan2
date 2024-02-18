/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zxy;

import com.zxy.Chufang;
import com.zxy.ChufangInterface;
import com.zxy.User;
import com.zxy.UserInterface;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ChangInway
 */
public class XinjianchufangServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String pername = new String(request.getParameter("pername").getBytes("ISO-8859-1"),"UTF-8");
        String sex = new String(request.getParameter("sex").getBytes("ISO-8859-1"),"UTF-8");
        String age1 = new String(request.getParameter("age").getBytes("ISO-8859-1"),"UTF-8");
        String address = new String(request.getParameter("address").getBytes("ISO-8859-1"),"UTF-8");
        String phone = new String(request.getParameter("phone"));
        String fushu1 = new String(request.getParameter("fushu"));
        String today = new String(request.getParameter("today"));
        String rp = new String(request.getParameter("rp").getBytes("ISO-8859-1"),"UTF-8");
        String sum1 = new String(request.getParameter("sum"));

        int age = Integer.parseInt(age1);
        int fushu = Integer.parseInt(fushu1);
        float sum = Float.parseFloat(sum1);

        Chufang chufang = new Chufang();
        chufang.setPername(pername);
        chufang.setSex(sex);
        chufang.setAge(age);
        chufang.setAddress(address);
        chufang.setPhone(phone);
        chufang.setFushu(fushu);
        chufang.setToday(today);
        chufang.setRp(rp);
        chufang.setSum(sum);

        ChufangInterface chufanginterface = new ChufangInterface();
        chufanginterface.addChufang(chufang);

        response.sendRedirect("HomePage.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);

    }

}
