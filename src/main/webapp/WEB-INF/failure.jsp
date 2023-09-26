<%@ page import="com.example.questone.entities.User" %><%--@elvariable id="fail" type="com.example.questone.model.Data_base"--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quest</title>
    <style>
        body { background: url(/wallpaper.jpg);}
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="color: aliceblue">
<div>${fail}</div>
<H1>Вы проиграли</H1>
<%
    HttpSession session1 = request.getSession();
    User user =  (User) session1.getAttribute("user");
    int gameCount = user.getGameCount() + 1;
    user.setGameCount(gameCount);
%>
<form class="form-horizontal" method="post" action="question">
    <fieldset>
        <legend></legend>
        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="singlebutton"></label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-primary">Рестарт</button>
            </div>
        </div>

    </fieldset>
</form>




</body>
</html>
