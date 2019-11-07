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
public class Desa { 
    private final String konohagakure, amegakure, iwagakure, yugakure, takigakure, 
             kirigakure, sunagakure;
    private int noDesa;

    public Desa(){
        konohagakure = "1. Orochimaru\n2. Itachi Uchiha\n3. Tobi(Obito Uchiha)";
        amegakure = "1. Pain(Yahiko)\n2. Nagato\n3. Konan";
        iwagakure = "1. Deidara";
        yugakure = "1. Hidan";
        takigakure = "1. Kakuzu";
        kirigakure = "1. Kisame\n2. Juzo Biwa";
        sunagakure = "1. Sasori";
    }
    
    public int getNoDesa() {
        return noDesa;
    }

    public void setNoDesa(int noDesa) {
        this.noDesa = noDesa;
    }
    
    public void tampilDataDesa(){
        System.out.println("1.Konohagakure");
        System.out.println("2.Iwagakure");
        System.out.println("3.Yugakure");
        System.out.println("4.Kirigakure");
        System.out.println("5.Takigakure");
        System.out.println("6.Amegakure");
        System.out.println("7.Sunagakure");
        System.out.print("Pilih Desa : ");
    }
    
    public String getNamaDesa(int noDesa) {
        String result;
        switch(noDesa) {
            case 1: result = "Konohagakure"; break;
            case 2: result = "Iwagakure"; break;
            case 3: result = "Yugakure"; break;
            case 4: result = "Kirigakure"; break;
            case 5: result = "Takigakure"; break;
            case 6: result = "Amegakure"; break;
            default : result = "Sunagakure"; break;
        }
        return result;
    }
     
    public String desa(int noDesa) {
        String result;
        switch(noDesa) {
            case 1: result = konohagakure; break;
            case 2: result = iwagakure; break;
            case 3: result = yugakure; break;
            case 4: result = kirigakure; break;
            case 5: result = takigakure; break;
            case 6: result = amegakure; break;
            default : result = sunagakure; break;
        }
        return result;
    }
    
    public void tampilAnggotaDesa() {
        System.out.println("Konohagakure : ");
        System.out.println(desa(1));
        System.out.println("\nIwagakure : ");
        System.out.println(desa(2));
        System.out.println("\nYugakure : ");
        System.out.println(desa(3));
        System.out.println("\nKirigakure : ");
        System.out.println(desa(4));
        System.out.println("\nTakigakure : ");
        System.out.println(desa(5));
        System.out.println("\nAmegakure : ");
        System.out.println(desa(6));
        System.out.println("\nSunagakure : ");
        System.out.println(desa(7));
    }
}
