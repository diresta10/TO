package org.apache.jsp.AdminPanel.StudentControll;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ListIterator;
import java.util.List;
import DAO.SubjectOperation;
import java.util.Iterator;
import java.util.Set;
import Bean.Subject;
import Bean.Student;
import DAO.StudentOperation;

public final class UpdateStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            long id;
            StudentOperation st = new StudentOperation();
            Student student;
            Subject sub;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminPanel/StudentControll/../../CommonSrc/src.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        if(request.getParameter("id") != null){
            id = Long.parseLong(request.getParameter("id"));
            student = st.selectStudent(id);
            if(student != null){
          
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("            \n");
      out.write("            <h2>Student update form</h2>\n");
      out.write("            <form action=\"../../FinalUpdate\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print( student.getS_id() );
      out.write("\" name=\"id\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"name\">Name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"");
      out.print( student.getName() );
      out.write("\" id=\"name\" placeholder=\"Enter your name\" name=\"name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"surname\">Surname:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"surname\" value=\"");
      out.print( student.getSurname() );
      out.write("\" placeholder=\"Enter your surname\" name=\"surname\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">Email:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"email\" value=\"");
      out.print( student.getEmail() );
      out.write("\" placeholder=\"Enter your email\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"contact\">Contact:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"contact\" value=\"");
      out.print( student.getContact() );
      out.write("\" placeholder=\"Enter your contact\" name=\"contact\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"admission_date\">Admission date:</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"admission_date\" value=\"");
      out.print( student.getAdmission_date() );
      out.write("\" placeholder=\"Enter admission date\" name=\"admission_date\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"course\">Course:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"course\" value=\"");
      out.print( student.getCourse() );
      out.write("\" placeholder=\"Enter course\" name=\"course\">\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\">Password:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" value=\"");
      out.print( student.getPassword() );
      out.write("\" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group form-check\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("                ");

                }}else{
                    out.print("Select any record cause ID is null");
                }
                
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                         \n");
      out.write("                        <h3>Taken classes:</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <form action=\"../../RemoveSubjectFromStudent\" method=\"get\">\n");
      out.write("                                ");

                                    StudentOperation st2= new StudentOperation();
                                    Student student2 = st2.selectStudent(id);
                                    Set s= student2.getSubjectList();
                                    Iterator ite = s.iterator();
                                    int i = 0;
                                    while (ite.hasNext()){
                                        i++;
                                        Subject sub2 =(Subject)ite.next();
                                
      out.write("\n");
      out.write("                                <li class=\"list-group-item\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"");
      out.print( sub2.getSub_name());
      out.write("\" value=\"");
      out.print(sub2.getSub_id());
      out.write("\" >&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(sub2.getSub_name());
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value =\"");
      out.print(id);
      out.write("\" >\n");
      out.write("                                <button type =\"submit\" name =\"removesub\" class=\"btn btn-block btn-success\" value=\"Remove\"> Remove subject from student</button>\n");
      out.write("                            </form>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\"\n");
      out.write("                    <span><h3>All Available courses:</h3></span>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            <form action=\"../../AddSubjectControll\">\n");
      out.write("                                ");

                                    SubjectOperation subo = new SubjectOperation();
                                    List li= subo.selectAllSubjects();
                                    ListIterator lit= li.listIterator();
                                    while (lit.hasNext()){
                                        sub= (Subject) lit.next();
                                                
                                
      out.write("\n");
      out.write("                                <li class=\"list-group-item\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"");
      out.print(sub.getSub_name());
      out.write("\" value=\"");
      out.print(sub.getSub_id());
      out.write("\" >&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(sub.getSub_name());
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                    ");

                                            
                                         }
                                    
      out.write("\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                        <button type=\"submit\" name=\"addsub\" class=\"btn btn-block btn-success\" value=\"Add\"> Add subject to student</button>\n");
      out.write("                                        \n");
      out.write("                                </form>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>            \n");
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
