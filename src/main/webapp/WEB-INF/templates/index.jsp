<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Login</h1>
        <h2>${mensagem}</h2>
        <form method="post" action="${pageContext.request.contextPath}/usuario/login">
            <label>Usuário</label>
            <input name="username"/>
            <label>Senha</label>
            <input type="password" name="password" />
            <input type="submit" value="Logar" />
        </form>
            <form action="/usuario/inserir">
                <input type="submit" value="Cadastrar" />
            </form>
    </body>
</html>
