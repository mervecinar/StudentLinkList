/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahomework;

/**
 *
 * @author PC
 */
public class Student {
    // there are  variables  it keeps  name, grade , next student and letter grade  of students.
    String name;
    int grade;
    Student nextStudent;
    // Constructer I have to make constructer if I don't, I cannot give value in CourseGrades Class.
    public Student(String name) {
        //it gives default value
        this.name = name;
        this.nextStudent = null;
    }
}
