<%-- 
    Document   : SelectAllSubjects
    Created on : 26-Apr-2020, 17:06:38
    Author     : sanowak
--%>
<%@page import="Bean.Subject"%>
<%@page import="DAO.SubjectOperation"%>
<%@page import="Bean.Student"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width; initial-scale=1">
        <%@include file="../CommonSrc/src.jsp" %>
        <style>
            .update,.delete{
                border-radius: 10px;
                padding: 5px;
            }
            .update{
                border:thin solid green;
            }
            .delete{
                border:thin solid red;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand" href="#">Language School</a>

            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- Navbar links -->
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Students</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Subjects</a>
                    </li>
                </ul>
                <form class="form-inline" action="#">
                    <input name="search" class="form-control mr-sm-2" type="text" placeholder="Search">
                    <button name="submit_search" class="btn btn-success" type="submit">Search</button>
                </form>
            </div>
        </nav> 

        <%
        if(request.getParameter("submit_search")!=null){
            String targetString=request.getParameter("search");
        %>
            
        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Duration</th>
                        <th>Level</th>
                        <th>Fees</th>
                    </tr>
                </thead>    

                <%
                    SubjectOperation sub = new SubjectOperation();
                    if (sub.searchByName(targetString)!=null){
                    List li = sub.searchByName(targetString);
                   
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Subject subject = (Subject) lit.next();
                %>

                <tr>
                    <td><%= subject.getSub_id()%></td>
                    <td><%= subject.getSub_name()%></td>
                    <td><%= subject.getSub_duration()%></td>
                    <td><%= subject.getSub_level()%></td>
                    <td><a class="update" href="SubjectControll/UpdateSubject.jsp?id=<%= subject.getSub_id()%>">Update</a></td>
                    <td><a class="delete" href="../DeleteSubject?id=<%= subject.getSub_id()%>">Delete</a></td>
                </tr>
                <%
                    }}
                %>
            </table>
        </div>
            <%
               } 
            %>
        
       
        <!----------------searched data------------------------>
        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Duration</th>
                        <th>Level</th>
                        <th>Fees</th>
                    </tr>
                </thead>    

                <%
                    SubjectOperation sub = new SubjectOperation();
                    if(sub.selectAllSubjects()!=null){
                    List li = sub.selectAllSubjects();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Subject subject = (Subject) lit.next();
                %>

                <tr>
                    <td><%= subject.getSub_id()%></td>
                    <td><%= subject.getSub_name()%></td>
                    <td><%= subject.getSub_duration()%></td>
                    <td><%= subject.getSub_level()%></td>
                    <td><%= subject.getSub_fees()%></td>
                    <td><a class="update" href="SubjectControll/UpdateSubject.jsp?id=<%= subject.getSub_id()%>">Update</a></td>
                    <td><a class="delete" href="../DeleteSubject?id=<%= subject.getSub_id()%>">Delete</a></td>
                </tr>
                <%
                    }}
                %>
            </table>
        </div>
    </body>
</html>
