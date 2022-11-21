<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Login</title>
</head>
<body>
	
	<div align="center">
		<h1>Login Básico</h1>
		<div  align = "right">
			<input type="button" onclick="window.location.href='cadastroUsuario.jsp'" value="Cadastre-se">
		</div>
		
		<form action="login" method="post">
		
			<table>
				<tr>
					<td>Nome:</td>
					<td> <input type="text" name="username"></td>	
				</tr>
				
				<tr>
					<td>Senha:</td>
					<td> <input type="password" name="password"></td>
				
				</tr>
				<tr align="left">
					<td align="left"> <input type="submit" value="Acessar"></td>	
				</tr>
			
			</table>
	
		</form>
	
	</div>
</body>
</html>