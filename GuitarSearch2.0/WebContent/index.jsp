<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>吉他搜索 2.0</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="js/jquery-2.2.0.min.js"></script>	
</head>
<body>
	<header id="header">
		<span>吉他商城</span>
		<span> 欢迎光临！</span>
	</header>
	<section id="wrap">
		<div id="search-form">
			<form id="myform">
				<ul>
					<li>
						<label for="builder">产商:</label>
						<input type="input" name="builder" placeholder="builder" id="builder">
					</li>

					<li>
						<label for="model">型号:</label>
						<input type="input" name="model" placeholder="model" id="model">
					</li>
					
					<li>
						<label for="numStrings">弦数:</label>
						<input type="input" name="numStrings" placeholder="model" id="model">
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

				</ul>
				<input type="button" name="submit" value="search" id="btnQuery">
			</form>
		</div>
		<div id="result-show">
			<h2>Results</h2>
			<table border="1">
					<tr>
						<th>编号</th>
						<th>产商</th>
						<th>样式</th>
						<th>种类</th>
						<th>背面材料</th>
						<th>弦数</th>
						<th>前部材料</th>
						<th>价格</th>
					</tr>
				<tbody>
					
				</tbody>
			</table>
		</div>
	</section>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#btnQuery").click(function(){	
			$.get("SearchGuitar", $("#myform").serializeArray(), function(data){
				var html = "";
				$("table tr:gt(0)").remove();
				if(data['success'] === true) {
					for(var i=0; i < data.row.length; i++) {
						var r = data.row[i];
						html += "<tr><td>" + r.serialNumber + "</td>";
						html += "<td>" + r.builder + "</td>";
						html += "<td>" + r.model + "</td>";
						html += "<td>" + r.stringNumber + "</td>";
						html += "<td>" + r.type + "</td>";
						html += "<td>" + r.backWood + "</td>";
						html += "<td>" + r.topWood + "</td>";		
						html += "<td>" + r.price + "</td></tr>";
					}
					$("table").append(html);
				}else if(data['success'] === false){
					for(var i = 0; i < data.row.length; i++ ) {
						var r = data.row[i];
						html += "<span>" + r.Tips + "</span>";
					}
					$("table").append(html);
				}else {
					$("table").append('Something is wrong');
				}
			});			
		});
		
	});	
	</script>
</body>
</html>