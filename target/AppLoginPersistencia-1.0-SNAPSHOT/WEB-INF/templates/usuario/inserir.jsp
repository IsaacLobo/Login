<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Login</h1>
        <form:form action="/usuario/inserirAction" method="post" modelAttribute="login">
            <fieldset>
                <legend>Dados Login:</legend>
                <label>E-mail:</label>
                <form:input type="email" path="email" />
                <label>Senha:</label>
                <form:input type="password" path="senha" />              
            </fieldset>                
            <form:button>Cadastrar</form:button>
        </form:form>
    </body>
</html>
