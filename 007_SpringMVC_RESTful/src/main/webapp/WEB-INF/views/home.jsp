<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<title>Selamlar (: Bootstrap Spring MVC</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Personeller İçin Yeni Üye Kaydı</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Adı</th>
					<th>Şehir</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${adiSoyadi}</td>
					<td>${sehir}</td>
					<td>${email}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>