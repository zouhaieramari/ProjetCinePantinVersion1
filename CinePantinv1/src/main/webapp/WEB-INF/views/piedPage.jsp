<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	function bigImg(x) {
		x.style.height = "200px";
		x.style.width = "200px";
	}

	function normalImg(x) {
		x.style.height = "100px";
		x.style.width = "100px";
	}
</script>
<div class="row">
	<div class="col-sm-12">





<style>
.nav-tabs li a {
    color: #777;
}
</style>


<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#home">À propos</a></li>
  <li><a data-toggle="tab" href="#menu1">Aide</a></li>
  <li><a data-toggle="tab" href="#menu2">Assistant</a></li>
</ul>

<div class="tab-content">
  <div id="home" class="tab-pane fade in active">
    <h2>CinemaClic ! </h2>
    <p>Aujourd’hui CinemaClic ................</p>
  </div>
  <div id="menu1" class="tab-pane fade">
    <h2>Aide</h2>
    <p>Modifier ou annuler des commandes</p>
  </div>
  <div id="menu2" class="tab-pane fade">
   <h2>Assistance</h2>
    <p>CinemaClic Assistant vous aide à prendre des décisions avisées pour vos achats en ligne.</p>
  </div>
</div>



</div>
</div>

<!-- Modal -->
<div class="modal fade" id="modaleconfirmation" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header bg-primary">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">${titreDialogue}</h4>
			</div>
			<div class="modal-body">
				<p>${texteDialogue}</p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
			</div>
		</div>

	</div>
</div>







<!-- Modal identification -->
<div id="modalidentification" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
			<div class="modal-content">
			<div class="modal-header bg-primary">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">${titreDialogue}</h4>
			</div>
			<div class="modal-body">
				<form:form method="POST" commandName="client" role="form">
				<div class="form-group">
					<label for="email">Email address:</label> <input type="email"
						class="form-control" id="email">
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						class="form-control" id="pwd">
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form:form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
			</div>
		</div>

	</div>
</div>




