<%--
  Created by IntelliJ IDEA.
  User: Fonrye
  Date: 2020/5/28
  Time: 10:17
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
    <title>报修申请表填写</title>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="text-align: center; font-size: 30px;">报修申请表填写</h3>
    </div>
    <div class="panel-body">

        <form class="form-horizontal" role="form" action="/apply/apply_save" method="post">
            <div class="form-group">
                <label  class="col-sm-2 control-label">申请单号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="applyId">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">所属部门</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="department">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备名称</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipName">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">所在实验室</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipLab">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备编号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipId" >
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">报修人</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="applyPerson" >
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">设备类型</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="equipType" >
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">故障现象说明</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="description" >
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