/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan63.gradiengarislurus;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 
 * @author Acer
 */
public class PBO0210117043Latihan63Gradiengarislurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koordinat garis = new koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik" + "(" + garis.getY2() + "," + garis.getY1() + ")" + "dan" + "(" + garis.getX2() + "," + garis.getX1() + ")");
        System.out.println("memiliki gradien sebesar " + garis.hitungGradien());
        System.out.println("");
        koordinat garis1 = new koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik" + "(" + garis1.getY2() + "," + garis1.getY1() + ")" + "dan" + "(" + garis1.getX2() + "," + garis1.getX1() + ")");
        System.out.println("memiliki gradien sebesar " + garis.hitungGradien());

    }

}
