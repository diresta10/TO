/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Subject;
import DAO.SubjectDeclaration;
import DAO.SubjectOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanowak
 */
@WebServlet(name = "AddSubjectController", urlPatterns = {"/AddSubjectController"})
public class AddSubjectController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Sub_name, Sub_level;
        int Sub_duration, Sub_fees;
        Sub_name=req.getParameter("Sub_name");
        Sub_level=req.getParameter("Sub_level");
        Sub_duration=Integer.parseInt(req.getParameter("Sub_duration"));
        Sub_fees=Integer.parseInt(req.getParameter("Sub_fees"));
        Subject sub = new Subject(Sub_name, Sub_duration, Sub_level, Sub_fees);
        SubjectDeclaration sd = (SubjectDeclaration) new SubjectOperation();
        sd.insertSubject(sub);
        
    }
}
