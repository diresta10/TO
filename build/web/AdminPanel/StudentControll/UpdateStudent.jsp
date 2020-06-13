<%-- 
    Document   : UpdateJsp
    Created on : 15-Apr-2020, 22:44:52
    Author     : sanowak
--%>

<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.SubjectOperation"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="Bean.Subject"%>
<%@page import="Bean.Student"%>
<%@page import="DAO.StudentOperation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../CommonSrc/src.jsp" %>
    </head>
    <body>
        <%!
            long id;
            StudentOperation st = new StudentOperation();
            Student student;
            Subject sub;
        %>
        <%
        if(request.getParameter("id") != null){
            id = Long.parseLong(request.getParameter("id"));
            student = st.selectStudent(id);
            if(student != null){
          
        %>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
            
            <h2>Student update form</h2>
            <form action="../../FinalUpdate" method="post">
                <input type="hidden" value="<%= student.getS_id() %>" name="id">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" value="<%= student.getName() %>" id="name" placeholder="Enter your name" name="name">
                </div>
                <div class="form-group">
                    <label for="surname">Surname:</label>
                    <input type="text" class="form-control" id="surname" value="<%= student.getSurname() %>" placeholder="Enter your surname" name="surname">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" value="<%= student.getEmail() %>" placeholder="Enter your email" name="email">
                </div>
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="text" class="form-control" id="contact" value="<%= student.getContact() %>" placeholder="Enter your contact" name="contact">
                </div>
                <div class="form-group">
                    <label for="admission_date">Admission date:</label>
                    <input type="date" class="form-control" id="admission_date" value="<%= student.getAdmission_date() %>" placeholder="Enter admission date" name="admission_date">
                </div>
                <div class="form-group">
                    <label for="course">Course:</label>
                    <input type="text" class="form-control" id="course" value="<%= student.getCourse() %>" placeholder="Enter course" name="course">
                </div>    
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" value="<%= student.getPassword() %>" placeholder="Enter password" name="password">
                </div>
                <div class="form-group form-check">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
                <%
                }}else{
                    out.print("Select any record cause ID is null");
                }
                %>
        </div>
        <div class="col-sm-6">
            <div class="row">
                <div class="col-sm-6">
                    <div class="form-group">
                         
                        <h3>Taken classes:</h3>
                        <ul>
                            <form action="../../RemoveSubjectFromStudent" method="get">
                                <%
                                    StudentOperation st2= new StudentOperation();
                                    Student student2 = st2.selectStudent(id);
                                    Set s= student2.getSubjectList();
                                    Iterator ite = s.iterator();
                                    int i = 0;
                                    while (ite.hasNext()){
                                        i++;
                                        Subject sub2 =(Subject)ite.next();
                                %>
                                <li class="list-group-item">
                                    <input type="checkbox" name="<%= sub2.getSub_name()%>" value="<%=sub2.getSub_id()%>" >&nbsp;&nbsp;&nbsp;&nbsp;<%=sub2.getSub_name()%>
                                </li>
                                <%
                                    }
                                %>
                                <input type="hidden" name="id" value ="<%=id%>" >
                                <button type ="submit" name ="removesub" class="btn btn-block btn-success" value="Remove"> Remove course from student</button>
                            </form>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-6"
                    <span><h3>All Available courses:</h3></span>
                        <ul class="list-group">
                            <form action="../../AddSubjectControll">
                                <%
                                    SubjectOperation subo = new SubjectOperation();
                                    List li= subo.selectAllSubjects();
                                    ListIterator lit= li.listIterator();
                                    while (lit.hasNext()){
                                        sub= (Subject) lit.next();
                                                
                                %>
                                <li class="list-group-item">
                                    <input type="checkbox" name="<%=sub.getSub_name()%>" value="<%=sub.getSub_id()%>" >&nbsp;&nbsp;&nbsp;&nbsp;<%=sub.getSub_name()%>
                                </li>
                                    <%
                                            
                                         }
                                    %>
                                    <input type="hidden" name="id" value="<%=id%>">
                                        <button type="submit" name="addsub" class="btn btn-block btn-success" value="Add"> Add course to student</button>
                                        
                                </form>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>            
    </body>
</html>
