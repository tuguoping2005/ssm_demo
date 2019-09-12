<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>main page</title>
    <style type="text/css">
        tr{
            text-align: center;
        }

    </style>
</head>
<body>

<a href="/views/add.jsp">add person</a>
<table border="1" style="margin: auto;background-color: orange" width="500px">
    <tr style="text-align: center">
        <th>ID</th>
        <th>NAME</th>
        <th>SEX</th>
        <th>AGE</th>
        <th>OPERATE</th>
    </tr>
    <tbody>
    <c:forEach items="${list}" var="item">
        <tr >
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.sex}</td>
            <td>${item.age}</td>
            <td >
                <a href="/demo/deleteByPrimaryKey/${item.id}">DELETE</a>
                <a href="/demo/selectById/${item.id}">UPDATE</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>

</body>
</html>
