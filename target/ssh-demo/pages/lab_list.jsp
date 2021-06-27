<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fonrye
  Date: 2020/5/27
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>实验室管理</title>
</head>
<body>
<table class="table">
    <caption style="text-align: center;font-size: 30px; color: white; background-color: #337ab7" >实验室管理</caption>
    <thead>
    <tr>
        <th class="font2">实验室编号</th>
        <th class="font2">实验室名称</th>
        <th class="font2">机位数</th>
        <th class="font2">实验室责任老师</th>
        <th class="font2">实验室技术人员</th>

    </tr>

    </thead>
    <tbody>
    <s:iterator value="#request.labList" status="">
    <tr class="success">
        <td class="font3"><s:property value="labId"/></td>
        <td class="font3"><s:property value="labName"/></td>
        <td class="font3"> <s:property value="computerNum"/></td>
        <td class="font3"> <s:property value="labTeacher"/></td>
        <td class="font3"><s:property value="labTechnician"/></td>
    </tr>
    </s:iterator>
    </tbody>
    <tr >
    <td colspan="3" align="center"><a class="btn btn-primary" href="/pages/lab_save.jsp">点击添加</a></td>
    <td colspan="2" align="center"><a class="btn btn-primary" href="/equip/equip_list">设备详情</a></td>
    </tr>
</table>
</body>
</html>