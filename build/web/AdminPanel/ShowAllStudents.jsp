<%-- 
    Document   : ShowAllStudents
    Created on : 14-Apr-2020, 22:37:26
    Author     : sanowak
--%>

<%@page import="Bean.Subject"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
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
                <caption>Searched Data</caption>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Admission_date</th>
                        <th>Course</th>
                        <th>Additional courses</th>
                        <th>Password</th>
                    </tr>
                </thead>    

                <%
                    StudentOperation st = new StudentOperation();
                    if(st.searchByName(targetString)!=null){
                        List li = st.searchByName(targetString);
                        ListIterator lit = li.listIterator();
                        while (lit.hasNext()) {
                            Student student = (Student) lit.next();
                %>

                <tr>
                    <td><%= student.getS_id()%></td>
                    <td><%= student.getName()%></td>
                    <td><%= student.getSurname()%></td>
                    <td><%= student.getEmail()%></td>
                    <td><%= student.getContact()%></td>
                    <td><%= student.getAdmission_date()%></td>
                    <td><%= student.getCourse()%></td>
                    <td>
                    <%
                        Set s = student.getSubjectList();
                        Iterator ite = s.iterator();
                        while (ite.hasNext()){
                            String str = (String)ite.next();
                            out.println(str);
                        }
                    %>
                    </td>
                    <td><%= student.getPassword()%></td>
                    <td><a class="update" href="StudentControll/UpdateStudent.jsp?id=<%= student.getS_id()%>">Update</a></td>
                    <td><a class="delete" href="StudentControll/DeleteStudent.jsp?id=<%= student.getS_id()%>">Delete</a></td>
                </tr>
                <%
                    }}
        else
            {
            out.println("<th style='color:red;'>There is no record for given name</th>");
            }
                %>
            </table>
        </div>
 
            <%
               } 
            %>
        

        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Admission_date</th>
                        <th>Course</th>
                        <th>Additional courses</th>
                        <th>Password</th>
                    </tr>
                </thead>    

                <%
                    StudentOperation st = new StudentOperation();
                    if(st.selectAllStudents()!=null){
                    List li = st.selectAllStudents();
                    ListIterator lit = li.listIterator();
                    while (lit.hasNext()) {
                        Student student = (Student) lit.next();
                %>
                <tr>
                    <td><%= student.getS_id()%></td>
                    <td><%= student.getName()%></td>
                    <td><%= student.getSurname()%></td>
                    <td><%= student.getEmail()%></td>
                    <td><%= student.getContact()%></td>
                    <td><%= student.getAdmission_date()%></td>
                    <td><%= student.getCourse()%></td>
                    <td>
                        <%
                            Set s = student.getSubjectList();
                            Iterator ite = s.iterator();
                            while (ite.hasNext()){
                                Subject sub2 =(Subject) ite.next();
                                out.println(sub2.getSub_name());
                            }
                        %>
                    </td>
                    <td><%= student.getPassword()%></td>
                    <td><a class="update" href="StudentControll/UpdateStudent.jsp?id=<%= student.getS_id()%>">Update</a></td>
                    <td><a class="delete" href="StudentControll/DeleteStudent.jsp?id=<%= student.getS_id()%>">Delete</a></td>
                </tr>
                <%
                    }}
                    else{
                    out.print("no record found");}
                %>
            </table>
        </div>
    </body>
</html>
