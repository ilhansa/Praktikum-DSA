import java.util.Scanner;

public class MahasiswaDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int jumlah = sc.nextInt();
        Mahasiswa7[] arrayOfMahasiswa = new Mahasiswa7[jumlah];

        Mahasiswa7.tambahData(arrayOfMahasiswa);
        Mahasiswa7.cetakInfo(arrayOfMahasiswa);
        sc.close();
    }
}