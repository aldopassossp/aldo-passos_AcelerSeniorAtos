<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro - Cadastro</title>
</head>
<body>
		<div align="center" width=50%>
			<h1>Erro ao efetuar o CADASTRO!</h1>
				<p>As senhas n�o conferem!</p>
				<p>Ou o usu�rio j� existe!</p>
			<p>Tente novamente ou fa�a LOGIN</p>

			<input type="button" onclick="window.location.href='login.jsp'" value="Login">
			<input type="button" onclick="window.location.href='cadastroUsuario.jsp'" value="Cadastre-se">
		</div>
</body>
</html>