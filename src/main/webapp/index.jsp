<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello servlet World!" %>
    </h1>
<br/>
    <a href="hello-servlet?nome=Ingrid Nogueira">Hello Servlet</a>

    <br>
    <form action="hello-servlet" method="get">
        Nome:
        <input type="text" name="nome"><br>
        E-mail:
        <input type="email" name="email"><br>
        Telefone:
        <input type="tel" name="fone"><br>
        <button type="submit">Login</button>
    </form>

</body>
</html>