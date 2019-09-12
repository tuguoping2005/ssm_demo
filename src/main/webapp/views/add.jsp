<%--
  Created by IntelliJ IDEA.
  User: willy
  Date: 2019/9/11
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD PERSON</title>
</head>
<body>
<h1>ADD PERSON</h1>
    <form action="/demo/insert" method="post" >
        ID:<input type="text" id="id" name="id" ><br>
        NAME:<input type="text" id="name" name="name" ><br>
        AGE:<input type="text" id="age" name="age" ><br>
        SEX:<input type="text" id="sex" name="sex" ><br>
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>
