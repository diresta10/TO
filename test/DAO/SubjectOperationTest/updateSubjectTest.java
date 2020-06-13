/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.SubjectOperationTest;

import Bean.Subject;
import DAO.SubjectOperation;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sanowak
 */
public class updateSubjectTest {
          
    Subject subject = new Subject();
    SubjectOperation sop = new SubjectOperation();
    int id;
    
    @Before
    public void before(){
        subject.setSub_name("Norwegian");
        subject.setSub_duration(120);
        subject.setSub_level("beginner");
        subject.setSub_fees(1450);
        
    }
    
    @Test
    public void testupdateSubject() {
        System.out.println("updateSubject");
        sop.insertSubject(subject);
        id=subject.getSub_id();
        id = subject.getSub_id();
        Subject subject2 = new Subject("Norwegian",130,"advanced",1300);  
        assertEquals(id,sop.upDate(id,subject2));

    }
    @After
    public void after(){
        SubjectOperation sop2 = new SubjectOperation();
        sop2.delete(id);
    }
    
}