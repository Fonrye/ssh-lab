<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fonrye
  Date: 2020/5/27
  Time: 11:05
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
    <title>维修报表</title>
</head>
<body>
<table class="table">
    <caption style="text-align: center;font-size: 30px; color: white; background-color: #337ab7">维修设备管理</caption>
    <thead>
    <tr>
        <th class="font2">申请单号</th>
        <th class="font2">所属部门</th>
        <th class="font2">设备名称</th>
        <th class="font2">所在实验室</th>
        <th class="font2">设备编号</th>
        <th class="font2">报修人</th>
        <th class="font2">设备类型</th>
        <th class="font2">故障现象说明</th>
        <th class="font2">维修原因</th>
        <th class="font2">操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#request.checkList">
        <tr class="success">
            <td class="font3"><s:property value="applyId"/></td>
            <td class="font3"><s:property value="department"/></td>
            <td class="font3"> <s:property value="equipName"/></td>
            <td class="font3"> <s:property value="equipLab"/></td>
            <td class="font3"><s:property value="equipId"/></td>
            <td class="font3"><s:property value="applyPerson"/></td>
            <td class="font3"> <s:property value="equipType"/></td>
            <td class="font3"> <s:property value="description"/></td>
            <td class="font3"><s:property value="reason"/></td>
            <td><a class="btn btn-primary" href='/check/check_toCheckEdit?applyId=<s:property value="applyId"/>'>填写维修原因</a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>