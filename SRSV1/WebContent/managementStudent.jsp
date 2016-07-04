<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程管理</title>
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
		<h2>课程添加</h2>
		<form action="addCourse" method="get">
			<p>
				课程编号：<input type="text" name="CourseNo">
			</p>
			<p>
				课程名称：<input type="text" name="courseName">
			</p>
			<p>
			课程学分：<select name="credits">
							<option value="0.5">0.5</option>				
							<option value="1.0">1.0</option>				
							<option value="1.5">1.5</option>				
							<option value="2.0">2.0</option>				
							<option value="2.5">2.5</option>				
							<option value="3.0">3.0</option>				
						</select>			
			</p>
			<p>
				先修课程：
				<select name="prerequisites">
<%-- 					<c:forEach var="course" items="${}">
						<option></option>
					</c:forEach> --%>
				</select>
			</p>
			<button type="submit">添加</button>
		</form>
	</div>
</body>
</html>