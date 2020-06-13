<%-- 
    Document   : Add_Subject_Form
    Created on : 25-Apr-2020, 22:47:44
    Author     : sanowak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../CommonSrc/src.jsp" %>>
    </head>
    <body>
        <div class="container">
            <h2>Add course form</h2>
            <form action="../AddSubjectController" method="get">
                <div class="form-group">
                    <label for="Sub_name">Subject Name:</label>
                    <input type="text" class="form-control" id="Sub_name" placeholder="Enter subject name" name="Sub_name">                  
                </div>
                <div class="form-group">
                    <label for="Sub_duration">Subject duration:</label>
                    <input type="text" class="form-control"  id="Sub_duration" placeholder="Subject duration" name="Sub_duration">
                </div>
                <div class="form-group">
                    <label for="Sub_level">Subject level:</label>
                    <input type="text" class="form-control" id="Sub_level" placeholder="Level" name="Sub_level">
                </div>
                <div class="form-group">
                    <label for="Sub_fees">Subject fees:</label>
                    <input type="text" class="form-control" id="Sub_fees" placeholder="Fees" name="Sub_fees">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>
