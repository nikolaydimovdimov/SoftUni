package JOOP_01_1_Working_with_Abstraction_Lab.P03_Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void create(String name,int age,double grade){
        if(this.repo.containsKey(name)) return;
        this.repo.put(name,new Student(name,age,grade));
    }

    public Student getStudent(String name) {
        return this.repo.get(name);
    }

}
