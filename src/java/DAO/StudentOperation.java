/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;


public class StudentOperation implements StudentDeclaration {
    
    SessionFactory sf;
    Session ss;
    Transaction tr;
    
    public StudentOperation(){
        sf= HelpingClasses.SessionFact.getSessionFact();
        ss =sf.openSession();
        
    }

    @Override
    public long insertStudent(Student st) {
        tr=ss.beginTransaction();
        System.err.println("" + st.getName()+" " + st.getSurname());
        long l=(Long) ss.save(st);
        tr.commit();
        if (l>0){
            return 1;
        }
        else
            return 0;
    }

    @Override
    public long upDate(long id, Student st) {
        tr=ss.beginTransaction();
        st.setS_id(id);
        try{
            ss.merge(st);
            tr.commit();
            return id;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean delete(long id) {
        tr= ss.beginTransaction();
        Student st= new Student();
        st.setS_id(id);
        try{
            ss.delete(st);
            tr.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Student selectStudent(long id) {
        Student st = (Student)ss.get (Student.class, id);
        if(st!=null)
        {
            return st;
        }
        return null;
    }

    @Override
    public List selectAllStudents() {
        //tr=ss.beginTransaction();
        String hql = "from Bean.Student";
        Query query=ss.createQuery(hql);
        List<Student> li= query.list();
        //ListIterator lit=li.listIterator();
        //System.err.println("" + li.size());
        if(li.size()>0){
            return li;
        }
        return null;
    }

    @Override
    public List searchByName(String name) {
        Criteria criteria=ss.createCriteria(Student.class);
        criteria.add(Restrictions.like("name","%"+name+"%"));
        List li= criteria.list();
        if(li.size()>0){
            return li;
        }
        return null;
    }


}
