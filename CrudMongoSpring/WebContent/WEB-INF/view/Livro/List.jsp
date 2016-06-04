<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros</title>
</head>
<body>

<a href="Adicionar">Adicionar</a>
<br><br>
<table>

<tr>
<th>Titulo</th>
<th>Autor</th>
<th>Ano</th>
<th></th>
</tr>
<c:forEach items="${livros}" var="livro">
<tr>
<td>${livro.titulo}</td>
<td>${livro.ator}</td>
<td>${livro.ano}</td>
<td><a href="Editar/${livro.id}">Editar</a></td>
<td><a href="Excluir/${livro.id}">Excluir</a></td>
</tr>

</c:forEach>
</table>

</body>
</html>