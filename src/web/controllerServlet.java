package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import DAO.studentDaoImpl;
import DAO.studentdao;
import student.entities.student;

/**
 * Servlet implementation class controllerServlet
 */
@WebServlet(name="cs",urlPatterns= {"/controleur","*.do"})
public class controllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    studentdao student;
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		student =new studentDaoImpl();
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
		request.getRequestDispatcher("registeredstudent.jsp").forward(request,response);
		}
		else if (path.equals("/chercher.do"))
		{

		String motCle=request.getParameter("motCle");
		studentModel model =new studentModel();
		model.setMotCle(motCle);
		List<student> st=student.studentparMc(motCle);
		model.setStudents(st);
		request.setAttribute("model" , model);
		request.getRequestDispatcher("registeredstudent.jsp").forward(request, response);
	}
		
		else if (path.equals("/saisie.do") )
		{
		request.getRequestDispatcher("addnewstudent.jsp").forward(request,response);
		}
		else if (path.equals("/save.do") && request.getMethod().equals("POST"))
		{
		
		 String coursename=request.getParameter("coursename");
		 String branchename=request.getParameter("branchename");
		 //Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
		 String firstname=request.getParameter("firstname");
		 String lastname=request.getParameter("lastname");
		 String gender=request.getParameter("gender");

		student S = student.save(new student(coursename,branchename,firstname,lastname,gender));
		request.setAttribute("student", S);
		request.getRequestDispatcher("confirmationstudent.jsp").forward(request,response);
		}
		
		else if (path.equals("/supprimer.do"))
		{
		 Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
		 student.DeleteStudent(rollnumber);
		 response.sendRedirect("chercher.do?motCle=");
		}
		
		else if (path.equals("/editer.do") )
		{
		 Long rollnumber = Long.parseLong(request.getParameter("rollnumber"));
		 student e = student.getStudent(rollnumber);
		 request.setAttribute("student", e);
		 request.getRequestDispatcher("editstudent.jsp").forward(request,response);
		}
		else if (path.equals("/update.do") )
		{			
			Long rollnumber=Long.parseLong(request.getParameter("rollnumber"));
			String coursename=request.getParameter("coursename");
			 String branchename=request.getParameter("branchename");
			 String firstname=request.getParameter("firstname");
			 String lastname=request.getParameter("lastname");
			 String gender=request.getParameter("gender");

		student e = new student();	
		e.setRollnumber(rollnumber);
		e.setCoursename(coursename);
		e.setBranchename(branchename);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setGender(gender);
		student.UpdateStudent(e);
		request.setAttribute("student", e);
		request.getRequestDispatcher("confirmationstudentedit.jsp").forward(request,response);
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

