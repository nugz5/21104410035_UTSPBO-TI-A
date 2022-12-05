/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penyanyi;

/**
 *
 * @author Administrator
 */
public class Dangdut {
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    public void Dangdut(){
        
    }
    
    void singer (String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu, String kopi_Dangdut){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
}