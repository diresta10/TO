<%-- 
    Document   : DeleteStudent
    Created on : 15-Apr-2020, 22:47:54
    Author     : sanowak
--%>

<%@page import="DAO.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        long id= Long.parseLong(request.getParameter("id"));
        StudentOperation so= new StudentOperation();
        boolean b = so.delete(id);
        if(b){
            response.sendRedirect("../ShowAllStudents.jsp");
        }
        else{
            out.print("there is something wrong so try again");
        }
        %>

    </body>
</html>
