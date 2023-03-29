/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doga;


public class oop_doga {

    public static void main(String[] args) throws hibaException {
        Mercedes auto1=new Mercedes("ISC-500","Mercedes Benz");
        
        System.out.println(auto1.rendszam+","+auto1.marka);
        System.out.println(auto1.megtettKm);
        auto1.KmNoveles(1);
        System.out.println(auto1.megtettKm);
        
    }
    
}
