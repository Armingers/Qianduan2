<%-- 
    Document   : YaoKu
    Created on : 2022-6-5, 1:41:01
    Author     : 张洋铭
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>药库</title>
    <link rel="stylesheet" href="bootstrap.min.css">
  <style>
    *{
      font-family: "微软雅黑 Light";
    }
    .fakeimg {
      height: 300px;

    }
    /*jumbotron是超大屏幕，作为组件，增加标题大小，为页面内容增添更多的页边距*/
    .jumbotron{
            background-color: #66afe9 ;
        }
        /*container容器用来固定宽度，配合响应式布局*/
        .container{
            width: 97%;
        }
    </style>
</head>
<body class="container">
<div class="jumbotron text-center" style="margin-bottom:0px">
<!--    margin-bottom设置下边距，允许为负-->
<h1 class="text-left"><strong>门诊管理系统</strong></h1>
<p class="text-left text-muted"><strong>欢迎使用</strong></p>
<!--    text-muted效果是使文字减弱-->

  <h1 class="text-left"><strong></strong></h1>
  <p class="text-left text-muted"><strong></strong></p>
  <!--    text-muted效果是使文字减弱-->
</div>

<!--这个是导航栏-->
<nav class="navbar navbar-inverse">
  <!--    设置导航栏的主题是黑色主题-->
  <div class="container-fluid">
    <!--      设置导航栏100%的宽度-->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="http://localhost:8084/men_zhen_System/HomePage.jsp">新建处方</a></li>
        <li class="active"><a href="#">药库</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Patient.jsp">病人信息查询</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Chufang.jsp">处方保存处</a></li>
        <!--<li><a href="menu5.html">药品采购</a></li>-->
      </ul>
    </div>
  </div>
</nav>
<left><a class="btn btn-primary" href="http://localhost:8084/men_zhen_System/yaokuchange.jsp" role="button">修改药品信息</a></left>

<div>
    
    <div class="row">

    <!--        栅格系统将页面左边五份分为自信导航栏-->
    <div class="col-sm-5" >
        
    <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
            <label for="Position">检索药名</label>
            <input type="text" class="form-control" placeholder="搜索"
        </div>
        <button type="submit" class="btn btn-default">查询</button>
        
    </form>
        
        
       
    </div>
    </div>
    </div>
</div>
        
    <!--        栅格系统右边7格分为图片展示栏-->
    <div class="col-sm-7">
        
     
     
      </div>
      
    </div>
  </div>
</div>

<div class ="container">
    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>药品</th>
                <th>药品简称</th>
                <th>药品余量(g)</th>
                <th>成本价（元）</th>
                <th>售价（元）</th>
                <th>生产厂家</th>
                <th>库存预警(g)</th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
           <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>
</div>

<div class="jumbotron text-left" style="margin-bottom:0">

    <p><strong>医院地址：四川省成都市国学巷37号   订购电话：028-85422114  </strong></p>
</div>


</body>
</html>