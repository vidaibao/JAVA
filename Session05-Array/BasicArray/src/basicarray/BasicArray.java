/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarray;

import java.util.Arrays;

/**
 *
 * @author Owner
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithPrimitiveArrayV3();
        //playWithAStudent();
        //playWithStudentArray();
        //playWithObjectArray();
        sortObjectArray();
    }

    public static void sortObjectArray() {
        Student[]  arr = new Student[3];
        arr[0] = new Student("DA987456", "Chich Choe", 2010, 8.5);
        arr[1] = new Student("DA123456", "Chich Bong", 2014, 8.6);
        arr[2] = new Student("FA987654", "AN NGUYEN", 2009, 8.4);
        
        System.out.println("The student list before sorting asc:");
        for (Student x : arr) {
            //2 chang x arr[0] cung point new CC
            //      ,,     [1]       ,,       CB
            x.showProfile();
        }
        
        //asending sorting
        for (int i = 0; i < Student.CountStudent()-1; i++) {
            for (int j = i + 1; j < Student.CountStudent(); j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student temp = arr[i];//pointer
                    arr[i] = arr[j];//swap pointer
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("The student list after sorting asc:");
        for (Student x : arr) {
            //2 chang x arr[0] cung point new CC
            //      ,,     [1]       ,,       CB
            x.showProfile();
        }
    }
    
    public static void playWithObjectArray() {
        Student[]  arr = new Student[3];
        arr[0] = new Student("DA987456", "Chich Choe", 2010, 8.5);
        arr[1] = new Student("DA123456", "Chich Bong", 2014, 8.6);
        arr[2] = new Student("FA987654", "AN NGUYEN", 2009, 8.4);
        
        System.out.println("The student list before sorting asc:");
        for (Student x : arr) {
            //2 chang x arr[0] cung point new CC
            //      ,,     [1]       ,,       CB
            x.showProfile();
        }
        
        //asending sorting
        for (int i = 0; i < Student.CountStudent()-1; i++) {
            for (int j = i + 1; j < Student.CountStudent(); j++) {
                if (arr[i].getGpa() > arr[i].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("The student list after sorting asc:");
        for (Student x : arr) {
            //2 chang x arr[0] cung point new CC
            //      ,,     [1]       ,,       CB
            x.showProfile();
        }
    }
    
    
    public static void playWithStudentArray() {
        //luu ho so sv ca lop;  10 var
        Student sv[] = new Student[10];
        // sv[]: an object
        // sv  : array name
        sv[0] = new Student("DA987456", "Chich Choe", 2010, 8.5);
        sv[1] = new Student("DA123456", "Chich Bong", 2014, 8.6);
        sv[2] = new Student("FA987654", "AN NGUYEN", 2009, 8.4);
        // may var sv[3 4...] con lai default 0, byte NULL OR Set sv[3] = null;
        // point vao toa do 0 (ram bottom, offoffoffoff..., 1st byte ram: all 0)
        //System.out.println(sv[0].getName().toUpperCase());
        System.out.println("The list of student:");
        for (int i = 0; i < Student.CountStudent(); i++) {
            sv[i].showProfile();
        }
        
        //REGULAR OBJ ARRAY: for count ; if use length OVER bound!
    }
    
    public static void playWithAStudent() {
        Student x;
        //x.showProfile(); // chua gan gia tri nhung theo khuon van co method nay//
        x = new Student("SE123456", "Chich Bong", 2014, 8.9);
        x.showProfile();//OK
        //System.out.println(x.toString());
        
    }

    public static void playWithPrimitiveArrayV3() {
        // int arr1[50]; denied
        int arr2[] = {5, 10, 15, 20, 25};//5 bien int implicite
        //       arr2[0] [1] [2] [3] [4]
        int arr3[] = new int[]{5, 10, 15, 20, 25}; //explicit
        int arr[];
        arr = new int[5];//5 bien int trung ten arr; arr[0], arr[1]...
        // tuong duong bien le? int x;
        // initialize like primitive variable
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        // [3] [4] default value 0, boolean: false
        System.out.println("The arr has: " + arr);// convert data cua cac bien thanh ma hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nUse foreach:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //arr la bien MAMI, object, con tro den vung new gom length, toString func
        // arr la bien phuc tap vi co nhieu info o ben trong
        // --> non-STATIC vi cho rieng tung mang; .length just only public
        System.out.println("\nThe arr has hash code:" + arr);
        System.out.println("Use Arrays.toString(arr) : ");
        System.out.println(Arrays.toString(arr));
    }
}
