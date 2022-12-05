/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mainenergi;
/**
 *
 * @Nugz5
 */
import java.util.Scanner;

/**
 *
 * @nugz5
 */
public class MainEnergi extends Kinetic {
    public static void main(String[] args) {
        
        MainEnergi me = new MainEnergi();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kecepaan benda = ");
        Double v = input.nextDouble();
        me.setKecepatanBenda(v);
        System.out.println();
        
        System.out.print("Masukkan massa benda  = ");
        Double m = input.nextDouble();
        me.setMassaBenda(m);
        System.out.println();
        
        Double ek = 0.5 * me.getMassaBenda() * me.kecepatanBenda * me.getKecepatanBenda();
        me.setEk(ek);
        
        
        System.out.println( "Jadi Hasilnya adalah " + me.getEk() + " Joule");
        
        
        
    }
}