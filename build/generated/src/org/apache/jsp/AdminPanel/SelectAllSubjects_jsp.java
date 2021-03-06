package org.apache.jsp.AdminPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Subject;
import DAO.SubjectOperation;
import Bean.Student;
import java.util.ListIterator;
import java.util.List;
import DAO.StudentOperation;

public final class SelectAllSubjects_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminPanel/../CommonThings/BTCDN.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width; initial-scale=1\">\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .update,.delete{\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            .update{\n");
      out.write("                border:thin solid green;\n");
      out.write("            }\n");
      out.write("            .delete{\n");
      out.write("                border:thin solid red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("            <!-- Brand -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Language School</a>\n");
      out.write("\n");
      out.write("            <!-- Toggler/collapsibe Button -->\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Navbar links -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Students</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Subjects</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline\" action=\"#\">\n");
      out.write("                    <input name=\"search\" class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                    <button name=\"submit_search\" class=\"btn btn-success\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("\n");
      out.write("        ");

        if(request.getParameter("submit_search")!=null){
            String targetString=request.getParameter("search");
        
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Duration</th>\n");
      out.write("                        <th>Level</th>\n");
      out.write("                        <th>Fees</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>    \n");
      out.write("\n");
      out.write("                ");

                    SubjectOperation sub = new SubjectOperation();
                    if (sub.searchByName(targetString)!=null){
                    List li = sub.searchByName(targetString);
                   
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Subject subject = (Subject) lit.next();
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( subject.getSub_id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_name());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_duration());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_level());
      out.write("</td>\n");
      out.write("                    <td><a class=\"update\" href=\"SubjectControll/UpdateSubject.jsp?id=");
      out.print( subject.getSub_id());
      out.write("\">Update</a></td>\n");
      out.write("                    <td><a class=\"delete\" href=\"../DeleteSubject?id=");
      out.print( subject.getSub_id());
      out.write("\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }}
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            ");

               } 
            
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <!----------------searched data------------------------>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Duration</th>\n");
      out.write("                        <th>Level</th>\n");
      out.write("                        <th>Fees</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>    \n");
      out.write("\n");
      out.write("                ");

                    SubjectOperation sub = new SubjectOperation();
                    if(sub.selectAllSubjects()!=null){
                    List li = sub.selectAllSubjects();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Subject subject = (Subject) lit.next();
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( subject.getSub_id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_name());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_duration());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_level());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( subject.getSub_fees());
      out.write("</td>\n");
      out.write("                    <td><a class=\"update\" href=\"SubjectControll/UpdateSubject.jsp?id=");
      out.print( subject.getSub_id());
      out.write("\">Update</a></td>\n");
      out.write("                    <td><a class=\"delete\" href=\"../DeleteSubject?id=");
      out.print( subject.getSub_id());
      out.write("\">Delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }}
                
      out.write("\n");
      out.write("            </table>\n");
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
