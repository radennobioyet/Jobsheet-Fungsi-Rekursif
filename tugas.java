import java.util.Scanner;

public class tugas {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = input.nextInt();

        System.out.println("--- Menggunakan Fungsi Rekursif ---");
        int total = hitungRekursif(n);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }

    public static int hitungRekursif(int n) {
        if (n == 0) {
            return 0;
        }

        System.out.print("Masukkan angka ke-" + n + ": ");
        int angka = input.nextInt();
        return angka + hitungRekursif(n - 1);
    }

    public static int hitungIteratif(int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();
            total += angka;
        }
        return total;
    }
}