package com.StudentProgram;

import java.io.IOException;

public class StudentMainProgram {

    public static void main(String[] args) throws IOException {
        StudentIO studentIO = new StudentIO();
        ResultCalculator resultCalculator = new ResultCalculator();

        Student student =studentIO.readStudent();
        studentIO.displayStudent(student);

        boolean isPassed = resultCalculator.isStudentPassed(student);

        if(isPassed){
            studentIO.show("Congratulation !!!");
        }
        else{
           Integer[] failedIndex = resultCalculator.findFailedIndex(student.getMarks());
            for(int i =0 ;i<failedIndex.length;i++){
                if(failedIndex[i] !=null){
                    studentIO.show("Failed in "+ (failedIndex[i]+1)+" subject");
                }
            }
        }

    }


}
