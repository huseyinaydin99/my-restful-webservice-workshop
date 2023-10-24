<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yükleme(upload) sayfası!</title>
</head>
<body>

	<form action="rest/file/upload" method="post"
		enctype="multipart/form-data">
		<p>
			Gözat butonundan bir adet dosya seçiver reis! : <input type="file" name="file" size="60">
		</p>
		<input type="submit" value="Yükle Bakalım! (:">
	</form>

</body>
</html>