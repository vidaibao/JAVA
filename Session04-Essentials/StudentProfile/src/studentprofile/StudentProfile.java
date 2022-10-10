/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test input entry from keyboard
        // 
        inputProfile1();
    }

    public static void inputProfile1() {
        String id, name, adress;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //69 < 79 endless loop
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());// phan giai, trich xuat
                break;
            } catch (Exception e) {
                //yob = 69;
                System.out.println("Do you know input a positive number?!");
            }
        }

        System.out.print("Input adress: ");
        adress = sc.nextLine().toUpperCase();

        System.out.println("This is your profile:");
        System.out.println("name : " + name);
        System.out.println("yob  : " + yob);
        System.out.println("Adress : " + adress);

    }

    public static void inputProfile() {
        String id, name, adress;
        int yob;

        Scanner sc = new Scanner(System.in);

        //System.out.println("Input id: ");
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        //yob = sc.nextInt();
        // input digit >> next input be flushed
        // buffer gabagge
        // so have to refresh buffer but java have no clean buffer func
        //sc.nextLine();// refresh buffer _ ADP ta\ dao
        //yob = Integer.parseInt(sc.nextLine());// phan giai, trich xuat

        try {
            yob = Integer.parseInt(sc.nextLine());// phan giai, trich xuat
        } catch (Exception e) {
            // chửi, set default, retry input...
            //e.printStackTrace();// xem thư báo, e: obj
            yob = 69;
        }

        System.out.print("Input adress: ");
        adress = sc.nextLine().toUpperCase();

        System.out.println("This is your profile:");
        System.out.println("name : " + name);
        System.out.println("yob  : " + yob);
        System.out.println("Adress : " + adress);

    }

}
