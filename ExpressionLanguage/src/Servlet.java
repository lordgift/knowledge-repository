

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().setAttribute("test", "application");
		request.setAttribute("test", "request");
		request.getSession().setAttribute("test","session");
		

		HttpSession session = request.getSession();
		session.setAttribute("sesParam1", "YOOOOHH");
		
		List<String> datas = new ArrayList<String>();
		datas.add("data1");
		datas.add("data2");
		datas.add("data3");
		datas.add("data4");
		session.setAttribute("datas", datas);
		
		request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
