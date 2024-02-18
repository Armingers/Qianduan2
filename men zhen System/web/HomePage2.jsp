<%-- 
    Document   : homepage2
    Created on : 2022-6-8, 22:11:22
    Author     : 张洋铭
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>未登录主页</title>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
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
        #myCarousel{
            width: 600px;
        }    
    </style>
</head>
<body class="container">
<div class="jumbotron text-left" style="margin-bottom:0px">
<!--    margin-bottom设置下边距，允许为负-->
<left><a class="btn btn-default form-inline" href="http://localhost:8084/men_zhen_System/Login.jsp" role="button">登录</a></left>
<h1 class="text-left"><strong>门诊管理系统</strong></h1>
<p class="text-left text-muted"><strong>您尚未登录</strong></p>
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
        <li class="active"><a href="#">新建处方</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/YaoKu.jsp">药库</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Patient.jsp">病人信息查询</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Chufang.jsp">处方保存处</a></li>
        <!--<li><a href="menu5.html">药品采购</a></li>-->
      </ul>
    </div>
  </div>
</nav>

<div >
  
  <div class="row">

    <!--        栅格系统将页面左边五份分为自信导航栏-->
    <div class="col-sm-6" >
      <h2 class="text-left"><strong>处方筏</strong></h2>
      <!--       左边的表单部分的设计 form为最外框  -->
      <form class="form-inline">
        <div class="form-group">
          <label for="Name">姓名</label>
          <input type="text" class="form-control" id="Name" placeholder="姓名">
        </div>
        <div class="form-group">
          <label for="Age">年龄</label>
          <input type="email" class="form-control" id="Age" placeholder="年龄">
        </div>
        
      </form>

      <!-- 作为空格 将框与框隔开 -->
      <br>
      <!-- 下一行的框的设计 -->
      <form class="form-inline">
        <div class="form-group">
          <label for="Position">住址</label>
          <input type="text" class="form-control" id="Position"  placeholder="住址">
        </div>
          <div class="form-group">
          <label  id="sex" class="inline">性别</label>
          <select class=""  >
            <option>男</option>
            <option>女</option>
          </select>
        </div>
      </form>

      <!-- 作为空格 将框与框隔开 -->
      <!--<div class="form-group">
        <div class="col-sm-offset-10 col-sm-10">
        </div>
      </div>-->
      <div>
 <form class="form-inline">
     <div class="text-left">
        <%
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
		String now = df.format(d);
	%>
	
	时间：<%=now %>
         
       
     </div>
        <br>
        <div class="form-group">
          <label for="Position">副数</label>
          <input type="text" class="form-control" id="Position" placeholder="副数">
        </div>
      </form>
</div>  
        <br>
        <div>
      <form class="form-inline">
        <div class="form-group">
          <label for="Phonenumber">联系电话</label>
          <input type="text" class="form-control" id="Phonenumber" placeholder="姓名">
        </div>
        <div class="form-group">
          <label for="Moeny">金额</label>
          <input type="text" class="form-control" id="Money" placeholder="金额">
        </div>
      </form>
        </div>
          
          
          <div class="form-group">
        <div class="col-sm-offset-10 col-sm-10">
        </div>
          </div>
        <h9><strong>处方</strong></h9>
      <textarea class="form-control" rows="12"></textarea>
      <br>
      <div class="btn-group btn-group-justified" role="group" aria-label="">
  
  <div class=" btn-group " role="group">
    <a class="btn btn-primary" href="http://localhost:8084/men_zhen_System/Warning.jsp" role="button">提交处方</a>
  </div>
  
</div>
      
    </div>
        
    <!--        栅格系统右边7格分为图片展示栏-->
    <div class="col-sm-6">
  
      <div class="onepage">
          <div class="onepage-text">
              <h1 class="onepage-text-h1 text-center">
                  <strong>新到货的药品</strong><img src="images/yao.jpg " style="width:10%"> 
              </h1>
              
          </div>
          <div class="container" id="myCarousel">
              <div id="carousel-example-generic" class="carousel slide">
                  <ol class="carousel-indicators">
                      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                      <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
                      <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                      <li data-target="#carousel-example-generic" data-slide-to="3" class=""></li>
                      <li data-target="#carousel-example-generic" data-slide-to="4" class=""></li>
                      <li data-target="#carousel-example-generic" data-slide-to="5" class=""></li>
                      
                  </ol>
                  <div class="carousel-inner">
                      <div class="item active">
                          <img src="images/lvlei.jpg">
                          <div class="carousel-caption">
                              <h1><strong>氯雷他定片</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/ancha.jpg">
                          <div class="carousel-caption">
                              <h1><strong>氨茶碱片</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/yanjing1.jpg">
                           <div class="carousel-caption">
                              <h1><strong>金霉素药膏</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/zhixie_1.jpg">
                          <div class="carousel-caption">
                              <h1><strong>蒙脱石散</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/changdao1.jpg">
                          <div class="carousel-caption">
                              <h1><strong>奥美拉唑肠溶胶囊</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/xiaoyan.jpg">
                          <div class="carousel-caption">
                              <h1><strong>阿莫西林胶囊</strong></h1>
                          </div>
                      </div>
                  </div>
                  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                      <span class="glyphicon glyphicon-chevron-left"></span>
                  </a>
                  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                      <span class="glyphicon glyphicon-chevron-right"></span>
                  </a>
                      
              </div>
              
          </div>
          <script src="jquery-2.1.1.min.js"></script>
          <script src="bootstrap.min.js"></script>
          <!--<div class="row">
              <div class="onepage-courses col-md-4">
                  <a href="#">
                      <img src="images/guoming.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>氯雷他定片</h3></center>
                              
                                  
                      </div>
                  </a>
              </div>
              <div class="onepage-courses col-md-4">
                  <a href="#">
                      <img src="images/xiaoyan.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>阿莫西林胶囊</h3></center>
                                  
                      </div>
                  </a>
              </div>
              <div class="onepage-courses col-md-4">
                  <a href="#">
                      <img src="images/yanjing.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>金霉素眼膏</h3></center>
                                  
                      </div>
                  </a>
              </div>
          </div>
          <!--<div class="onepagebtn">
              <a id="onepage-easy" href="#" class="btn btn-success btn-lg">如果你想了解更多，点这里</a>
                  
          </div>-->
         <!--<div class="row">
              <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/changdao.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>奥美拉唑肠溶胶囊</h3></center>
                     
                                  
                      </div>
                  </a>
              </div>
              <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/kesou.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>氨茶碱片</h3></center>
                          \
                                  
                      </div>
                  </a>
              </div>
             <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/zhixie.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>蒙脱石散</h3></center>
                          
                                  
                      </div>
                      
                  </a>
              </div>
          </div>-->     
        
        
      </div>
    
     
    </div>
        
  </div>
        
</div>

        <br>
<div class="jumbotron text-left" style="margin-bottom:0">

    <p><strong>医院地址：四川省成都市国学巷37号   订购电话：028-85422114  </strong></p>
</div>


</body>
</html>