/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahomework;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author PC
 */
public class CourseGrades {
    // these are the variables  

    LinkedList<Student> std = new LinkedList<>();// this is the List which keep de students name.
    String coursName;
    int studentsNumber;
    Student head;//it keeps top data of the list.
    // these are insert codes  getter and setter codes get  for read the data , set for give the parameter.

    public LinkedList<Student> getStd() {
        return std;
    }

    public void setStd(LinkedList<Student> std) {
        this.std = std;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public String getCoursName() {
        return "CLASS: " + coursName;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    void addLast(String name) {//ading the data at the end of list
        Student newStudent = new Student(name);//I create new Obje from StudentClass.
        if (head == null) {//if head=null the list is empty, so I can do  the newStudent is head in this way here is a one element in this list. 
            head = newStudent;
        } else {//this condition's main the list is not empty,then
            Student temp = head;//ı have to do this because ı cannot want to lose the head.
            while (temp.nextStudent != null) {//it is going to end of the list.
                temp = temp.nextStudent; //it find last data
            }
            temp.nextStudent = newStudent;//end then it adding newStudent at end data'next.Now newStudent is last data
        }
        studentsNumber++;//I increase the number of students as new students are added
        std.add(newStudent);// also I adding in std LinkedList.
    }

    void addFirst(String name) {// ading data begin the list.
        Student newStudent = new Student(name);//I create new Obje from StudentClass.
        if (head == null) {// if head=null the list is empty, so I can do  the newStudent is head.in this way here is a one element in this list. 
            head = newStudent;

        } else {//this mean, this list is not empty.
            newStudent.nextStudent = head;// new student'S next shows head in this way ı adding new students in front of head.  
            head = newStudent;// and then I update head.

        }
        studentsNumber++; //I increase the number of students as new students are added
        std.add(newStudent);//also I adding in std LinkedList.
    }

    void removeFirst() {//delete the data from begin.
        if (head == null) {//if the list is empty it writes this message.
            System.out.println("The list is empty, there is nothing to remove Student");
        } else {//else the list is not empty, firstly it show which data delete and then delete.
            System.out.println(head.name + " is removed in this list. ");//I write before the head don't lost.
            std.remove(head);//Delete from std LinkList
            head = head.nextStudent;//now head show next element in this way first element remove.
            studentsNumber--;//reduce the number of students.

        }
    }

    void removeLast() {//Delete data from end of the list.
        if (head == null) {//if the head = null, the list is empty
            System.out.println("The list is empty, there is nothing to remove Student");
        } else if (head.nextStudent == null) {//this mean there is a one data on my list.
            System.out.println(head.name + " is removed in this list");
            // delete only one data which in the list.
            std.remove(head);//Delete from std LinkList
            studentsNumber--;//reduce the number of students.
            head = null;//this means now the list is empty

        } else {//the list is not empty and not there is a one data
            Student temp = head;
            while (temp.nextStudent.nextStudent != null) {
                //it finds the last element of List
                temp = temp.nextStudent;
            }
            System.out.println(temp.nextStudent.name + " is removed in this list ");
            std.remove(temp.nextStudent);//Delete from std LinkList
            studentsNumber--;//reduce the number of students.
            temp.nextStudent = null;//Last elements gone.
        }
    }

    void remove(String name) {//It removes the data which user write as parameter.
        if (head == null) {//head=null  this list no have data
            System.out.println("The list is empty, there is nothing to remove Student");
        } else if (head.name == name) {
            //if the first element equal user's enterd name and then I call the removeFirst() function.
            removeFirst();
        } else {
            Student temp = head;//I creat temp to don't lose head
            while (temp.nextStudent != null && temp.nextStudent.name != name) {
                //this while search the element which user  entered.
                temp = temp.nextStudent;

            }
            if (temp.nextStudent != null && temp.nextStudent.name == name) {
                System.out.println(temp.nextStudent.name + " is removed in this list");
                //I check the it is not null and it is equal the search data. if it is;
                std.remove(temp.nextStudent);//I remove std LinkList.

                studentsNumber--;//reduce the number of students,because one student deleted.
                temp.nextStudent = temp.nextStudent.nextStudent;
                //shows its value to the next element so that the search element disappears 
            }

        }
    }

    void insertAfter(String name, String search) {//this function works like a adding new data after de entered string.
        Student temp = head;
        while (temp != null && temp.name != search) {
            //this is searching the user entered string 
            temp = temp.nextStudent;// this temp keep the user' entered name.
        }
        if (temp != null) {// I check it is not null 
            Student newStudent = new Student(name);//create new Obje

            newStudent.nextStudent = temp.nextStudent;//new Students next show temp next in this way the list is not lost.
            temp.nextStudent = newStudent; //ading the student next the temp
            std.add(newStudent);//ading atd LinkList
            studentsNumber++;//increases the number of student because ı added a student.
        } else {
            System.out.println(search + " is not find in this list so not insert after " + search);
        }

    }

    void randomGrade() {// ı made this function to see all student's grade and letter grade so ı can make sure print_name is working right.
        char Letter = 'A';// it is the default.
        for (int i = 0; i < std.size(); i++) {
            //this is create the random grade between 0 and 100
            Random r = new Random();
            std.get(i).grade = r.nextInt(101);
            // The letter grade is assigned according to the random number formed by the following conditions.
            if (std.get(i).grade > 0 && std.get(i).grade < 60) {
                Letter = 'F';
            } else if (std.get(i).grade >= 60 && std.get(i).grade < 75) {
                Letter = 'C';
            } else if (std.get(i).grade > 75 && std.get(i).grade < 90) {
                Letter = 'B';
            } else if (std.get(i).grade >= 90 && std.get(i).grade < 100) {
                Letter = 'A';
            }
            // it is print the grades and letter grades
            System.out.println(std.get(i).name + " -> " + std.get(i).grade + " -> " + Letter);
        }
    }

    void print_name(char x) {
        //it works for randomGrade() function. it keep the which Grade char entered 
        // and then it is search the LinkedList who take this Grade 
        //then, it write the people who take entered
        char LetterGrade = 'A';

        for (int i = 0; i < std.size(); i++) {
            if (std.get(i).grade > 0 && std.get(i).grade < 60) {
                LetterGrade = 'F';
            } else if (std.get(i).grade >= 60 && std.get(i).grade < 75) {
                LetterGrade = 'C';
            } else if (std.get(i).grade > 75 && std.get(i).grade < 90) {
                LetterGrade = 'B';
            } else if (std.get(i).grade >= 90 && std.get(i).grade < 100) {
                LetterGrade = 'A';
            }
            if (LetterGrade == x) {
                // if the student's grade letter to  user entered letter  then it is print.
                System.out.println(std.get(i).name + " take " + x + " grade.");
            }
        }
    }

    void print() {
        // Link List's print function
        Student temp = head;
        while (temp != null) {
            // it is going to head nezt in this way it print all list.
            System.out.print(temp.name + " -> ");
            temp = temp.nextStudent;
        }
        System.out.println("null");
    }

    void printL() {
        // it is print std LinkList.
        for (int i = 0; i < std.size(); i++) {
            System.out.println(std.get(i).name);

        }
    }

    //  size and studentNumber variable   gave same result ı made this beacuse make sure the result   
    int size() {
        // it is print number of LinkList
        Student temp = head;
        int count = 0;// I keep count at the begin it is zero
        while (temp != null) {
            temp = temp.nextStudent;
            // and then it iz touring all elements and it is increase the number of count
            count++;
        }
        return count;
    }

}
