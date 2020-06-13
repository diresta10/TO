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
            int id;
            SubjectOperation st = new SubjectOperation();
            Student student;
            Subject subject;
        %>
        <%
        if(request.getParameter("id") != null){
            id = Integer.parseInt(request.getParameter("id"));
            subject = st.selectSubject(id);
            if(subject != null){
          
        %>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
            
            <h2>Subject update form</h2>
            <form action="../../FinalUpdateSubject" method="post">
                <input type="hidden" value="<%= subject.getSub_id() %>" name="id">
                <div class="form-group">
                    <label for="Sub_name">Name:</label>
                    <input type="text" class="form-control" value="<%= subject.getSub_name() %>" id="name" placeholder="Enter subject" name="Sub_name">
                </div>
                <div class="form-group">
                    <label for="Sub_duration">Sub_duration:</label>
                    <input type="text" class="form-control" id="Sub_duration" value="<%= subject.getSub_duration() %>" placeholder="Subject duration" name="Sub_duration">
                </div>
                <div class="form-group">
                    <label for="Sub_level">Sub_level:</label>
                    <input type="text" class="form-control" id="Sub_level" value="<%= subject.getSub_level() %>" placeholder="Level" name="Sub_level">
                </div>
                <div class="form-group">
                    <label for="Sub_fees">Sub_fees:</label>
                    <input type="text" class="form-control" id="Sub_fees" value="<%= subject.getSub_fees() %>"  placeholder="Fees" name="Sub_fees">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
                <%}
                }else{
                    out.print("Select any record cause ID is null");
                }
                %>
    
            </div>
        </div>            
    </body>
</html>
