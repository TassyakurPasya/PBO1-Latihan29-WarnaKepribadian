/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama : Tassyakur Pasya
 * NIM : 10118009
 * Kleas : IF-01
 * Deskripsi Program : Warna Kepribadian
 */
public class Warnakepribadian {

    /**
     * @param args the command line arguments
     */
    public static String nama;
    public static String warna;
    public static String warnaPeriksa;
    public static String Nama;
    
    public static final String reset = "\u001B[0m";
    public static final String merah = "\u001B[31m";
    public static final String hijau = "\u001B[32m";
    public static final String kuning = "\u001B[33m";
    public static final String biru = "\u001B[34m";
    public static final String ungu = "\u001B[35m";
    public static final String biruMuda = "\u001B[36m";
    public static final String putih = "\u001B[37m";
    public static final String bgMerah = "\u001B[41m";
    public static final String bgHijau = "\u001B[42m";
    public static final String bgKuning = "\u001B[43m";
    public static final String bgBiru = "\u001B[44m";
    public static final String bgUngu = "\u001B[45m";
    
    public static void warnaBiru(){
            System.out.println("1. Menyenangankan");
            System.out.println("2. Bijaksana");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
            System.out.println("4. Dinamis");
            System.out.println("5. Senang Berbagi");
            System.out.println("6. Bersahabat");
            System.out.println("7. Tidak terlalu");
            System.out.println("8. Menyembunyikan perasaan karena karakternya jenderung mencari jalan damai");
    }
    public static void warnaMerah(){
            System.out.println("1. Periang");
            System.out.println("2. Pemberani");
            System.out.println("3. Berani mengambil resiko dalam setiap langkah");
            System.out.println("4. Menyukai tantangan");
            System.out.println("5. Kurang sabar");
            System.out.println("6. Dapat menahan marah namun jika tahap puncak toleransi, kemarahannya akan sulit dikontrol");
            System.out.println("7. Memiliki enenrgi kehangatan dan cinta");
    }
    public static void warnaKuning(){
            System.out.println("1. Optimis");
            System.out.println("2. Suka bergaul");
            System.out.println("3. Periang");
            System.out.println("4. Suka penolon");
            System.out.println("5. Lincah dan aktif");
            System.out.println("6. Tidak suka meremehkan orang lain");
            System.out.println("7. Loyal");
            System.out.println("8. Hangat");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringklai goyah dan tidak stabil");
            System.out.println("10. Cenderung penakut");
    }
    public static void warnaUngu(){
            System.out.println("1. Optimis");
            System.out.println("2. Tidak pernah ragu");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat");
            System.out.println("4. Memiliki ambisi yang besar");
            System.out.println("5. Memiliki empati yang besar");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
    }
    public static void warnaHijau(){
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah merasa iri,");
            System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" + biruMuda +
                " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
          
          System.out.println(bgMerah+putih+"\t\t MERAH \t\t\t");
          System.out.println(bgHijau+putih+"\t\t HIJAU \t\t\t");
          System.out.println(bgKuning+putih+"\t\t KUNING \t\t");
          System.out.println(bgBiru+putih+"\t\t BIRU \t\t\t");
          System.out.println(bgUngu+putih+"\t\t UNGU \t\t\t");
          
          System.out.print("PILIH WARNA FAVORITMU : ");
          Scanner tampWarna = new Scanner(System.in);
          warna = tampWarna.nextLine();
          warnaPeriksa = warna.toUpperCase();
          
          System.out.print("NAMA KAMU : ");
          Scanner tampNama = new Scanner(System.in);
          nama = tampNama.nextLine();
          Nama = nama.toUpperCase();
          
          System.out.println("=====HASIL TEST KEPRIBADIAN "+nama+"=====");
          switch(warnaPeriksa){
              case "MERAH" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+merah+warnaPeriksa);
                  warnaMerah();
                  break;
              case "HIJAU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+hijau+warnaPeriksa);
                  warnaHijau();
                  break;
              case "BIRU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+biru+warnaPeriksa);
                  warnaBiru();
                  break;
              case "UNGU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+ungu+warnaPeriksa);
                  warnaUngu();
                  break;
              case "KUNING" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+kuning+warnaPeriksa);
                  warnaKuning();
                  break;
              default:
                  System.out.println("OOoopppsss... Belum terindentifinisi");
              
                      
          }
          
          
          
          
    }
    
}
