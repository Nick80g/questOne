<%--@elvariable id="anwser2" type="com.example.questone.model.Data_base"--%>
<%--@elvariable id="anwser1" type="com.example.questone.model.Data_base"--%>
<%--@elvariable id="question" type="com.example.questone.model.Data_base"--%>

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
<body style="color: aliceblue; " >

<div >
    <div>
        <p>${sessionScope.user.name}<br>
            ${requestScope.get("question")}
        </p>
    </div>
    <form class="form-horizontal" method="post" action="question">
        <fieldset>
            <legend></legend>
            <!-- Multiple Radios -->
            <div class="form-group">
                <label class="col-md-4 control-label" >Ваш ответ</label>
                <div class="col-md-4">
                    <div class="radio">
                        <label for="radios-0">
                            <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
                            ${requestScope.get("anwser1")}
                        </label>
                    </div>
                    <div class="radio">
                        <label for="radios-1">
                            <input type="radio" name="radios" id="radios-1" value="2">
                            ${requestScope.get("anwser2")}
                        </label>
                    </div>
                </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="singlebutton"></label>
                <div class="col-md-4">
                    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Ответить</button>
                </div>
            </div>

        </fieldset>
    </form>
    <div>
        <p>
            Статистика:<br>
            Имя: ${sessionScope.user.name}<br>
            Количество игр: ${sessionScope.user.gameCount}

        </p>
    </div>





<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</div>
</body>
</html>
