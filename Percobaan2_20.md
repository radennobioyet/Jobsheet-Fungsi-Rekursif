# JOBSHEET 14

# Percobaan 2

Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan! 
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32 




Jawaban 
1. Proses pemanggilan fungsi hitungPangkat() akan terus dilakukan hingga nilai y mencapai 0, karena itu adalah kondisi dasar yang menghentikan rekursi. 
2.
```
import java.util.Scanner;

public class Percobaan2_20 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x + "x");
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();

        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        
        System.out.print("Deret perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}
```