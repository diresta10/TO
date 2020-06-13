/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelpingClasses;

import static HelpingClasses.SessionFact.sf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanowak
 */
public class SessionFactTest {
    
    private SessionFactory sf;
    private Session ss;
    private Transaction tr;
    
    @Before
    public void before(){

        sf = HelpingClasses.SessionFact.getSessionFact();
    }
    
    @Test
    public void testGetSessionFact() {
    ss = sf.openSession();
    assertNotNull(ss);
    tr = ss.beginTransaction();
    assertNotNull(tr);
    

}
    @After
    public void after(){
        ss.close();
        sf.close();
    }
    
}
