<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师管理</title>
</head>
<style>
	* {
		margin: 0;
		padding: 0;
	}
	
	body {
		border-sizing: border-box;
		max-width: 600px;
		margin: 0 auto;
		display: flex;
		flex-direction: column;
		border-right: 1px dotted #000;
		border-left: 1px dotted #000;
		padding: 3em;
	}	
	
	h2 {
		margin-top: 20px;
	}
	
	p {
		margin-top: 1em;
	}
	
	select {
		width: 8em;
	}
	
	button {
		border：1px solid #000;
		width: 10em;
		margin-top: 10px;
	}
</style>
<body>
	<div id="wrapper">
		<h2>教师添加</h2>
		<form action="addTeacher" method="get">
			<p>
				教师名称：<input type="text" name="teacherName">
			</p>
			<p>
				教师职称：<input type="text" name="teacherTitle">
			</p>
			<p>
			学院：<select name="department">				
					<option>Information Technology</option>
					<option>Computational Social Sciences</option>
					<option>Physical Education</option>
				</select>			
			</p>
			<button type="submit">添加</button>
		</form>
	</div>
</body>
</html>