/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.Student;

/**
 *
 * @author Owner
 */
public class Stage {
    public static void main(String[] args) {
        // s1: reference, pointer, object var ||  obj, RAM in HEAP, instance
        // NEW:     1.Clone obj và static
        //          2.Gọi constructor rót data vào vùng clone
        //          3.Chốt lại tọa độ vùng new vừa rồi, đem tọa độ đó đi gán biến con trỏ
        Student s1 = new Student("SE345678", "Chich Bong", 2014, 8.5);
        
        s1.showProfile();// s1 dang luu, nam giu toa do vung ram OBJ in HEAP
        // s1 is var >>> can change value
        // s1 có thể tham chiếu đến chỗ này chỗ kia
        // back up toa do CB vao x
        Student x = s1; // a=10;b=a >> b lay dia chi cua a || 2 pointers tro cung vung new
        
        s1 = new Student("SA321654", "Chich Choe", 2010, 8.0);
        s1.showProfile();
        x.showProfile();
        
        //CB bi mất do ko còn ai trỏ đến nữa >>1 vùng ram new obj cũ >> JVM đi dọn rác
        // 
        

        // VI DIỆU' điều gì sẽ xảy ra
        new Student("SE666789","CCB",2001,9.9).showProfile();
        
    }
}
