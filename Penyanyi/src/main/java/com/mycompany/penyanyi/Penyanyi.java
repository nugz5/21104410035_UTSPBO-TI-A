/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.penyanyi;

/**
 *
 * @author Nugroho Gusti Bintang Fajar - 21104410035
 */
public class Penyanyi extends Pop{
    public static void main(String[]args){
        Pop pop = new Pop ("Black Pink", "How You Like That");
        Dangdut dangdut = new dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
    }

    private static class dangdut extends Dangdut {

        public dangdut() {
        }
    }
}