<%--
  User: 1
  Date: 2021/11/26
  Time: 23:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <style>
        @font-face {
            font-family: 'ruixian';
            src: url("source/fonts/RuiZiRuiXianNuFangHeiJian1-0-1.ttf");
        }

        body {
            background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);
            font-family: ruixian;
            font-weight: 500;
            color: #96d3ce;
        }

        .info {
            position: relative;
            height: 100px;
            line-height: 100px;
            width: 1200px;
            font-size: 40px;
            /*color: #ffffff;*/
            text-align: center;
            margin: 0 auto;
            background-color: #ffffff;
            border-radius: 10px;
        }

        .pic {
            height: 800px;
            width: 1200px;
            margin: 0 auto;
        }

        .pic > img {
            width: 100%;
            height: 100%;
            border-radius: 10px;

        }

        a {
            margin: 0 auto;
            color: #96d3ce;
            position: fixed;
            font-size: 32px;
            height: 70px;
            line-height: 70px;
            width: 210px;
            display: block;
            text-decoration: none;
            border-radius: 5px;
            left: 30px;
            top: 30px;
            background-color: white;
            text-align: center;

        }
    </style>
    <title>Error</title>
</head>
<body>
<a href="loginAndRegister.html">回到登陆界面</a>
<div class="info">要么是狗狗把你的页面吃掉了，要么就是${info}。</div>
<div class="pic">
    <img src="source/images/dogBg.jpeg" alt="">
</div>

</body>
</html>

