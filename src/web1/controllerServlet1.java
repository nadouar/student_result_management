package web1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import DAO1.resultDaoImpl;
import DAO1.resultdao;
import result.entities1.result;

/**
 * Servlet implementation class controllerServlet
 */
@WebServlet(name="cs",urlPatterns= {"/controleur","*.do"})
public class controllerServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    resultdao result;
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		result =new resultDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String path=request.getServletPath();
		if (path.equals("/index.do"))
		{
		request.getRequestDispatcher("allstudentresult.jsp").forward(request,response);
		}
		else if (path.equals("/chercher1.do"))
		{

		String motCle1=request.getParameter("motCle1");
		resultModel model1 =new resultModel();
		model1.setMotCle1(motCle1);
		List<result> st1=result.resultparMc(motCle1);
		model1.setResults(st1);
		request.setAttribute("model1" , model1);
		request.getRequestDispatcher("allstudentresult.jsp").forward(request, response);
	}
		
		else if (path.equals("/saisie.do") )
		{
		request.getRequestDispatcher("insertnewresult.jsp").forward(request,response);
		}
		else if (path.equals("/save.do") && request.getMethod().equals("POST"))
		{
		
		 String devjee=request.getParameter("devjee");
		 String soa=request.getParameter("soa");
		 //Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
		 String devmobile=request.getParameter("devmobile");
		

		result S = result.save1(new result(devjee,soa,devmobile));
		request.setAttribute("result", S);
		request.getRequestDispatcher("confirmationresult.jsp").forward(request,response);
		}
		
		else if (path.equals("/supprimer.do"))
		{
		 Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
		 result.Deleteresult(rollnumber);
		 response.sendRedirect("chercher1.do?motCle1=");
		}
		
		else if (path.equals("/editer.do") )
		{
		 Long rollnumber = Long.parseLong(request.getParameter("rollnumber"));
		 result e = result.getResult(rollnumber);
		 request.setAttribute("result", e);
		 request.getRequestDispatcher("editresult.jsp").forward(request,response);
		}
		else if (path.equals("/update.do") )
		{			 
			 Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
			 String devjee=request.getParameter("devjee");
			 String soa=request.getParameter("soa");
			 String devmobile=request.getParameter("devmobile");
			 

		result e = new result();	
		e.setRollnumber(rollnumber);
		e.setDevjee(devjee);
		e.setSoa(soa);
		e.setDevmobile(devmobile);
		
		result.Updateresult(e);
		request.setAttribute("result", e);
		request.getRequestDispatcher("allstudentresult.jsp").forward(request,response);
}
		
		
		else
		{
		response.sendError(Response.SC_NOT_FOUND);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}


}
