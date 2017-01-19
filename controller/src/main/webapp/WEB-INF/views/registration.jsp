<%--
  Created by IntelliJ IDEA.
  User: Figli
  Date: 19.01.2017
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Registration Form</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"/>
</head>

<body>

<div class="container">
    <form id="register-form" action="http://phpoll.com/register/process" method="post" role="form" style="display: none;">
        <div class="form-group">
            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
        </div>
        <div class="form-group">
            <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
        </div>
        <div class="form-group">
            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
        </div>
        <div class="form-group">
            <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
        </div>
        <div class="form-group">
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3">
                    <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                </div>
            </div>
        </div>
    </form>
</div>
</body>

<%--<script type="text/javascript" src="/static/js/main.js"> </script>--%>

</html>