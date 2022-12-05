/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTSPBO_KelasA;

/**
 *
 * @author Putri Rochfiani
 * TI-A
 */
public class dangdut {
    
    
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
