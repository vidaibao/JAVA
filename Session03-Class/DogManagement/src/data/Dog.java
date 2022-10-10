/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/** package
 * Ngăn tủ để chứa các loại khuôn, class 
 * Mô tả các thông tin, chi tiết bên trong khuôn
 * @author Owner
 */
public class Dog {//template, form, blueprint, prototype, mold

    /**
     *    public static String name;
     *      default  PRIVATE
     */
    String name;
    int yob;
    double weight;
    
    public Dog(String iName, int iYob, double iWeight) {//constructor, phễu nhận vlieu đúc khuôn.
        // Return OBJ _ Mỗi lần chạy là tạo ra 1 obj mới, không phải trả về giá trị, NOT void.
        name = iName;   //Assign value
        yob = iYob;
        weight = iWeight;
    }
    
    public void bark() {
        System.out.println("Gogogogogogo....my name is " + name);
    }
    
    public void showHang(){
        System.out.printf("|%-12s|%4d|%4.1f|\n", 
                name, yob, weight);
    }
    
    //public void setNewWeight(double newWeight) {
    //    weight = newWeight;
    //}

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
