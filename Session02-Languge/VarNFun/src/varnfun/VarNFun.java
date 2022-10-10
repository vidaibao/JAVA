/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varnfun;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // var la 1 vung RAM duoc named identified
        // đặt tên cho những giá trị xung quanh. Từ đơn giản đến phức tạp
        //playWithDataVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharracters();
        //playWithBooleans();
        //printIntegerList(200);//hard code 200
        
        int n = getAPositiveInterger();
        printIntegerList(n);
        
    }
    
    
    
    
    
    public static int getAPositiveInterger() {
        int n;
        
        Scanner myInput = new Scanner(System.in);
        System.out.println("Input a positive number:");
        n = myInput.nextInt();
        
        return n;//getAPositiveInterger via return
    }
    
    // static only interactive with static - OOP
    public static void playWithDataVariables() {
        // variable is a RAM area that be named. Chiem 1 so byte nhat dinh
        int age = 20;
        int a = 10, b;
        b = 100;
        // ton 12 byter trong RAM
        System.out.println("age: " + age);
        int yob = 2001;
        age = 2022 - yob;
        System.out.println("age again: " + age);
        // () thay doi do uu tien
        System.out.println("age using transitive tech: " + (2022 - yob)); 

        System.out.printf("age using %% as in C: %d\n", (2022 - yob)); 

    }
    
    public static void playWithIntegers() {
        int n = 39; // moi con so, ki tu xuat hien trong code dc goi la
                    //literal value
                    //so nguyen xuat hien trong code mac dinh la int, 4 bytes 2.1 ty
        System.out.println("n: " + n);
        
        long m = 3_000_000_000L;   // _ literal trong code cho de doc
        System.out.println("m : " + m);
        
        int status = 0xFA;  //250 he 16
        System.out.println("status : " + status);
        
        int phone = 010;   //0 he 8 oct
        System.out.println("phone : " + phone);
    }
    
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi : " + pi);
        System.out.printf("pi : %.2f\n", pi); // java cam tuyet doi NO use %lf
        
        float vat = 0.1F;   //them F de khoi warn loss data khi doi kieu
        System.out.println("vat : " + vat);
    }
    
    public static void playWithCharracters() {
        // 2 byte cho kieu char, luu bang ma Unicode
        char m = '$';
        System.out.println("unit : " + m);
        // How about name? C: array of chars, NOT primitive >> complex
        //                  char name[] = "Nguyen Van An";
        
        //complex data type   >>   Object
        String name = "Chich Choe";
        System.out.println("My name is : " + name);
        System.out.println("1st letter is : " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());

        
    }
    
    public static void playWithBooleans() {
        //C: dung 1; Sai 0, int
        // Java dung True; Sai False  -> Boolean
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("OOps");
        else
            System.out.println("Ahihi");
            System.out.println("Vuon hong co loi nhung chua ai vao!");
        
            
    }
    
    // in n so tu nhien tinh tu 1
    //overload  khac data type (override  in oop Polymorphism)
    public static void printIntegerList(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
