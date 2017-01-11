<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saisie Livre</title>
</head>
<body>

<form method="post" action="LivreController">
	ISBN : <input type="text" name="isbn" value="${ param.isbn}"/>${ erreurisbn}<br/>
	Auteur : <input type="text" name="auteur" value="${param.auteur}"/>${ erreurauteur}<br/>
	Editeur<input type="date"  name="editeur" value="${param.editeur}"/>${ erreurediteur}<br/>
	
	
	
	
	<input type="submit" value="Ajouter" name="boutonaction"/>
	
</form>
		<% session.getId(); %>	

</body>
</html>