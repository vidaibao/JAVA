/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SaveOneStudent();
        //inputAStudent();
        //Scanner sc = new Scanner(System.in);
        //String line[] = sc.nextLine().split(" ");
        //System.out.println((Integer.parseInt(line[0])+ Integer.parseInt(line[1])));
    }
    
    public static void inputAStudent() {
        // Nhap data : Scanner, WC, Cam, Files, TouchPad...>> Object
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input id: ");
        String id = sc.nextLine();
        
        System.out.print("Input name: ");
        String name = sc.nextLine();
        
        System.out.print("Input yob: ");
        int yob = sc.nextInt();

        System.out.print("Input gpa: ");
        double gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
    // hard code value
    public static void SaveOneStudent() {
        Student s1 = new Student("SE345678", "Chich Bong", 2014, 8.5);
        s1.showProfile();
    }
}
