<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="primefaces.css" />
    <script src="primefaces.js"></script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<jsp:useBean id = "exemploBean" class = "dev.lucasmachado.rangprocessoseletivo.bean.UnidadeSaudeBean" />
<p>The date/time is <%= exemploBean.getUnidades() %>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>