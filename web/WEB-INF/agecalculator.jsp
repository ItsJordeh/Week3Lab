<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2020, 11:18:56 AM
    Author     : Jordan Davis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br><br>
            <input type ="submit" value="Age next birthday"><br><br>
            ${age}<br><br>
        </form>
        <form action="arithmetic">
            <input type ="submit" value="Arithmetic Calculator"/>
        </form>
    </body>
</html>
