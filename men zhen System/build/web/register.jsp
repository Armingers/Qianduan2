<%-- 
    Document   : register
    Created on : 2022-6-4, 23:07:51
    Author     : ������
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@ page language="java"  contentType="text/html; charset=gb2312"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ע�����</title>
    <!-- �� Bootstrap ���� CSS �ļ� -->
     <script src="http://www.htmleaf.com/js/jquery/1.10.2/jquery.min.js"></script>
    <link rel="stylesheet" href="bootstrap.min.css">
    <link href="register.css" rel="stylesheet">
    <!-- jQuery�ļ��������bootstrap.min.js ֮ǰ���� -->
   


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
                    <p class="p1">���û�ע��</p>

                </div>
            </div>


            <div class="col-sm-6" id="biao">
                <form class="form-horizontal" <!--action="${pageContext.request.contextPath}/" method="post"-->
                    <div class="form-group">
                        <label for="inputUser3" class="col-sm-3 control-label">�û���</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="inputUser3" placeholder="�������˺�">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">����</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="����������">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password2" class="col-sm-3 control-label">ȷ������</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="password2" placeholder="��ȷ������">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">Email</label>
                        <div class="col-sm-9">
                            <input type="email" class="form-control" id="inputEmail3" placeholder="������Email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputName3" class="col-sm-3 control-label">����</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="inputName3" placeholder="��������ʵ����">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="inputPhone3" class="col-sm-3 control-label">�ֻ���</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPhone3" placeholder="�����������ֻ���">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label">�Ա�</label>
                        <div class="col-sm-9 ">
                           <label class="radio-inline">
   <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> ��
</label>
<label class="radio-inline">
  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> Ů
</label>

                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputData3" class="col-sm-3 control-label">��������</label>
                        <div class="col-sm-9">
                            <input type="date" class="form-control" id="inputData3" placeholder="��������ʵ����">
                        </div>
                    </div>
                    
                    


                    <div class="form-group">
                        <div class="col-sm-12">
                            <center><button type="button" class="btn btn-primary js-popover" data-toggle="popover" data-content="��ϲ��ע��ɹ�">ע��</button></center>

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
                    <p>�����˺�?<a href="http://localhost:8084/men_zhen_System/Login.jsp">������¼</a></p>
                </div>
            </div>

        </div>



        <div class="col-sm-2"></div>
    </div>
</div>
</body>
</html>
