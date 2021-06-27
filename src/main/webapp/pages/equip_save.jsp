<!DOCTYPE html>
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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>设备添加</title>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="text-align: center; font-size: 30px;">设备添加</h3>
    </div>
    <div class="panel-body">

        <form class="form-horizontal" role="form" action="/equip/equip_save" method="post">
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备标识</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="equipment">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备编号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipId">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备名称</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipName">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备类型</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipType">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备生产日期</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipBirth" >
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备保修日期</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="warrantyDate" >
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">厂商</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipFactory" >
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">提交保存</button>
                </div>
            </div>
        </form>

    </div>
</div>
</body>
</html>