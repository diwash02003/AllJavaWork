package com.StudentProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StudentIO {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void show(String  msg){
        System.out.println(msg);Scanner scanner = new Scanner(System.in);
    }
    public Student readStudent() throws IOException {

        Student student = new Student();
        show("Enter your name: ");
        student.setFullName(bufferedReader.readLine());

        show("Enter your Email: ");
        student.seteMail(bufferedReader.readLine());

        show("Enter your Mobile Number: ");
        student.setMobileNumber(bufferedReader.readLine());

        //marks reading...
        float [] marks = new float [5];
        show("Reading Marks: ");

        for(int i =0; i<marks.length;i++){
            System.out.println("Enter "+ (i + 1)+ " marks ");
            marks[i] = Float.parseFloat(bufferedReader.readLine());
        }


        student.setMarks(marks);
        return  student;
    }

    public void displayStudent(Student student){
        show("--------------");
        show("STUDENT NAME "+student.getFullName() );
        show("STUDENT Email "+student.geteMail() );
        show("STUDENT Mobile Number "+student.getMobileNumber() );
        show("STUDENT Marks "+ Arrays.toString(student.getMarks()));
        show("--------------");

    }

}
