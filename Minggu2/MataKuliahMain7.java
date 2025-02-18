package Minggu2;

public class MataKuliahMain7 {
    public static void main(String[] args) {
        MataKuliah7 ASD = new MataKuliah7(
            "ASD", "Algoritma Struktur Data", 
            2, 4
        );
        ASD.tampilkanInformasi();
        ASD.ubahSks(3);
        ASD.tambahJam(4);
        ASD.kurangiJam(8);
        ASD.tampilkanInformasi();

        MataKuliah7 PASD = new MataKuliah7();
        PASD.tampilkanInformasi();
        PASD.ubahSks(2);
        PASD.tambahJam(6);
        PASD.kurangiJam(8);
        PASD.tampilkanInformasi();

        MataKuliah7 SOP = new MataKuliah7(
            "SOP", "SISTEM OPERASI",
            2, 4
            );
        SOP.tampilkanInformasi();
    }
}
