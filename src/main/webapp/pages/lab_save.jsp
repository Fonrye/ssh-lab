<!DOCTYPE html>
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
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title" style="text-align: center; font-size: 30px;">实验室管理</h3>
    </div>
    <div class="panel-body">

        <form class="form-horizontal" role="form" action="/lab/lab_save" method="post">
            <div class="form-group">
                <label  class="col-sm-2 control-label">实验室编号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="labId">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">实验室名称</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="labName">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">机位数</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="computerNum">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">实验室责任老师</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="labTeacher">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">实验室技术人员</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="labTechnician" >
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