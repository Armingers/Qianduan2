<%-- 
    Document   : Login
    Created on : 2022-6-4, 22:16:59
    Author     : 张洋铭
--%>

<%@ page contentType="text/html; charset=gb2312"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆界面</title>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link href="Login.css" rel="stylesheet">
    </head>
   <body>

    <div class="onepage">
        <div class="onepage-bg" id="onepage"></div>

    </div>
    <div class="modal-dialog" style="margin-top: -30%;">
    <div class="modal-content">
        <div class="modal-header">

            <h4 class="modal-title text-center" id="myModalLabel"><strong>登录</strong></h4>
        </div>
        <div class="modal-body" id = "model-body">
            <div class="form-group">

                <input type="text" class="form-control"placeholder="用户名" autocomplete="off">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" placeholder="密码" autocomplete="off">
            </div>
        </div>
        <div class="col-sm-offset-0 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住我的账号
                </label>
            </div>
        </div>

        <div class="modal-footer">
            <div class="form-group">
                <a class="btn btn-primary form-control" href="http://localhost:8084/men_zhen_System/HomePage.jsp" role="button">登录</a>
            </div>
            <div class="form-group">
                <a class="btn btn-default form-control" href="http://localhost:8084/men_zhen_System/register.jsp" role="button">注册</a>
            </div>

        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal -->

</body>
</html>
