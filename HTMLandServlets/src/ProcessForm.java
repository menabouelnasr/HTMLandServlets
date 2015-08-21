

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void processRequest( HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException 
    {
    	
    	
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ID, assignmentName, type, day, className, tempStr, output="";
		
    	ID= request.getParameter("A");
    	System.out.println(ID);
    	className=request.getParameter("Ms.");
    	assignmentName = (String)request.getParameter( "Username" );
    	type=request.getParameter("Usermail");
    	day=request.getParameter("Usercard");
    	tempStr = (String)request.getParameter( "Cardnumber" );
    	
    	output+="<table border=1 color=white bgcolor=white>";
   	 	output+="<tr><th>Assignments</th></tr> ";
    	output+="<tr><td>" +ID+className+assignmentName+type+day+tempStr+ "</tr></td>";
		request.setAttribute("message", output);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
