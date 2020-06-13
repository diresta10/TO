/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanowak
 */
public class StudentOperationTest {
    /**
     * Test of insertStudent method, of class StudentOperation.
     */
        @Test
        public void testInsertStudent() {
            System.out.println("insertStudent");
            Student student = new Student();
            StudentOperation sop = new StudentOperation();
            student.setName("Sara");
            student.setSurname("Nowak");
            student.setEmail("sara@gmail.com");
            student.setContact("678987567");
            student.setAdmission_date("2020-06-21");
            student.setCourse("English");
            student.setPassword("saranow");
            assertEquals(1,sop.insertStudent(student));
    }
        @Test
        public void testUpdateStudent() {
            System.out.println("updateStudent");
            Student student = new Student("Sara","Nowak","sara@gmail.com","888999000","2020-06-23","English","saranow");

            StudentOperation sop = new StudentOperation();
            sop.insertStudent(student);         
            long id = student.getS_id();
            Student student2 = new Student("Sara","Nowak","nowak@gmail.com","500600700","2020-06-23","English","saranow");
            
            assertEquals(id,sop.upDate(id,student2));
        
        }
        
        @Test
        public void testDeleteStudent() {
            System.out.println("deleteStudent");
            StudentOperation sop= new StudentOperation();

            Student student = new Student("Maria", "Kowalska", "kowalska@gmail.com","677566455","2020-06-30","English","mariak");
            sop.insertStudent(student);
            
            long id=student.getS_id();
            StudentOperation sop2 = new StudentOperation();
            boolean b = true;
            assertEquals(b,sop2.delete(id));
    }
        
        @Test
        public void testSearchStudentByName() {
            System.out.println("searchByName");
            StudentOperation sop= new StudentOperation();

            Student student = new Student("Julia", "Witos", "witos@gmail.com","100200030","2020-06-01","English","juliaw");
            sop.insertStudent(student);
            assertNotNull(sop.searchByName("Julia"));
    }
        
        @Test
        public void testSelectAllStudents() {
            System.out.println("selectAllStudents");
            StudentOperation sop= new StudentOperation();

            Student student = new Student("Marek", "Polak", "polak@gmail.com","456765897","2020-06-13","German","marekp");
            sop.insertStudent(student);
            assertNotNull(sop.selectAllStudents());
    }
        
        @Test
        public void testSelectStudent() {
            System.out.println("selectStudent");
            StudentOperation sop= new StudentOperation();

            Student student = new Student("Alina", "Mostowiak", "alina@gmail.com","123234345","2020-06-24","German","alinam");
            sop.insertStudent(student);
            long id = student.getS_id();
            assertEquals(student,sop.selectStudent(id));

    
}
}
