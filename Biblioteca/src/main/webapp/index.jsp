<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario</title>
    <link rel="stylesheet" href="adiciona-contato.css">
</head>
<body>
<h1>Preencha o formulário:</h1>
<hr/>
<form action="Biblioteca/adicionaContato" method="POST">
    <label>Nome:</label> <input type="text" name="form-nome" required/><br/>
    <label>E-mail:</label> <input type="email" name="form-email" required/><br/>
    <label>Endereço:</label> <input type="text" name="form-endereco" required/><br/>
    <label>Data Nascimento:</label> <input type="date" name="form-dataNascimento" required/><br/>
    <input type="submit" value="Enviar"/>
</form>
</body>
</html>
