/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogmanagement;

import data.Dog;

/**
 * SAN CONG TAC
 * @author Owner
 */
public class DogManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog chiHu = new Dog("Chi Hua Hua", 2020, 1.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("Ngáo DA", 2001, 50.0);
        ngaoDa.bark();
        
        Dog choPhuQuoc = new Dog("Phu Ti", 2000,15.0);
        choPhuQuoc.bark();
        
        //Dog.name = "ABC";
        
        chiHu.showHang();
        ngaoDa.showHang();
        choPhuQuoc.showHang();
        
    }
    
}
