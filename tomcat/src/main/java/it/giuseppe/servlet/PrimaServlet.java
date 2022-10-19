package it.giuseppe.servlet;


import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.File;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
       
        //w.write("<h1><center>BENVENUTO</center>\n</h1>");
        //w.write("<table border = 1px; height=100%; width=100%;><center><tr height=80px;><td><center>MENU</center></td><td><center>COSE</center></td><td><center>COSE</center></td><td><center>COSEEE</center></td></tr><tr><td colspan =4;></td></tr><tr height=80px;><td colspan=4;><center>FOOTER</center></td></tr></table>");
        w.write("<html lang=\"en\">\r\n"
        		+ "<head>\r\n"
        		+ "<title>PAGINA</title>\r\n"
        		+ "<meta charset=\"UTF-8\">\r\n"
        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
        		+ "<style>\r\n"
        		+ "body,h1,h2,h3,h4,h5,h6 {font-family: \"Lato\", sans-serif}\r\n"
        		+ ".w3-bar,h1,button {font-family: \"Montserrat\", sans-serif}\r\n"
        		+ ".fa-anchor,.fa-coffee {font-size:200px}\r\n"
        		+ "</style>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<!-- Navbar -->\r\n"
        		+ "<div class=\"w3-top\">\r\n"
        		+ "  <div class=\"w3-bar w3-black w3-opacity w3-card w3-left-align w3-large\">\r\n"
        		+ "    <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-green\" href=\"javascript:void(0);\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\r\n"
        		+ "    <font color=black><a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-white\">Home</a>\r\n</font>"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">MENU</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">GESTIONE DOCUMENTI</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">RICERCA UN DOCUMENTO</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">RICHIEDI UN DOCUMENTO</a>\r\n"
        		+ "  </div>\r\n"
        		+ "\r\n"
        		+ "  <!-- Navbar on small screens -->\r\n"
        		+ "  <div id=\"navDemo\" class=\"w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large\">\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">MENU</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">GESTIONE DOCUMENTI</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">RICERCA UN DOCUMENTO</a>\r\n"
        		+ "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">RICHIEDI UN DOCUMENTO</a>\r\n"
        		+ "  </div>\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<!-- Header -->\r\n"
        		+ "<header class=\"w3-container w3-#CDCDC0 w3-center\" style=\"padding:128px 16px\">\r\n"
        		+ "  <h1 class=\"w3-margin w3-jumbo\">BENVENUTO</h1>\r\n"
        		+ "  <p class=\"w3-xlarge\">Giuseppe La Bua s.r.l.</p>\r\n"
        		+ "  <button class=\"w3-button w3-black w3-padding-large w3-large w3-margin-top\">REGISTRATI</button>\r\n"
        		+"<button class=\"w3-button w3-black w3-padding-large w3-large w3-margin-top\">ACCEDI</button>\r\n"
        		+ "</header>\r\n"
        		
        		
        		
        		
        		
        		
        		
        		+ "<div class=\"w3-container w3-black w3-center w3-opacity w3-padding-64\">\r\n"
        		+ "    <h1 class=\"w3-margin w3-xlarge\">Quote of the day: live life</h1>\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<!-- Footer -->\r\n"
        		+ "<footer class=\"w3-container w3-padding-64 w3-center w3-opacity\">  \r\n"
        		+ "  <div class=\"w3-xlarge w3-padding-32\">\r\n"
        		+ "    <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\r\n"
        		+ "    <i class=\"fa fa-instagram w3-hover-opacity\"></i>\r\n"
        		+ "    <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\r\n"
        		+ "    <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\r\n"
        		+ "    <i class=\"fa fa-twitter w3-hover-opacity\"></i>\r\n"
        		+ "    <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\r\n"
        		+ " </div>\r\n"
        		+ " <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">Me medesimo</a></p>\r\n"
        		+ "</footer>\r\n"
        		+ "\r\n"
        		+ "<script>\r\n"
        		+ "// Used to toggle the menu on small screens when clicking on the menu button\r\n"
        		+ "function myFunction() {\r\n"
        		+ "  var x = document.getElementById(\"navDemo\");\r\n"
        		+ "  if (x.className.indexOf(\"w3-show\") == -1) {\r\n"
        		+ "    x.className += \" w3-show\";\r\n"
        		+ "  } else { \r\n"
        		+ "    x.className = x.className.replace(\" w3-show\", \"\");\r\n"
        		+ "  }\r\n"
        		+ "}\r\n"
        		+ "</script>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>");
        w.flush();
        w.close();
        
    }
	
	
}
 