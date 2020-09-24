<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2020, 12:04:07 PM
    Author     : Jordan Davis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action ="arithmetic">
            
            First Value:  <input type="text" name="value1" value="${value1}"><br><br>
            Second Value: <input type="text" name="value2" value="${value2}"><br><br>
        <input type="submit" name="operation" value="+"/><input type="submit" name="operation" value="-"/>
        <input type="submit" name="operation" value="*"/><input type="submit" name="operation" value="%"/>
        <br><br>
        ${result}
        <br><br>
        </form>
        <form action="age">
            <input type ="submit" value="Age Calculator"/>
        </form>
            
    </body>
</html>
