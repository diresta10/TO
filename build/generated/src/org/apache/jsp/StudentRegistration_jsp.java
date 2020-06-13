package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Subject;
import java.util.ListIterator;
import java.util.List;
import DAO.SubjectOperation;

public final class StudentRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CommonSrc/src.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>");
      out.write(">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Student registration form</h2>\n");
      out.write("            <form action=\"RegisterController\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\" \" id=\"name\" placeholder=\"Enter your name\" name=\"name\">                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"surname\">Surname:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"surname\" value=\" \" placeholder=\"Enter your surname\" name=\"surname\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">Email:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"email\" value=\" \" placeholder=\"Enter your email\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"contact\">Contact:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"contact\" value=\" \" placeholder=\"Enter your contact\" name=\"contact\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"admission_date\">Admission date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"admission_date\" value=\" \" placeholder=\"Enter admission date\" name=\"admission_date\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"course\">Course:</label>\n");
      out.write("                    <select name=\"course\">\n");
      out.write("                        ");

                        SubjectOperation subop = new SubjectOperation();
                        if(subop.selectAllSubjects()!=null){
                            List li = subop.selectAllSubjects();
                            ListIterator lit = li.listIterator();
                            while (lit.hasNext()){
                                Subject sub =(Subject)lit.next();
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( sub.getSub_id());
      out.write("\" >");
      out.print( sub.getSub_name());
      out.write("</option>\n");
      out.write("                        ");

                            }}else{
                            out.print("no subject");}
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\">Password:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" value=\" \" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group form-check\">\n");
      out.write("                    <label class=\"form-check-label\">\n");
      out.write("                        <input class=\"form-check-input\" type=\"checkbox\" name=\"remember\"> Remember me\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
