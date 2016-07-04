package srs.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import srs.dao.UserDao;
import srs.domain.DataAccess;
import srs.domain.Person;
import srs.domain.Type;

/**
 * Servlet implementation class LoginVerify
 */
@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = utf-8");
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		Type type = Type.valueOf(request.getParameter("person"));	
		Person loginUser = new Person(username, pwd, type);
		UserDao userDao = DataAccess.createUserDao();
		boolean b = userDao.verifyLoginUser(loginUser);
		if(b) {
			request.getSession().setAttribute("login", username);
			request.getRequestDispatcher("center.jsp").include(request, response);
		}else {
/*			PrintWriter out = response.getWriter();
			String j = "{\"status\": \"false\", {\"tips\": \"用户名或密码或用户类型不正确\"}}";	
			out.println(j);*/
			response.sendRedirect("index.html");
		}
	}

}
