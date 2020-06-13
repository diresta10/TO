/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Subject;
import java.util.List;

/**
 *
 * @author sanowak
 */
public interface SubjectDeclaration {
    public long insertSubject(Subject sub);
    public long upDate(int id, Subject sub);
    public boolean delete(int id);
    public Subject selectSubject(int id);
    public List selectAllSubjects();
    public List searchByName(String name);
    public List searchByID(int id);

}
