<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Guitar Seacher</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">	
</head>
<body>
	<header id="header">
		<span>吉他商城</span>
		<span> 欢迎光临！</span>
	</header>
	<section id="wrap">
		<div id="search-form">
			<form method="get" action="SearchGuitar">
				<ul>
<!-- 					<li>
						<label for="serialNumber">货号:</label>
						<input type="input" name="serialNumber" placeholder="Serial Number" id="serialNumber">
					</li> -->

					<li>
						<label for="builder">产商:</label>
						<input type="input" name="builder" placeholder="builder" id="builder">
					</li>

					<li>
						<label for="model">型号:</label>
						<input type="input" name="model" placeholder="model" id="model">
					</li>

					<li>
						<label for="type">种类:</label>
						<input type="input" name="type" placeholder="type" id="type">
					</li>

					<li>
						<label for="backWood">背部材料:</label>
						<input type="input" name="backWood" placeholder="back wood" id="backWood">
					</li>
					<li>
						<label for="">前部材料:</label>
						<input type="input" name="topWood" placeholder="top wood" id="topWood">
					</li>
<!-- 					<li>
						<label for="price">价格:</label>
						<input type="input" name="price" placeholder="price" id="price">
					</li> -->
				</ul>
				<input type="submit" name="submit" value="search">
			</form>
		</div>
		<div id="result-show">
			<h2>Results</h2>
			<table border="1">
				<thead>
					<tr>
						<th>编号</th>
						<th>产商</th>
						<th>样式</th>
						<th>种类</th>
						<th>背面材料</th>
						<th>前部材料</th>
						<th>价格</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>