/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import Bean.Subject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author sanowak
 */
public class SubjectOperation implements SubjectDeclaration {

    SessionFactory sf;
    Session ss;
    Transaction tr;

    public SubjectOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();

    }

    @Override
    public long insertSubject(Subject sub) {
        tr = ss.beginTransaction();
        //System.err.println("" + st.getEmail()+ st.getAddress());
        int l = (Integer) ss.save(sub);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(int id, Subject sub) {
        tr=ss.beginTransaction();
        sub.setSub_id(id);
        try{
            ss.merge(sub);
            tr.commit();
            return id;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }


    @Override
    public boolean delete(int id) {
        tr = ss.beginTransaction();
        Subject sub = new Subject();
        sub.setSub_id(id);
        try {
            ss.delete(sub);
            tr.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Subject selectSubject(int id) {
        Subject sub = (Subject)ss.get (Subject.class, id);
        if(sub!=null)
        {
            return sub;
        }
        return null;
    }

    @Override
    public List selectAllSubjects() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
        String hql = "from Bean.Subject";
        Query query = ss.createQuery(hql);
        List<Subject> li = query.list();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }

    @Override
    public List searchByName(String name) {
        Criteria criteria = ss.createCriteria(Subject.class);
        criteria.add(Restrictions.like("Sub_name", "%" + name + "%"));
        List li = criteria.list();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }

    @Override
    public List searchByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
