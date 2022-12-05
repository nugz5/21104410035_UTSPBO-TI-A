/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainenergi;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class MainEnergi {
    public static void main(String[] args) {
        Kinetic massa = new Kinetic();
        Kinetic kecepatan = new Kinetic();
        
        System.out.println("Program Menghitung Energi Kinetik : ");
        System.out.print("Masukkan massa benda : ");
        Scanner masa = new Scanner(System.in);
        massa.setMassaBenda(masa.nextDouble());
        
        System.out.print("Masukkan kecepatan benda : ");
        Scanner cepat = new Scanner(System.in);
        kecepatan.setKecepatanBenda(cepat.nextDouble());
        
        System.out.println("Maka Energi Kinetic nya adalah : " + 0.5 * massa.getMassaBenda() * Math.pow(kecepatan.getKecepatanBenda(), 2));
    }

    private static class Kinetic {

        public Kinetic() {
        }

        private void setMassaBenda(double nextDouble) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setKecepatanBenda(double nextDouble) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double getMassaBenda() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double getKecepatanBenda() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
