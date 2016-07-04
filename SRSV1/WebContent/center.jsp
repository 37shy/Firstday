<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<style>
	body {
		max-width: 800px;
		height: auto;
		margin: 20px auto 20px;
		border-left:1px dotted #000;
		border-right: 1px dotted #000;
	}
	
	option {
		width: 5em;
	}
	
	a {
		text-decoration: none;
		color: #000;
	}
</style>
<body>
	<div id="wrapper">
		${sessionScope.login}你好
		<div id="head">
			<ul>
				<li>查看课程安排，请选择学期
				<form id="semester" action="Schedule" method="get">
					<p>
						<select name="semester">
							<option value="spring">春季</option>
							<option value="fall">秋季</option>
						</select>
					</p>
					<p>
						<input type="submit" value="确认查看">
					</p>
				</form>
				</li>
				<li>
					<button>
						<a href="transcript.jsp">查看成绩</a>
					</button>
				</li>
				<li>
					<button>
						<a href="selectedCourses.jsp">查看选课情况</a>
					</button>
				</li>
			</ul>
		</div>
		<div id="content">
			
		
		</div>
	</div>
</body>
</html>