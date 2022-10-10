/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nav.util;

import java.util.Scanner;



/**
 *
 * @author Owner
 */
// class chwa cac do choi dung cho moi noi, vi no public static, common use LIBRARY
public class MyToys {
    // public static PROPERTIES & METHODS
    // almost STATIC, non-STATIC depend on designer
    public static final double  PI = 3.14159;
    // static de sc trong func can refer
    // private use in internal
    private static Scanner sc = new Scanner(System.in);
    
    //DI: Dependency Injection          errMsg, lower, upper
    public static int getInteger(String inputMessage) {
        
        int n;
        while (true) {
            try {
                System.out.print(inputMessage );
                n = Integer.parseInt(sc.nextLine()); // hot sach buffer bo dau enter
                // if out range
                return n;
            } catch (Exception e) {
                System.out.println("Do you know to input an integer?!");
            }
         }
    }
    
    //input 1 integer
    public static int getInteger() {
        
        int n;
        while (true) {
            try {
                System.out.println("Input an integer: ");
                n = Integer.parseInt(sc.nextLine()); // hot sach buffer bo dau enter
                // if out range
                return n;
            } catch (Exception e) {
                System.out.println("Do you know to input an integer?!");
            }
         }
    }
}
