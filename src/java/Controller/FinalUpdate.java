/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import DAO.StudentOperation;
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
public class FinalUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") != null) {
            long id = Long.parseLong(req.getParameter("id"));
            PrintWriter out = resp.getWriter();
            String name, surname, email, contact, admission_date, course, password;
            name = req.getParameter("name");
            surname = req.getParameter("surname");
            email = req.getParameter("email");           
            contact = req.getParameter("contact");
            admission_date = req.getParameter("admission_date");
            course = req.getParameter("course");
            password = req.getParameter("password");
            Student st = new Student(name, surname,email, contact, admission_date, course,  password);
            st.setS_id(id);
            StudentOperation so = new StudentOperation();
            long l = so.upDate(id, st);
            
            if(l>0)
            {
                resp.sendRedirect("AdminPanel/ShowAllStudents.jsp");
            }
            else{
                out.print("There is something wrong try again otherwise contact to admin 444555666");
            }
        }

    }
}
