import java.util.Scanner;

public class MataKuliah7 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah7(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public MataKuliah7() {}

    public static void tambahData(MataKuliah7[] arrayMataKuliah) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayMataKuliah.length; i++) {
            arrayMataKuliah[i] = new MataKuliah7();
            System.out.print("Kode matkul: ");
            arrayMataKuliah[i].kode = sc.nextLine();
            System.out.print("Nama matkul : ");
            arrayMataKuliah[i].nama = sc.nextLine();
            System.out.print("Sks : ");
            arrayMataKuliah[i].sks = sc.nextInt();
            System.out.print("Jumlah jam: ");
            arrayMataKuliah[i].jumlahJam = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------");
        }
        sc.close();
        }

    public static void cetakInfo(MataKuliah7[] arrayMataKuliah) {
        for (int i = 0; i < arrayMataKuliah.length; i++) { 
            System.out.println("Data matkul ke-" + (i+1));
            System.out.println("Kode: " + arrayMataKuliah[i].kode);
            System.out.println("Nama: " + arrayMataKuliah[i].nama);
            System.out.println("Sks: " + arrayMataKuliah[i].sks);
            System.out.println("Jumlah Jam: " + arrayMataKuliah[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
