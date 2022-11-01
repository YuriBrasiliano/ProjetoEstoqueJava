<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema De Estoque</title>
<style>
	html {
	position: relative;
width: 100%;min-height:100vh;background:#9053c7;background:-webkit-linear-gradient(-135deg,#c850c0,#4158d0);background:-o-linear-gradient(-135deg,#c850c0,#4158d0);background:-moz-linear-gradient(-135deg,#c850c0,#4158d0);background:linear-gradient(-135deg,#c850c0,#4158d0)}
	#title{
	  position: absolute;
  top: 35%;
  left: 25%;
	}
	#content{
		  position: absolute;
  top: 30%;
  left: 55%;
	}
	#content a{
	color:white;}
</style>
</head>
<body>
<div id="title">
	<h1>Cadastro de Produtos</h1>
	</div><div id="content">
	<a href="incluir.jsp">Incluir Produto</a><br /><br />
	<a href="atualizar.jsp">Atualizar Produto</a><br /><br />
	<a href="consultar.jsp">Consultar Produto</a><br /><br />
	<a href="excluir.jsp">Excluir Produto</a><br /><br />
	<a href="listProdutos.jsp">Listar Produtos</a><br /><br />
	</div>
</body>
</html>
