<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>@FormParam - Selamlar Gardaş</title>
</head>
<body>
	<h3>Kara Ambar Gamyoncular Derneği Yeni Üye Gaydı Formu :D</h3>
	<form action="rest/uye/giris" method="post">
		<table>
			<tr>
				<td>Kullanıcı</td>
				<td><input type="text" name="kullaniciAdi"></td>
			</tr>
			<tr>
				<td>Parola</td>
				<td><input type="password" name="kullaniciParola"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Gönder"></td>
			</tr>
		</table>
	</form>

	<form action="rest/uye/ekle" method="POST">
		<table>
			<tr>
				<td>Adı</td>
				<td><input type="text" name="personelAdi"></td>
			</tr>
			<tr>
				<td>Ülke</td>
				<td><input type="text" name="personelUlke"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Yeni Üye Gaydı Yap"></td>
			</tr>
		</table>
	</form>

</body>
</html>