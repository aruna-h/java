<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='yellow'>
<form action="LoginClass" method="post">
		user name:<input type="text" name="u" /><br> 
		email:<input type="text" name="e" /><br> 
		password:<input type="password" name="p" /><br> 
		<input type="submit" value="login" />
		<input type="reset" value="reset">
	</form>
	<form action="PreEmail" method = "post" > <input type="submit" value="Forgot Password??"></form>
</body>
</html>