package srs.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Array;

import srs.domain.DataAccess;
import srs.domain.Section;

/**
 * Servlet implementation class SelectClasses
 */
@WebServlet("/SelectClasses")
public class SelectClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectClasses() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		ArrayList<Section> sections = DataAccess.createSRSDao().getAllSection();
		Section section = new Section();
		if(!sections.isEmpty()) {
			for(Section s: sections) {
				if(s.getId() == id) {
					section = s;
					break;
				}
			}
		}
		/*
		 * 验证先修课的成绩
		 **/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
