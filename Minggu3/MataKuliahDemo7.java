import java.util.Scanner;

public class MataKuliahDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matkul: ");
        int jumlahMatkul = sc.nextInt();
        MataKuliah7[] arrayMataKuliah = new MataKuliah7[jumlahMatkul];
        MataKuliah7.tambahData(arrayMataKuliah);
        MataKuliah7.cetakInfo(arrayMataKuliah);

        sc.close();
    }
}
