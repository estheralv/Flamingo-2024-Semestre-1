import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
  
public class FirstServlet extends HttpServlet {  
  
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response) {  
	  
    try{  
  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String string = request.getParameter("userName");  
	    out.print("Bem Vindo "+ string);  
	  
	    Cookie ck = new Cookie("uname", string);  
	    response.addCookie(ck); 
	    
	    out.print("<form action='servlet2' method='post'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
		          
		    out.close();  
   
        } catch(Exception e) {
        	System.out.println(e);
        }  
    
  }  
}  