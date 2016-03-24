

package programkubus;

import java.util.Scanner;
public class ProgramKubus {
    static int panjang;
    static int tinggi;
    static int lebar;
    static int luas;
    static int volume;
    static Scanner sanjing;
  
    public static void main(String[] args) {
        sanjing = new Scanner(System.in);
        System.out.println("Program Kubus");
        System.out.print("Masukan panjang : ");
        panjang = sanjing.nextInt();
        
        System.out.print("Masukan lebar : ");
        lebar = sanjing.nextInt();
        
        System.out.print("Masukan tinggi : ");
        tinggi = sanjing.nextInt();
        System.out.println("");
        System.out.println("Penghitungan Luas Kubus :");
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("2x("+panjang+"x"+lebar+"+"+panjang+"x"+tinggi+"+"+lebar+"x"+tinggi+") = "+luas);
      
        //Buat Sintak penghitung volume baloknya//
    }
    
}
