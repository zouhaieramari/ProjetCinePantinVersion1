<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" type="text/css" href="./resources/css/style.css">
<link rel="stylesheet" type="text/css"
	href="./resources/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="./resources/css/bootstrap.min.css">
<%@include file="entete.jsp"%>

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
							<td>ISBN</td>
							<td>titre</td>
							<td>Auteur</td>
							<td>Editeur</td>
							<td>Nombre de page</td>
							<td>Annees Apparition</td>
							<td>Descriptif</td>
							<td>Intitulé</td>
							<td>Photo</td>
							<td>PrixHT</td>
							<td>Quantite en stock</td>

						</tr>
					</thead>
					<tbody>

						<c:forEach var="livre" items="${liste}">

							<tr>

								<td>${livre.ISBN}</td>
								<td>${livre.titre}</td>
								<td>${livre.auteur}</td>
								<td>${livre.editeur}</td>
								<td>${livre.nombrePage}</td>
								<td>${livre.anneeParution}</td>
								<td>${livre.descriptif}</td>
								<td>${livre.intitule}</td>
								<td><img class="img-rounded" alt="" width="100"
									height="100" src="./resources/img/articles/${livre.nomPhoto}"></td>
								<td>${livre.prixHT}</td>
								<td>${livre.quantiteStock}</td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

			</div>

			<div class="col-sm-2">
				<!-- zone menuRight -->
				<%@include file="menuRight.jsp"%>
			</div>

		</div>

		<%@include file="piedPage.jsp"%>
	</div>
</body>
</html>
