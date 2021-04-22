package com.rakovets.course.java.core.practice.jcf_list._class.comporator;

import com.rakovets.course.java.core.practice.jcf_list._class.model.Student;

import java.util.Comparator;

public class StudentFullNameComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getSurname().compareTo(o2.getSurname());
        }
        return result;
    }
}
