

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class RegisterServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID =1L;
	public RegisterServlet() {
		super();
	}   	
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	Beancls o=new Beancls();
	o.setFirstname(firstname);
	o.setlastname(lastname);
	o.setUsername(username);
	o.setPassword(password);
	Register ra= new Register();
	boolean status=ra.registerdetails(o);
	if(status){
		RequestDispatcher r = getServletContext().getRequestDispatcher("/RegisterSuccess.jsp");
		r.forward(request,response);
	}else{
		response.sendRedirect("RegisterUnSuccess.jsp");
	}
	}   	  	    
}