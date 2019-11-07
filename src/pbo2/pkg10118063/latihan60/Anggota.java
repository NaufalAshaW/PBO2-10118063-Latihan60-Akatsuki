/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan60;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Anggota extends Desa {
    
    public Anggota(){
        super();
    }
    
    public void tampilAnggotaDesa(int noDesa){
        System.out.println("=====Anggota Akatsuki Desa " +getNamaDesa(noDesa)+ "=====");
        
        if(noDesa <= 7){
            System.out.println(desa(noDesa));
        }
        else{
            super.tampilAnggotaDesa();
        }
    }
}
