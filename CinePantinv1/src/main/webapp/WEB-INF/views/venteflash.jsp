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
							<td></td>
							<td></td>
							<td></td>


						</tr>
					</thead>
					<tbody>
						
							<c:forEach var="livre" items="${liste}">
<form:form method="POST" action="/produitajouterpanier.htm">
								<tr>

									<td>${livre.titre}</td>
									<td><img class="img-rounded" alt="" width="100"
										height="100" src="./resources/img/articles/${livre.nomPhoto}" onmouseover="bigImg(this)" onmouseout="normalImg(this)" border="0"  alt="Smiley" width="32" height="32"></td>
									<td>${livre.prixHT} €</td>
									<td><input type="hidden" name="idArticle" value="${livre.idArticle}"></td>
									
									<td><input type="image" src="./resources/img/logo/panier1.png"  width ="70" height="70"></td>
									
									 <!-- <input type="submit" value="Ajouter au panier"  /><img alt="" src="./resources/img/logo/panier1.png"> -->
								</tr>
</form:form>
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
	
</body>
</html>
