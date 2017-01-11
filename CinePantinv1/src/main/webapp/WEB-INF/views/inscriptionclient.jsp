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

			<form:form method="POST" commandName="client" role="form">
				<fieldset>
					<legend> <span class="number"></span>Inscrivez-Vous</legend>

					<table>

						<tr>
							<td><form:label path="nom">Nom </form:label></td>
							<td><form:errors path="nom" />
								<form:input path="nom" class="form-control"
									placeholder="Entrer Nom" /></td>

						</tr>
						<tr>
							<td><form:label path="prenom">Prenom</form:label></td>
							<td><form:errors path="prenom" />
								<form:input path="prenom" class="form-control" placeholder="Entrer Prenom" /></td>

						</tr>
						<tr>
							<td><form:label path="dateNaissance">Date de Naissance</form:label></td>
							<td><form:errors path="dateNaissance" cssclass="error" />
								<form:input path="dateNaissance" type="date"
									class="form-control" placeholder="Entrer Date de Naissance" /></td>
						</tr>
						<tr>
							<td><form:label path="telephone">Telephone</form:label></td>
							<td><form:errors path="telephone" />
								<form:input path="telephone" class="form-control" placeholder="Entrer Numero de Telephone" /></td>
						</tr>

						<tr>
							<td><form:label path="email">Email</form:label></td>
							<td><form:errors path="email" />
								<form:input path="email" type="email" class="form-control" placeholder="Entrer Votre Email" /></td>
						</tr>
						<tr>
							<td><form:label path="passWord">PassWord</form:label></td>
							<td><form:errors path="passWord" />
								<form:input path="passWord" type="password" class="form-control" placeholder="Entrer Votre Password"/></td>
						</tr>
						<tr>
							<td><b>Adresse</b></td>
						</tr>
						<tr>
							<td ><form:label path="adresse.rue">rue</form:label></td>
							<td><form:errors path="adresse.rue" />
								<form:input path="adresse.rue" class="form-control" placeholder="Entrer Rue"/></td>
						</tr>
						<tr>
							<td ><form:label path="adresse.codePostale">codePostale</form:label></td>
							<td><form:errors path="adresse.codePostale" />
								<form:input path="adresse.codePostale" class="form-control" placeholder="Entrer Code Postale" /></td>
						</tr>
						<tr>
							<td ><form:label path="adresse.ville">ville</form:label></td>
							<td><form:errors path="adresse.ville" />
								<form:input path="adresse.ville" class="form-control" placeholder="Entrer Ville" /></td>
						</tr>
						<tr>
							<td ><form:label path="adresse.pays">pays</form:label></td>
							<td><form:errors path="adresse" />
								<form:input path="adresse.pays" class="form-control" placeholder="Entrer Pays" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Submit"								
								class="btn btn-default" /></td>
						</tr>

					</table>
				</fieldset>
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
