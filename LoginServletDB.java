

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServletDB")
public class LoginServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tigerr");
		
		String s1="Select * from user_table where username=? and password=? ";
		PreparedStatement stmt=con.prepareStatement(s1);
		stmt.setString(1, username);
		stmt.setString(2, password);
		ResultSet rset=stmt.executeQuery();
		if(rset.next()) {
			out.println("<font color=green><b>Welcome "+username+" </b></font>");//this function can use html inline tags 
		}
		else {
			out.println("<font color=red><b>Invalid username or password</b></font>");
		}
		out.close();
		stmt.close();
		con.close();
		} catch(Exception e) {e.printStackTrace();}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
