
package years;

import java.util.Scanner;


public class Years {
// PROGRAM INI BERTUJUAN UNTUK MENGETAHUI TAHUN YANG DIINPUT USER ADALAH TAHUN KABISaT ATAU BUKAN
    public static void main(String[] args) {
        //deklarasikan variabel
        int tahun;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tahun yang diinginkan ");
        tahun = input.nextInt();
        // suatu tahun dikatakan kabisat apabila habis dibagi 4 atau habis dibagi 400
        if (tahun > 0 && tahun % 4 == 0 )
        {
            System.out.println("Tahun Yang Anda Input Merupakan Tahun Kabisat");
        }
        else if (tahun % 400 == 0 && tahun % 100 == 0)
        {
            System.out.println("Tahun Yang Anda Input Merupakan Tahun Kabisat");
        }
        else if (tahun > 0 && tahun % 4 != 0 && tahun % 400 != 0 && tahun % 100 != 0)
        {
            System.out.println("Tahun Yang Anda Input Bukan Merupakan Tahun Kabisat");
        }
        else
        {
            System.out.println("Maaf inputan Anda Salah");
        }
    }
    
}
