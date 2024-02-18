<%-- 
    Document   : register
    Created on : 2022-6-4, 23:07:51
    Author     : 张洋铭
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册界面</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
     <script src="http://www.htmleaf.com/js/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link href="register.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
   


    <style>
        *{
            margin: 0px;
            padding: 3px;
            box-sizing: border-box;
        }
        #b_box{
            border: 1px solid #A6A6A6;
            background-color: white;
            margin-top: 80px;
        }
        .p1{
            margin-top: 15px;
            font-size: 18px;
            color: #2e6da4;
        }

        #lp{
            float: right;
            margin-top: 20px;
        }
        #biao{
            padding: 20px;
        }

    </style>

</head>
<body>
<div class="onepage">
        <div class="onepage-bg" id="onepage"></div>

    </div>
<div class="container">
    <div class="row" id="box">

        <div class="col-sm-2"></div>



        <div class="col-sm-8" id="b_box">


            <div class="col-sm-3">
                <div>
                    <p class="p1">新用户注册</p>

                </div>
            </div>


            <div class="col-sm-6" id="biao">
                <form class="form-horizontal" <!--action="${pageContext.request.contextPath}/" method="post"-->
                    <div class="form-group">
                        <label for="inputUser3" class="col-sm-3 control-label">用户名</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="inputUser3" placeholder="请输入账号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">密码</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password2" class="col-sm-3 control-label">确认密码</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="password2" placeholder="请确认密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">Email</label>
                        <div class="col-sm-9">
                            <input type="email" class="form-control" id="inputEmail3" placeholder="请输入Email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputName3" class="col-sm-3 control-label">姓名</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="inputName3" placeholder="请输入真实姓名">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputPhone3" class="col-sm-3 control-label">手机号</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPhone3" placeholder="请输入您的手机号">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">性别</label>
                        <div class="col-sm-9 ">
                           <label class="radio-inline">
   <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 男
</label>
<label class="radio-inline">
  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 女
</label>

                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputData3" class="col-sm-3 control-label">出生日期</label>
                        <div class="col-sm-9">
                            <input type="date" class="form-control" id="inputData3" placeholder="请输入真实姓名">
                        </div>
                    </div>
                    
                    


                    <div class="form-group">
                        <div class="col-sm-12">
                            <center><button type="button" class="btn btn-primary js-popover" data-toggle="popover" data-content="恭喜您注册成功">注册</button></center>

                        </div>

                        <script src="jquery-2.1.1.min.js"></script>
                        <script src="bootstrap.min.js"></script>
                        <script>
                            $(".js-popover").popover();
                        </script>
                    </div>
                </form>
                    
            </div>


            <div class="col-sm-3">

                <div id="lp">
                    <p>已有账号?<a href="http://localhost:8084/men_zhen_System/Login.jsp">立即登录</a></p>
                </div>
            </div>

        </div>



        <div class="col-sm-2"></div>
    </div>
</div>
</body>
</html>
