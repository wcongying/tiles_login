<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<body>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<div align="center">
    <form action="${path}/login" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
        <table>
            <tr>
                <td>username</td>
                <td><input type="text" placeholder="username" name="username"></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" placeholder="password"name="password"></td>
                <td><span>${msg}</span></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Login">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
