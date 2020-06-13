/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Subject;
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
public class FinalUpdateSubject extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") != null) {
            int id = Integer.parseInt(req.getParameter("id"));
            PrintWriter out = resp.getWriter();
            String Sub_name,Sub_level;
            int Sub_duration, Sub_fees;
            Sub_name = req.getParameter("Sub_name");
            Sub_duration=Integer.parseInt(req.getParameter("Sub_duration"));
            Sub_level = req.getParameter("Sub_level");
            Sub_fees=Integer.parseInt(req.getParameter("Sub_fees"));
            Subject sub = new Subject(Sub_name,Sub_duration, Sub_level, Sub_fees);
            sub.setSub_id(id);
            SubjectOperation so = new SubjectOperation();
            long l = so.upDate(id, sub);
            
            if(l>0)
            {
                resp.sendRedirect("AdminPanel/SelectAllSubjects.jsp");
            }
            else{
                out.print("There is something wrong try again otherwise contact to admin 444555666");
            }
        }

    }
}
