/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SubjectOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanowak
 */
public class DeleteSubject extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a=Integer.parseInt(req.getParameter("id"));
        SubjectOperation so= new SubjectOperation();
        boolean b=so.delete(a);
        if(b){
            resp.sendRedirect("AdminPanel/SelectAllSubjects.jsp");
        }
        else{
            resp.getWriter().print("data not deleted because of some problem");
        }
    }
}
