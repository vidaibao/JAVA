/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicarray;

/**
 *
 * @author Owner
 */
public class Student {
    String id;
    String name;
    int yob;
    double gpa;
    private static int studentCount = 0;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        studentCount++;
    }

    public static int CountStudent() {
        return studentCount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
    }

   
    
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob,gpa);
    }
}
