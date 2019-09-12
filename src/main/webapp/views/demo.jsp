<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta name="viewport"
      content="width=device-width,
minimum-scale=1.0, maximum-scale=2.0" />
<head>
    <title>test</title>
    <style type="text/css">
        ul {
            list-style:none;
            margin-top: 15%;
            font-size: smaller

        }

        li{
            line-height: 30px;
            color: black;

        }
        .title{
            margin-top: 10%;
            color: #48a94c;
            font-weight: bold;
            font-size: smaller

        }
        .hr0{
            width: 100%;
            float: left
        }
        .userInfo{
            margin-left: 90px
        }
    </style>
</head>

<body>
<div class="title">you register message</div>
<hr class="hr0"/>

<ul>
    <li>id<span class="userInfo">${demo.id}</span></li>
    <li>name<span class="userInfo">${demo.name}</span></li>
    <li>age<span class="userInfo">${demo.age}</span></li>
    <li>sex<span class="userInfo">${demo.sex}</span></li>
</ul>

<div class="title">test</div>
<hr class="hr0"/>
</body>
</html>