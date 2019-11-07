/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan60;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota anggota = new Anggota();
        
        anggota.tampilDataDesa();
        anggota.setNoDesa(sc.nextInt());
        
        System.out.println("");
        anggota.tampilAnggotaDesa(anggota.getNoDesa());
    }
    
}
