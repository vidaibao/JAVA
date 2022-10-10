/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws1;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class WS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //boolean res = checkPrimeNumbers();
        //printFirst1000Primes(1000);
        solvePtBac1();
                
    }
    
    //1. Kiem tra xem 1 so co phai la so nguyen to 1.....1000
    // boolean isPrime 
    // Prime number is a number that is greater than 1 and divided by 1 or itself only
    public static boolean isPrime(int n) {
        //looping from 2 to num/2. or 2 to <= Math.sqrt(n)
        //It is because a number is not divisible by more than its half or  Math.sqrt(n)
        int upperBound = (int) Math.sqrt(n);
        for (int i = 2; i <= upperBound; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void checkPrimeNumbers() {
        //int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a greater than 1 number!");
        int n = sc.nextInt();
        if (n<2){
            System.out.println("number must greater than 1!");
            return ;
        }
        if (n == 2) 
            return ;
        if (isPrime(n)){//for 2.....can(n)   ; n from 3....
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
    
    
    //2. in ra 1000 so nguyen to dau tien printFirstPrimes
    public static void printFirst1000Primes(int primeNum) {
        int iCount = 1, i = 1;
        while (iCount <= primeNum) {
            if(isPrime(i)) {
                System.out.print(i + " ");
                iCount++;
            }
            i++;
        }
    }
    
    
    
    //3. Nhap tu ban phim 2 he so a   b cho pt bac 1 ax + b = 0
    // In ra nghiem void solve
    public static void solvePtBac1() {
        //int a, b;        
        //ax + b = 0  input value is a string "a b"
        //if a == 0 PT vo nghiem
        //if a != 0 va b == 0 >> PT x = 0
        //if a != 0 va b != 0 >> PT x = -b/a
        System.out.println("Input \"a b\" values of ax + b = 0"); 
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());

        if (a == 0){
            System.out.println("a==0  >> PT Vo nghiem!");
        }else if (b == 0) {
            System.out.println("PT co 1 nghiem x = 0");
        }else{
            if (b%a == 0){
                System.out.println("PT co nghiem x = " + (-b/a));
            }else{
                double re = -b/a;
                System.out.println("PT co nghiem x = -" + b + "/" + a + " = " + re);
            }
            
        }
        
        
        
    }
}
