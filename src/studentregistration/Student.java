/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Student {
    private String name;
    private String dept;
    private String id;

    public Student() {
    }

    public Student(String name, String dept, String id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getId() {
        return id;
    }
    
    ArrayList<Student> reg_list = new ArrayList<Student>();
    
    public void registration(Student s) {
        this.reg_list.add(s);
    }
    public ArrayList<Student> getReStudents() {
        return reg_list;
    }
    
}
