<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>实验设备管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8"/>
    <meta name="keywords" content=""/>
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
    <link rel="stylesheet" href="../css/fontawesome-all.css">
    <link href="http://maxcdn.bootstrapcdn.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i"
          rel="stylesheet">
    <link href="http://maxcdn.bootstrapcdn.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i"
          rel="stylesheet">
</head>

<body>
<div id="bg">
    <canvas></canvas>
    <canvas></canvas>
    <canvas></canvas>
</div>
<h1>实验设备管理系统</h1>
<div class="sub-main-w3" >
    <form action="/sys/user_login" method="post">
        <h2>在此登录
            <i class="fas fa-level-down-alt"></i>
        </h2>
        <div class="form-style-agile">
            <label>
                <i class="fas fa-user"></i>
                账号
            </label>
            <input placeholder="Username" name="username" type="text" required="">
        </div>
        <div class="form-style-agile">
            <label>
                <i class="fas fa-unlock-alt"></i>
                密码
            </label>
            <input placeholder="Password" name="password" type="password" required="">
        </div>
        <input type="submit" value="登录">
    </form>
</div>
<div class="footer">
    <p>2018软件工程三班  孙方圆 201809601433</p>
</div>
<script src="../js/jquery-3.3.1.min.js"></script>
<script src="../js/canva_moving_effect.js"></script>
</body>

</html>