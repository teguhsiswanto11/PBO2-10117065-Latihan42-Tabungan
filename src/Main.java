import java.util.Scanner;

/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Mengambil uang dari saldo yang diinputkan oleh user dan menampilkan
 * sisa saldo setelah melakukan penarikan
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tab = new Tabungan(scn1.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        int y = tab.ambilUang(scn2.nextInt());
        System.out.println("Saldo Anda Sekarang : "+(tab.getSaldo() -  tab.ambilUang(y)));

    }
}
