<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fonrye
  Date: 2020/5/28
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
            rel="stylesheet"
            href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="../css/font-awesome.min.css" />
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>实验室管理</title>
</head>

<body>
<table class="table">
    <caption
            class="my01"
            style="font-size: 30px; text-align: center; color: white; background-color: #337ab7"
    >
        设备详情
    </caption>
    <thead>
    <tr>
        <th class="font2">设备标识</th>
        <th class="font2">设备编号</th>
        <th class="font2">设备名称</th>
        <th class="font2">设备类型</th>
        <th class="font2">设备生产日期</th>
        <th class="font2">设备保修日期</th>
        <th class="font2">厂商</th>
        <th class="font2">设备二维码</th>
    </tr>
    </thead>
    <tbody>
<s:iterator var="equip" value="#request.equipList" status="">
    <tr class="active">
        <td class="font3"><s:property value="#equip.equipment"/></td>
        <td class="font3"><s:property value="#equip.equipId"/></td>
        <td class="font3"><s:property value="#equip.equipName"/></td>
        <td class="font3"><s:property value="#equip.equipType"/> </td>
        <td class="font3"><s:property value="#equip.equipBirth"/></td>
        <td class="font3"><s:property value="#equip.warrantyDate"/></td>
        <td class="font3"><s:property value="#equip.equipFactory"/></td>
        <td class="font3"><img style="height: 50px;width: 50px"
    src='/equip/equip_qrCode?codeContent=http://172.18.25.206:8080/equip/equip_detail?codeContent=<s:property value="#equip.equipment" />' alt="二维码加载失败"/>
    </td>
        </s:iterator>
    </tr>
    <td align="center" colspan="8">
        <a class="btn btn-primary"  href="/pages/equip_save.jsp">添加设备</a>
    </td>
    </tbody>
</table>
</body>
</html>
