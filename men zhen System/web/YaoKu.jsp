<%-- 
    Document   : YaoKu
    Created on : 2022-6-5, 1:41:01
    Author     : ������
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ҩ��</title>
    <link rel="stylesheet" href="bootstrap.min.css">
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
    </style>
</head>
<body class="container">
<div class="jumbotron text-center" style="margin-bottom:0px">
<!--    margin-bottom�����±߾࣬����Ϊ��-->
<h1 class="text-left"><strong>�������ϵͳ</strong></h1>
<p class="text-left text-muted"><strong>��ӭʹ��</strong></p>
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
        <li><a href="http://localhost:8084/men_zhen_System/HomePage.jsp">�½�����</a></li>
        <li class="active"><a href="#">ҩ��</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Patient.jsp">������Ϣ��ѯ</a></li>
        <li><a href="http://localhost:8084/men_zhen_System/Chufang.jsp">�������洦</a></li>
        <!--<li><a href="menu5.html">ҩƷ�ɹ�</a></li>-->
      </ul>
    </div>
  </div>
</nav>
<left><a class="btn btn-primary" href="http://localhost:8084/men_zhen_System/yaokuchange.jsp" role="button">�޸�ҩƷ��Ϣ</a></left>

<div>
    
    <div class="row">

    <!--        դ��ϵͳ��ҳ�������ݷ�Ϊ���ŵ�����-->
    <div class="col-sm-5" >
        
    <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
            <label for="Position">����ҩ��</label>
            <input type="text" class="form-control" placeholder="����"
        </div>
        <button type="submit" class="btn btn-default">��ѯ</button>
        
    </form>
        
        
       
    </div>
    </div>
    </div>
</div>
        
    <!--        դ��ϵͳ�ұ�7���ΪͼƬչʾ��-->
    <div class="col-sm-7">
        
     
     
      </div>
      
    </div>
  </div>
</div>

<div class ="container">
    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>ҩƷ</th>
                <th>ҩƷ���</th>
                <th>ҩƷ����(g)</th>
                <th>�ɱ��ۣ�Ԫ��</th>
                <th>�ۼۣ�Ԫ��</th>
                <th>��������</th>
                <th>���Ԥ��(g)</th>
                
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

    <p><strong>ҽԺ��ַ���Ĵ�ʡ�ɶ��й�ѧ��37��   �����绰��028-85422114  </strong></p>
</div>


</body>
</html>