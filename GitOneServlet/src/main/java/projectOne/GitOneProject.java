package projectOne;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/git")
public class GitOneProject extends GenericServlet
{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	int a=Integer.parseInt(req.getParameter("num1"));
	int b=Integer.parseInt(req.getParameter("num2"));
	int c=a+b;
	
	
	PrintWriter out=res.getWriter();
	out.println("Result is-"+c);
	
	
}
		
	
	
}