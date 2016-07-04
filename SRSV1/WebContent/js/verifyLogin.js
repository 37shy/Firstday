
/**
 * authored by leoor
 * 2016年5月25日14:36:43
 */
$(document).ready(function() {

	$("#btnQuery").click(function(){	
		$.get("GuitarSearch", $("#myform").serializeArray(), function(data){
			var html = "";
			$("#r-tbody tr").remove();
			$("#tips").html("");
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
				$("#r-tbody").append(html);
			}else if(data['success'] === false){
				for(var i = 0; i < data.row.length; i++ ) {
					var r = data.row[i];
					html += "<span>" + r.Tips + "</span>";
				}
				$("#tips").append(html);
			}else {
				$("#tips").append('Something is wrong');
			}
		});			
	});
	
});