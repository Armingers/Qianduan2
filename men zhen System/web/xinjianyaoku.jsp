<%-- 
    Document   : xinjianyaoku
    Created on : 2022-6-9, 10:48:54
    Author     : 张洋铭
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
     <script src="http://www.htmleaf.com/js/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link href="yaokuchange.css" rel="stylesheet">
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
    
    <div class="row" id="box">

        <div class="col-sm-2"></div>



        <div class="col-sm-8" id="b_box">


            <div class="col-sm-3">
                <div>
                    <p class="p1"><strong>新增药品信息</strong></p>

                </div>
            </div>


            <div class="col-sm-6" id="biao">
                <form class="form-horizontal" action="yaokuchangeServlet" method="post">
                    <div class="form-group">
                        <label for="inputUser3" class="col-sm-3 control-label">药名</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="yaoming" placeholder="请输入药名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">新药品简称</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="jiancheng" placeholder="请输入新药品简称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password2" class="col-sm-3 control-label">新药品余量(g)</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="yuliang" placeholder="请输入新药品余量">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">新成本价(元)</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="chengben" placeholder="请输入新成本价">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputName3" class="col-sm-3 control-label">新售价(元)</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="shoujia" placeholder="请输入新售价">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputPhone3" class="col-sm-3 control-label">新生产厂家</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="changjia" placeholder="请输入新生产厂家">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputPhone3" class="col-sm-3 control-label">新库存预警(g)</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="yujing" placeholder="请输入新库存预警">
                        </div>
                    </div>
          
                    <div class="form-group">
                        <div class="col-sm-12">
                            <center><button class="btn btn-primary" type="submit" name="action" value="zxy"  role="button">修改</button></center>

                        </div>

                    </div>
                </form>
                    
            </div>

        </div>
        
           


        <div class="col-sm-2"></div>
    </div>
           
</body>
</html>