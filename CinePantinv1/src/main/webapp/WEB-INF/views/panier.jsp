
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="entete.jsp"%>

<link rel="stylesheet" type="text/css" href="./resources/css/style.css">

<div class="row">

	<div class="col-sm-2">
		<!-- zone menuLeft -->
		<%@include file="menuLeft.jsp"%>
	</div>

	<div class="col-sm-8">
		<!-- zone 2 (centrale) -->

		<table class="table table-striped">
			<thead>
				<tr>
					<td>Votre panier</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>


				</tr>
			</thead>
			<tbody>
				<form:form method="POST" action="/panier.htm">
					<c:forEach var="ligne" items="${listeLignes}">

						<tr>


							<td><img class="img-rounded" alt="" width="100" height="100"
								src="./resources/img/articles/${ligne.article.nomPhoto}"
								onmouseover="bigImg(this)" onmouseout="normalImg(this)"
								border="0" alt="Smiley" width="32" height="32"></td>
							<td>${ligne.article.titre}</td>
							<td>${ligne.article.prixHT}€</td>
							<td><input type="hidden" name="idArticle"
								value="${article.idArticle}"></td>
							<!-- <td><a href="produitajouterpanier.htm" target="contenu"><img  class="img-rounded" alt="" 
							 src="./resources/img/logo/ajouterpanier.png"></a></td>   -->


							<!-- <input type="submit" value="Ajouter au panier"  /><img alt="" src="./resources/img/logo/panier1.png"> -->
							<td align="right">Quantité :</td>
							<td align="center"><input type="number" name="quantite"
								value="<c:out value="${ligne.quantite}" />"></td>
							<!--
							 le chemin du projet le nom cinePantinV1.... ${pageContext.request.contextPath}
							 le chemin ver le controller qui doit intersepter le todo dans le AcceuilController le controller responsable
							 /supprimerDuPanier.htm
							? c est le passage de parametre on la appler idArticlerecupere  il contien l id 
							de l article (ligne.article.idArticle) c a d on integre l identifient de l article qu on va supprimer 
							?idArticlerecupere=${ligne.article.idArticle}
							  -->
							<td><a
				href="${pageContext.request.contextPath}/supprimerDuPanier.htm?idArticlerecupere=${ligne.article.idArticle}">Supprimer</a></td>
						</tr>


					</c:forEach>
				</form:form>
			</tbody>

		</table>
	</div>


	<div class="col-sm-2">
		<table>
			<tr>
				<td>Sous-total (${nbPanier} articles):</td>
			</tr>

			<tr>
				<td>EUR ${prixPanier}</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>

			<tr>
				<td><a href="#demo" data-toggle="collapse"> <img alt=""
						width="170" height="50" src="./resources/img/logo/commande.png">
				</a>
					<div id="demo" class="img-rounded">
						<p>pour passer le commande vous devez connecter</p>
						<p></p>
						<p></p>
					</div></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="center">OU</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><a data-toggle="modal" data-target="#modalidentification">Identifiez-vous</a>
					pour activer la commande 1-Click.</td>
			</tr>

		</table>
		<%@include file="menuRight.jsp"%>
	</div>

</div>






<%@include file="piedPage.jsp"%>

</body>
</html>

