<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		Welcome to nerchuko
		
		<form action="addAlien" method="post">
		Enter your id <input type="text" name ="aid"/>
		<br>
		Enter your name <input type="text" name="aname"/>
		<input type="submit">
		</form>

		<br>
		<br>
------------------------------------------------------------------
		<form action="getAlien" method="get">
			Enter your id <input type="text" name ="aid"/>
			<br>
			<input type="submit" name="add">
			</form>

			-----------------------------------------------------------------
		<form action="deleteAlien" method="post">
			Enter your id <input type="text" name ="aid"/>
			<br>
			<input type="submit" name="delete">
			</form>

			-----------------------------------------------------------------
			<form action="getAlienbyName" method="get">
				Enter your name <input type="text" name ="aName"/>
				<br>
				<input type="submit" name="getAlienByName">
				</form>
	</body>
</body>
</html>