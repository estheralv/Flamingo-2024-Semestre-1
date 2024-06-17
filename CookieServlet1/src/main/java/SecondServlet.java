import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

public class SecondServlet extends HttpServlet {  
  
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response) {  
	
    try {  
  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie ck[]=request.getCookies();  
	    out.print("Olá "+ck[0].getValue());  
	  
	    	out.close();  
  
         } catch(Exception e) { 
        	 System.out.println(e);
         }  
    }  
      
  
}  