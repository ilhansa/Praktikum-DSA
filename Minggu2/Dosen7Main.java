package Minggu2;

public class Dosen7Main {
    public static void main(String[] args) {
        Dosen7 ilsa = new Dosen7();
        ilsa.tampilkanInformasi();
        ilsa.ubahKeahlian("Algoritma Struktur Data");
        ilsa.tampilkanInformasi();

        Dosen7 ilhan = new Dosen7(
            "1", "Ilhan", false,
            2024, "Algoritma" 
        );
        ilhan.tampilkanInformasi();
        ilhan.setStatusAktif(true);
        System.out.println("Masa Kerja: " + ilhan.hitungMasaKerja(2025));
        ilhan.ubahKeahlian("AlgoritmaStrukturData");

        Dosen7 salih = new Dosen7(
            "2", "Salih", false,
            2023, "ASD"
        );
        System.out.println("Masa kerja: " + salih.hitungMasaKerja(2025));
        salih.tampilkanInformasi();
    }
}
