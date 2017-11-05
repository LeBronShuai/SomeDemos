<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
    <title>My JSP 'index.jsp' starting page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function getAllUsers(p) {
            $.ajax({
                url:'${pageContext.request.contextPath}/company/getAll',
                dataType:'json',
                data:{"page":p},
                success:function(data){
                    //alert(data.length);
                    var a=$("#formId");
                    var ss ="";
                    for(var i=0;i<data.list.length;i++){
                        //alert(data[i].username);
                        var date = new Date(data.list[i].birthday);
                        ss = ss+"<tr>";
                        ss=ss+"<td>"+data.list[i].name+"</td>";
                        ss=ss+"<td>"+data.list[i].type+"</td>";
                        ss=ss+"<button type='button' class='btn btn-default btn-primary'>修改</button>";
                        ss =ss+"<button type='button' class='btn btn-default btn-danger'>删除</button>";

                        ss=ss+"</td></tr>";
                    }
                    //$("#sizeId").html(data.list.length)
                    $("#pageId").val(data.page);
                    //alert(a.html())
                    a.html(ss);
                }
            });
        }
        function search() {
            //alert(123)
            var keyWord =$("#keyWordId").val();
            //alert(keyWord);
            $.ajax({
                url:'${pageContext.request.contextPath}/company/getAllByKeyWord',
                dataType:'json',
                data:{"keyWord":keyWord},
                success:function(data){
                    //alert(data.length);
                    var a=$("#formId");
                    var ss ="";
                    for(var i=0;i<data.length;i++){
                        //alert(data[i].username);
                        var date = new Date(data[i].birthday);
                        ss = ss+"<tr>";
                        ss=ss+"<td>"+data[i].name+"</td>";
                        ss=ss+"<td>"+data[i].type+"</td>";
                        ss=ss+"<button type='button' class='btn btn-default btn-primary'>修改</button>";
                        ss =ss+"<button type='button' class='btn btn-default btn-danger'>删除</button>";

                        ss=ss+"</td></tr>";
                    }
                    $("#pageId").val(data.page);
                    $("#eee").show();
                    $("#sizeId").html(data.length)
                    //alert(a.html())
                    a.html(ss);
                }
            });
        }
    </script>
</head>

<body style="background-image:url('./img/777.jpg') " onload="getAllUsers(1)">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-2 column">
        </div>
        <div class="col-md-8 column">
            <h1 style="color: white;" align="center">公司表</h1>
            <input name="keyWord" id="keyWordId" placeholder="请输入公司名字">
            <a href="javascript:search()" class="btn btn-success" >搜索</a>
            <span id="eee"  style="color: white;display: none">共<span id="sizeId" style="color: red"></span>条</span>
            <table class="table table-bordered" style="color: white;">
                <thead>
                <tr>
                    <th>名称</th>
                    <th>类型</th>

                </tr>
                </thead>
                <tbody id="formId">
                <tr>
                    <td></td>
                    <td> </td>
                    </tr>
                </tbody>
            </table>
            <input id="pageId" style="display: none">
            <a href="javascript:prex()">上一页</a>
            <a href="javascript:next()">下一页</a>
        </div>
        <div class="col-md-2 column">
        </div>
    </div>
</div>
<script type="text/javascript">

    function prex() {
        //alert(123);
        var page =$("#pageId").val();
        page=page-1;
        getAllUsers(page);
       // alert(321);
    }
    function next() {
        //alert(123);
        var page =$("#pageId").val();
        page=page-(-1);
        getAllUsers(page);
       // alert(321);
    }
</script>
</body>
</html>
