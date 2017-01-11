<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"href="./resources/css/bootstrap.min.css">
<!--  <link rel="stylesheet" type="text/css"href="./resources/css/style.css">-->
<link rel="stylesheet" type="text/css"href="./resources/css/bootstrap-dialog.css">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>

<script>
    function showmes() {
    	if ('${showConfirmationDialog}'=='true'){
    		$("#modaleconfirmation").modal();
    	}
    }
</script>
    	
<title>Home</title>
</head>

<body onLoad="showmes()">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-2">
				<img class="img-rounded" alt="" width="200" height="130"
					src="./resources/img/1.jpg">
			</div>
			<div class="col-sm-10">

				<h1>CinemaClic !</h1>

				
				<a class="btn btn-primary" href="ajouterArticle.htm"> Ajouter Article </a>
				<a class="btn btn-warning" href="inscription.htm"> Inscrivez vous </a>
				<a class="btn btn-danger" href="afficheArticle.htm"> Liste Article </a>
				<a class="btn btn-info" href="guideachat.htm"> Meilleur Vente</a>
				<a class="btn btn-success" href="venteflash.htm" > vente flash</a>
				<a class="btn btn-primary" href="home.htm"> home</a>
				<a class="btn btn-info" href="panier.htm"> panier</a>
				<a class="btn btn-primary" href="contact.htm">Contact </a>


			</div>
		</div>
