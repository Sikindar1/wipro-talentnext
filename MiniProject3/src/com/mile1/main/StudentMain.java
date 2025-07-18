package com.mile1.main;
import com.mile1.service.*;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentobjectException;
import com.mile1.exception.NullnameException;

public class StudentMain {
	
	static Student[] data=new Student[4];
	static {
		data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
	}

	public static void main(String[] args) {
		StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String validation = report.validate(data[i]);
                if ("VALID".equals(validation)) {
                    String grade = report.findGrades(data[i]);
                    System.out.println("Grade = " + grade);
                }
            } 
            catch (NullnameException | NullMarksArrayException | NullStudentobjectException e) {
            	      e.printStackTrace();
            }
        }

        System.out.println("Number of Null Marks array = " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Name = " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects = " + service.findNumberOfNullObjects(data));
	}
}