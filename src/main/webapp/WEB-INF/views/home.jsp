<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<form action="${context}/users/save" method="POST">
		<label>Name</label> <input name="name" type="text">
		<br>
		<label>Email</label> <input name="email" type="text">
		<br>
		<label>Password</label> <input name = "password" type="text">
		<br>
		<button type="submit">OK</button>
	</form>
	<a href="${context}/users">Show Users</a>
</body>
</html>
