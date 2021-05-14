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
public class Test {

    public static void main(String[] args) {
        CourseGrades liste = new CourseGrades();// ı create a obje from CourseGrades 
        //class because all the function in there.

        // ADDİNG REMOVİNG PRİNTİNG METHODS 
        //TOTAL=15 STUDENTS
        //THEİR GRADE, LETTERGRADE AND WHO TAKE B GRADE
        liste.addFirst("MERVE");
        liste.addLast("ETHEM");
        liste.remove("ETHEM");
        liste.insertAfter("NURDAN", "MERVE");
        liste.removeFirst();
        liste.insertAfter("YUSUF", "NURDAN");
        liste.removeLast();
        liste.addLast("MİRAC");
        liste.addFirst("SÜHEYLA");
        liste.insertAfter("EMİR", "NURDAN");
        liste.addFirst("KEVSER");
        liste.addFirst("MUSAB");
        liste.addFirst("CEREN");
        liste.removeFirst();
        liste.insertAfter("HALEF", "CEREN");
        liste.addLast("ÖMER");
        liste.addFirst("ÇINAR");
        liste.addLast("RÜVEYDA");
        liste.insertAfter("MERYEM", "ÖMER");
        liste.addLast("EMRE");
        liste.addFirst("SEBAHAT");
        liste.addFirst("CİHANGİR");
        liste.remove("SELİN");
        liste.addLast("KEREM");
        liste.addLast("SELİN");
        liste.removeLast();
        liste.addFirst("MUSTAFA");
        System.out.println("\n");
        liste.coursName = "DATA STRUCTER";
        System.out.println(liste.getCoursName());
        System.out.println("----------  Print LinkList   --------- ");
        liste.print();
        System.out.println("------------Print std LinkList-----------");
        liste.printL();
        System.out.println("-------- Students ,their grades and their LetterGrade  -------- ");
        liste.randomGrade();
        System.out.println("--------------  WHO Take B Letter Grade?   ----------");
        liste.print_name('B');
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Student Numbers std LinkList = " + liste.getStudentsNumber() + "   ,  " + " Student Numbers normal LinkList = " + liste.size());
    }
}
