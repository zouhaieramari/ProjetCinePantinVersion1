<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="entete.jsp"%>

<div class="row">


	<div class="col-sm-2">
		<!-- zone menuLeft -->
		<%@include file="menuLeft.jsp"%>
	</div>

	<div class="col-sm-8">

		<div class="row">
			<c:forEach var="livre" items="${liste1}">
			<form:form method="POST" action="/ajouter.htm">
				<div class="col-sm-4">
					<div class="thumbnail zoneLivre">
						<img class="img-responsive" src="./resources/img/articles/${livre.nomPhoto}"
						 alt="photo livre" >
						<p>
							<strong>${livre.titre} ${livre.prixHT} €</strong>
						</p>
						<p>${livre.descriptif}</p>
						<input type="submit" value="Ajouter au panier"  />
					</div>
				</div>
				</form:form>
			</c:forEach>
		</div>


		<div class="row">
			<c:forEach var="livre" items="${liste2}">
				<div class="col-sm-4">
					<div class="thumbnail zoneLivre">
						<img class="img-responsive" src="./resources/img/articles/${livre.nomPhoto}"
						 alt="photo livre">
						<p>
							<strong>${livre.titre} ${livre.prixHT} €</strong>
						</p>
						<p>${livre.descriptif}</p>
						<button class="btn">Ajouter au panier</button>
					</div>
				</div>
			</c:forEach>
		</div>

		<div class="row">
			<c:forEach var="livre" items="${liste3}">
				<div class="col-sm-4 ">
					<div class="thumbnail zoneLivre">
						<img class="img-responsive" src="./resources/img/articles/${livre.nomPhoto}"
						 alt="photo livre">
						<p>
							<strong>${livre.titre} ${livre.prixHT} €</strong>
						</p>
						<p>${livre.descriptif}</p>
						<button class="btn">Ajouter au panier</button>
					</div>
				</div>
			</c:forEach>
		</div>

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
