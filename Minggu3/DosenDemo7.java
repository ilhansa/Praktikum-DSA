import java.util.Scanner;

public class DosenDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int jumlah = sc.nextInt();
        Dosen7[] arrayOfDosen = new Dosen7[jumlah];

        Dosen7.tambahData(arrayOfDosen);
        Dosen7.tampilkanData(arrayOfDosen);
        Dosen7.hitungJumlahPerJenisKelamin(arrayOfDosen);
        Dosen7.hitungRataRataUsiaPerJenisKelamin(arrayOfDosen);

        sc.close();
    }
}