/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nav.main;

import nav.util.MyToys;

/**
 *
 * @author Owner
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("myPI: " + MyToys.PI);
        
        System.out.println(MyToys.getInteger());
        
        System.out.println(MyToys.getInteger("Input your number: "));
    }
}
