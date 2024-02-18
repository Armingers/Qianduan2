<%-- 
    Document   : Warning
    Created on : 2022-6-8, 23:07:08
    Author     : 张洋铭
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>提示登陆界面</title>
         <link rel="stylesheet" href="bootstrap.min.css">
    <link href="Warning.css" rel="stylesheet">
    </head>
    <body>
        <div class="onepage">
        <div class="onepage-bg" id="onepage"></div>
        
    </div>
        
        <div class="modal-dialog" style="margin-top: -35%;">
    <div class="modal-content">
        <div class="modal-header">

            <h4 class="modal-title text-center text-danger" id="myModalLabel"><strong>提示</strong></h4>
            <br>
            <h3 class="modal-title text-center text-default" id="myModalLabel"><strong>请先登录</strong></h3>
            <br>
            
            <h3 class="modal-title text-center text-default" id="myModalLabel"><strong>
                    <img src="images/hushi.jpg" style="width: 30%">登录后使用更多功能<img src="images/hushi2.jpg" style="width: 30%">
                </strong></h3>
        </div>
        <center><a class="btn btn-primary form-inline" href="http://localhost:8084/men_zhen_System/Login.jsp" role="button">登录</a></center>
        <br>
        <br>
    </div>
            
        
       
    </body>
</html>
