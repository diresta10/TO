/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import Bean.Subject;
import DAO.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name="RegisterController",urlPatterns={"/RegisterController"})

public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String name, surname, email,contact,admission_date,course,password;
        int subject_id = Integer.parseInt(req.getParameter("course"));
        System.out.println("id cursu: " + subject_id);
        
        Subject sub = new Subject();
        SubjectOperation subop = new SubjectOperation();
        sub = subop.selectSubject(subject_id);

        name = req.getParameter("name");
        surname=req.getParameter("surname");
        email=req.getParameter("email");
        contact = req.getParameter("contact");
        admission_date = req.getParameter("admission_date");
        course = sub.getSub_name();
        //course = req.getParameter("course");
        password = req.getParameter("password");
           
        Student st=new Student (name, surname, email, contact,admission_date, course,password);
        StudentDeclaration sd=new StudentOperation();
        long id= sd.insertStudent(st);
        if (id>0)
        {
            out.println("Inserted successfully");
        }
        else{
            out.print("There is something is wrong");
        }
        
    }
}