<%-- 
    Document   : StudentRegistration
    Created on : 14-Mar-2020, 14:32:24
    Author     : sanowak
--%>

<%@page import="Bean.Subject"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.SubjectOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <%@include file="CommonSrc/src.jsp" %>>
    </head>
    <body>
        <div class="container">
            <h2>Student registration form</h2>
            <form action="RegisterController" method="post">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" value=" " id="name" placeholder="Enter your name" name="name">                  
                </div>
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input type="text" class="form-control" id="surname" value=" " placeholder="Enter your surname" name="surname">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" value=" " placeholder="Enter your email" name="email">
                </div>
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="text" class="form-control" id="contact" value=" " placeholder="Enter your contact" name="contact">
                </div>
                <div class="form-group">
                    <label for="admission_date">Admission date:</label>
                    <input type="date" class="form-control" id="admission_date" value=" " placeholder="Enter admission date" name="admission_date">
                </div>
                <div class="form-group">
                    <label for="course">Course:</label>
                    <select name="course">
                        <%
                        SubjectOperation subop = new SubjectOperation();
                        if(subop.selectAllSubjects()!=null){
                            List li = subop.selectAllSubjects();
                            ListIterator lit = li.listIterator();
                            while (lit.hasNext()){
                                Subject sub =(Subject)lit.next();
                        %>
                        <option value="<%= sub.getSub_id()%>" ><%= sub.getSub_name()%></option>
                        <%
                            }}else{
                            out.print("no subject");}
                        %>
                    </select>
                </div>   
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" value=" " placeholder="Enter password" name="password">
                </div>
                <div class="form-group form-check">
                    <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" name="remember"> Remember me
                    </label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>
