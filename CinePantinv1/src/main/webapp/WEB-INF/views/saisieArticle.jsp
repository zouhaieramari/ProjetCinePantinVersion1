<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@include file="entete.jsp"%>

<div class="row">


	<div class="col-sm-2">
		<!-- zone menuLeft -->
		<%@include file="menuLeft.jsp"%>
	</div>

	<div class="col-sm-8">
		<!-- zone 2 (centrale) -->

		<div class="form-style-5">
<form:form method="POST" commandName="livre"  >
<legend> <span class="number"></span>Saisie Article</legend>
   <table>
    <tr>
        <td><form:label path="ISBN">ISBN</form:label></td>
        <td><form:errors path="ISBN"/><form:input path="ISBN"class="form-control" placeholder="Entrer ISBN" /></td>
    </tr>
    <tr>
        <td><form:label path="titre" >Titre</form:label></td>
        <td><form:errors path="titre"/><form:input path="titre" class="form-control" placeholder="Entrer Titre"/></td>
    </tr>
    <tr>
        <td><form:label path="auteur">Auteur</form:label></td>
        <td><form:errors path="auteur"/><form:input path="auteur" class="form-control" placeholder="Entrer Auteur" /></td>
    </tr>
      <tr>
        <td><form:label path="editeur">Editeur</form:label></td>
        <td><form:errors path="editeur"/><form:input path="editeur" class="form-control" placeholder="Entrer Editeur" /></td>
    </tr>
    <tr>
        <td><form:label path="nombrePage">Nombre de page</form:label></td>
        <td><form:errors path="nombrePage"/><form:input path="nombrePage" class="form-control" /></td>
    </tr>
    <tr>
        <td><form:label path="anneeParution">Annees Apparition</form:label></td>
        <td><form:errors path="anneeParution"/><form:input path="anneeParution"  type="date" class="form-control" placeholder="Entrer Annees Apparition" /></td>
    </tr>
      <tr>
        <td><form:label path="descriptif">Descriptif</form:label></td>
        <td><form:errors path="descriptif"/><form:input path="descriptif" class="form-control" placeholder="Entrer Descriptif" /></td>
    </tr>
    <tr>
        <td><form:label path="intitule">Intitulé</form:label></td>
        <td><form:errors path="intitule"/><form:input path="intitule" class="form-control" placeholder="Entrer Intitulé"/></td>
    </tr>
    <tr>
        <td><form:label path="nomPhoto" >Photo</form:label></td>
        <td><form:errors path="nomPhoto"/><form:input path="nomPhoto" type="file" class="form-control" /></td>
    </tr>
      <tr>
        <td><form:label path="prixHT">PrixHT</form:label></td>
        <td><form:errors path="prixHT"/><form:input path="prixHT" class="form-control"  /></td>
    </tr>
    <tr>
        <td><form:label path="quantiteStock">Quantite en stock</form:label></td>
        <td><form:errors path="quantiteStock"/><form:input path="quantiteStock" class="form-control"  /></td>
    </tr>
   
   <tr>
							<td colspan="2"><input type="submit" value="Submit"
								
								class="btn btn-default" /></td>
						</tr>

					</table>
				
			</form:form>
			<!--  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button> -->

		</div>

	</div>

	<div class="col-sm-2">
		<!-- zone menuRight -->
		<%@include file="menuRight.jsp"%>
	</div>

</div>

<%@include file="piedPage.jsp"%>

</body>
</html>
