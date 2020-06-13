/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author sanowak
 */
@Entity
public class Student implements Serializable{
    
    public Student() {
    }
    
    @Id
    @GeneratedValue
    private long s_id;
    private String name,surname, email, contact, admission_date, course, password;
    @Column(unique=false)
    @ManyToMany(cascade=CascadeType.ALL)
    public Set<Subject> subjectList= new HashSet<Subject>(10);

    
    public String getAdmission_date(){
        return admission_date;
    }
    
    public void setAdmission_date(String admission_date){
        this.admission_date=admission_date;
    }
    
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    
    public Student(String name, String surname, String email, String contact, String admission_date,String course, String password) {
        this.name = name;
        this.surname = surname;
        this.email=email;
        this.contact = contact;
        this.admission_date = admission_date;
        this.course=course;
        this.password = password;
        
    } 
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<Subject> getSubjectList(){
        return subjectList;
    }
    
    public void setSubjectList(Set<Subject> subjectList){
        this.subjectList= subjectList;
    }
    
    
}
