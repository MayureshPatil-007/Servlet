package projectOne;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/gitone")
public class Servlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
		String id=req.getParameter("id1");
		String name=req.getParameter("name1");
		String address=req.getParameter("address1");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","Mayuresh@18");
			PreparedStatement ps=con.prepareStatement("insert into student(sid,sname,saddress) values (?,?,?)");
			
			int id2=Integer.parseInt(req.getParameter("id"));
			
			ps.setInt(1, id2);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.execute();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}
		
		
}
		
		
		
		
		


