<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuários</title>
</head>
<body>
	<div align="center">
		<h1>Cadastro Básico de Usuário</h1>
		<div align="right" width=50%>
			<input type="button" onclick="window.location.href='login.jsp'" value="Login">
		</div>
		
		<form action="cadastroUsuario" method="post">
		
			<table>
				<tr>
					<td>Nome:</td>
					<td> <input type="text" name="username"></td>	
				</tr>
				
				<tr>
					<td>Senha:</td>
					<td> <input type="password" name="password"></td>
				
				</tr>
				<tr>
					<td>Confirme a senha:</td>
					<td> <input type="password" name="confirmacao"></td>
				
				</tr>
				<tr align="left">
					<td align="left"> <input type="submit" value="Salvar"></td>	
				</tr>
			
			</table>
	
		</form>
	
	</div>
</body>
</html>