<%-- 
    Document   : homepage2
    Created on : 2022-6-8, 22:11:22
    Author     : ������
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>δ��¼��ҳ</title>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
  <style>
    *{
      font-family: "΢���ź� Light";
    }
    .fakeimg {
      height: 300px;

    }
    /*jumbotron�ǳ�����Ļ����Ϊ��������ӱ����С��Ϊҳ��������������ҳ�߾�*/
    .jumbotron{
            background-color: #66afe9 ;
        }
        /*container���������̶���ȣ������Ӧʽ����*/
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
<!--    margin-bottom�����±߾࣬����Ϊ��-->
<left><a class="btn btn-default form-inline" href="http://localhost:8084/men_zhen_System/Login.jsp" role="button">��¼</a></left>
<h1 class="text-left"><strong>�������ϵͳ</strong></h1>
<p class="text-left text-muted"><strong>����δ��¼</strong></p>
<!--    text-mutedЧ����ʹ���ּ���-->

  <h1 class="text-left"><strong></strong></h1>
  <p class="text-left text-muted"><strong></strong></p>
  <!--    text-mutedЧ����ʹ���ּ���-->
</div>

<!--����ǵ�����-->
<nav class="navbar navbar-inverse">
  <!--    ���õ������������Ǻ�ɫ����-->
  <div class="container-fluid">
    <!--      ���õ�����100%�Ŀ��-->
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
        <li class="active"><a href="#">�½�����</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/YaoKu.jsp">ҩ��</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Patient.jsp">������Ϣ��ѯ</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Chufang.jsp">�������洦</a></li>
        <!--<li><a href="menu5.html">ҩƷ�ɹ�</a></li>-->
      </ul>
    </div>
  </div>
</nav>

<div >
  
  <div class="row">

    <!--        դ��ϵͳ��ҳ�������ݷ�Ϊ���ŵ�����-->
    <div class="col-sm-6" >
      <h2 class="text-left"><strong>������</strong></h2>
      <!--       ��ߵı����ֵ���� formΪ�����  -->
      <form class="form-inline">
        <div class="form-group">
          <label for="Name">����</label>
          <input type="text" class="form-control" id="Name" placeholder="����">
        </div>
        <div class="form-group">
          <label for="Age">����</label>
          <input type="email" class="form-control" id="Age" placeholder="����">
        </div>
        
      </form>

      <!-- ��Ϊ�ո� ���������� -->
      <br>
      <!-- ��һ�еĿ����� -->
      <form class="form-inline">
        <div class="form-group">
          <label for="Position">סַ</label>
          <input type="text" class="form-control" id="Position"  placeholder="סַ">
        </div>
          <div class="form-group">
          <label  id="sex" class="inline">�Ա�</label>
          <select class=""  >
            <option>��</option>
            <option>Ů</option>
          </select>
        </div>
      </form>

      <!-- ��Ϊ�ո� ���������� -->
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
	
	ʱ�䣺<%=now %>
         
       
     </div>
        <br>
        <div class="form-group">
          <label for="Position">����</label>
          <input type="text" class="form-control" id="Position" placeholder="����">
        </div>
      </form>
</div>  
        <br>
        <div>
      <form class="form-inline">
        <div class="form-group">
          <label for="Phonenumber">��ϵ�绰</label>
          <input type="text" class="form-control" id="Phonenumber" placeholder="����">
        </div>
        <div class="form-group">
          <label for="Moeny">���</label>
          <input type="text" class="form-control" id="Money" placeholder="���">
        </div>
      </form>
        </div>
          
          
          <div class="form-group">
        <div class="col-sm-offset-10 col-sm-10">
        </div>
          </div>
        <h9><strong>����</strong></h9>
      <textarea class="form-control" rows="12"></textarea>
      <br>
      <div class="btn-group btn-group-justified" role="group" aria-label="">
  
  <div class=" btn-group " role="group">
    <a class="btn btn-primary" href="http://localhost:8084/men_zhen_System/Warning.jsp" role="button">�ύ����</a>
  </div>
  
</div>
      
    </div>
        
    <!--        դ��ϵͳ�ұ�7���ΪͼƬչʾ��-->
    <div class="col-sm-6">
  
      <div class="onepage">
          <div class="onepage-text">
              <h1 class="onepage-text-h1 text-center">
                  <strong>�µ�����ҩƷ</strong><img src="images/yao.jpg " style="width:10%"> 
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
                              <h1><strong>��������Ƭ</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/ancha.jpg">
                          <div class="carousel-caption">
                              <h1><strong>�����Ƭ</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/yanjing1.jpg">
                           <div class="carousel-caption">
                              <h1><strong>��ù��ҩ��</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/zhixie_1.jpg">
                          <div class="carousel-caption">
                              <h1><strong>����ʯɢ</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/changdao1.jpg">
                          <div class="carousel-caption">
                              <h1><strong>���������ܽ���</strong></h1>
                          </div>
                      </div>
                      <div class="item">
                          <img src="images/xiaoyan.jpg">
                          <div class="carousel-caption">
                              <h1><strong>��Ī���ֽ���</strong></h1>
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
                          <center><h3>��������Ƭ</h3></center>
                              
                                  
                      </div>
                  </a>
              </div>
              <div class="onepage-courses col-md-4">
                  <a href="#">
                      <img src="images/xiaoyan.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>��Ī���ֽ���</h3></center>
                                  
                      </div>
                  </a>
              </div>
              <div class="onepage-courses col-md-4">
                  <a href="#">
                      <img src="images/yanjing.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>��ù���۸�</h3></center>
                                  
                      </div>
                  </a>
              </div>
          </div>
          <!--<div class="onepagebtn">
              <a id="onepage-easy" href="#" class="btn btn-success btn-lg">��������˽���࣬������</a>
                  
          </div>-->
         <!--<div class="row">
              <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/changdao.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>���������ܽ���</h3></center>
                     
                                  
                      </div>
                  </a>
              </div>
              <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/kesou.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>�����Ƭ</h3></center>
                          \
                                  
                      </div>
                  </a>
              </div>
             <div class="towpage-courses col-md-4">
                  <a href="#">
                      <img src="images/zhixie.jpg" style="width:100%">
                      <div class="classicon">
                          <center><h3>����ʯɢ</h3></center>
                          
                                  
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

    <p><strong>ҽԺ��ַ���Ĵ�ʡ�ɶ��й�ѧ��37��   �����绰��028-85422114  </strong></p>
</div>


</body>
</html>