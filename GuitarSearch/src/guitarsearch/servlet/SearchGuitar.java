package guitarsearch.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guitarsearch.daoImpl.InventoryDaoImpl;
import guitarsearch.domain.Guitar;

/**
 * Servlet implementation class SearchGuitar
 */
@WebServlet("/SearchGuitar")
public class SearchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset = utf-8");
		PrintWriter pw = response.getWriter();
		
		String j = "{\"success\": true, \"row\": [";
		Guitar searchGuitar = new Guitar();
		
		searchGuitar.setBuilder(request.getParameter("builder"));
		searchGuitar.setModel(request.getParameter("model"));
		searchGuitar.setType(request.getParameter("type"));
		searchGuitar.setBackWood(request.getParameter("backWood"));
		searchGuitar.setTopWood(request.getParameter("topWood"));
		InventoryDaoImpl inv = new InventoryDaoImpl();
		Guitar guitar = null;
		guitar = inv.searchGuitar(searchGuitar);
		if(guitar != null) {
			j += "{";
			j += "\"serialNumber\":\"" + guitar.getSerialNumber() + "\", ";
			j += "\"builder\":\"" + guitar.getBuilder() + "\", ";
			j += "\"model\":\"" + guitar.getModel() + "\", ";
			j += "\"type\":\"" + guitar.getType() +"\", ";
			j += "\"backWood\":\"" + guitar.getBackWood() + "\", ";
			j += "\"topWood\":\"" + guitar.getTopWood() + "\", ";
			j += "\"price\":" + guitar.getPrice() + "}";
			j += ", ";
		}
		
		if (j != "{\"success\": true, \"row\": [") {
			j = j.substring(0, j.length() - 2);
			j += "]}";
		} else {
			j = "{\"success\": false, \"row\": [{\"Tips\": \"找不到该产品\"}]}";
		}
		pw.print(j);
	}

}

/*
 * { "success": true, 
 * "rows": [{"serialNumber": 1, "price": 2222.22, "builder": "Collings",
 * 			"model": "CJ", "type": "acoustic", "backWood": "Indian Rosewood", "topWood": "Sitka"},
 */