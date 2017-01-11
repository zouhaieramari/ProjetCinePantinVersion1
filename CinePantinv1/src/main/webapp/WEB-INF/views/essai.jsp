<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet" type="text/css" href="./resources/css/style.css">
<html>
<head>
    <title>Saisie Article</title>
</head>
<body>
<div class="form-style-5">
<h2>Saisie Article</h2>
<form:form method="POST" commandName="livre"  >
   <table>
    <tr>
        <td><form:label path="ISBN">ISBN</form:label></td>
        <td><form:errors path="ISBN"/><form:input path="ISBN" /></td>
    </tr>
    <tr>
        <td><form:label path="titre" >Titre</form:label></td>
        <td><form:errors path="titre"/><form:input path="titre" /></td>
    </tr>
    <tr>
        <td><form:label path="auteur">Auteur</form:label></td>
        <td><form:errors path="auteur"/><form:input path="auteur" /></td>
    </tr>
      <tr>
        <td><form:label path="editeur">Editeur</form:label></td>
        <td><form:errors path="editeur"/><form:input path="editeur" /></td>
    </tr>
    <tr>
        <td><form:label path="nombrePage">Nombre de page</form:label></td>
        <td><form:errors path="nombrePage"/><form:input path="nombrePage" /></td>
    </tr>
    <tr>
        <td><form:label path="anneeParution">Annees Apparition</form:label></td>
        <td><form:errors path="anneeParution"/><form:input path="anneeParution"  type="date" /></td>
    </tr>
      <tr>
        <td><form:label path="descriptif">Descriptif</form:label></td>
        <td><form:errors path="descriptif"/><form:input path="descriptif" /></td>
    </tr>
    <tr>
        <td><form:label path="intitule">Intitulé</form:label></td>
        <td><form:errors path="intitule"/><form:input path="intitule" /></td>
    </tr>
    <tr>
        <td><form:label path="nomPhoto" >Photo</form:label></td>
        <td><form:errors path="nomPhoto"/><form:input path="nomPhoto" type="file"/></td>
    </tr>
      <tr>
        <td><form:label path="prixHT">PrixHT</form:label></td>
        <td><form:errors path="prixHT"/><form:input path="prixHT" /></td>
    </tr>
    <tr>
        <td><form:label path="quantiteStock">Quantite en stock</form:label></td>
        <td><form:errors path="quantiteStock"/><form:input path="quantiteStock" /></td>
    </tr>
   
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
           
        
    </tr>
    <tr>
        <td colspan="2">
         <a href="home.htm" > <input type="text" value="Retour"/></a>
           
        
    </tr>
    </div>
</table>  
</form:form>
</body>
</html>
	
	
	
	