

package programkubus;

import java.util.Scanner;
public class ProgramKubus {
    static int panjang;
    static int tinggi;
    static int lebar;
    static int luas;
    static int volume;
    static Scanner s;
  
    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Program Kubus");
        System.out.print("Masukan panjang : ");
        panjang = s.nextInt();
        
        System.out.print("Masukan lebar : ");
        lebar = s.nextInt();
        
        System.out.print("Masukan tinggi : ");
        tinggi = s.nextInt();
        System.out.println("");
        System.out.println("Penghitungan Luas Kubus :");
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("2x("+panjang+"x"+lebar+"+"+panjang+"x"+tinggi+"+"+lebar+"x"+tinggi+") = "+luas);
      
        
    }
    
}
