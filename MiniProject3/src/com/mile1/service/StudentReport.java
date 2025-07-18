package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
	public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        for (int mark : marks) {
            if (mark < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        String grade;
        if (sum < 150) grade = "C";
        else if (sum < 200) grade = "B";
        else if (sum < 250) grade = "A";
        else grade = "A+";

        studentObject.setGrade(grade);
        return grade;
    }

    public String validate(Student s) throws NullnameException, NullMarksArrayException, NullStudentobjectException {
        if (s == null) throw new NullStudentobjectException();
        if (s.getName() == null) throw new NullnameException();
        if (s.getMarks() == null) throw new NullMarksArrayException();
        return "VALID";
    }

}