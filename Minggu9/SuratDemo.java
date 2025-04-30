package Minggu9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);

        int pilih;    
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Verifikasi surat izin");
            System.out.println("3. Melihat surat izin terakhir");
            System.out.println("4. Cari surat izin berdasarkan nama");
            System.out.println("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Id: ");
                    String id = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis izin (I/S/A): ");
                    char izin = input.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = input.nextInt();
                    Surat7 surat = new Surat7(id, nama, kelas, izin, durasi);
                    stack.push(surat);
                    System.out.println("Surat " + surat.namaMahasiswa
                    +  " diterima");
                    break;
            
                case 2:
                    Surat7 verifikasi = stack.pop();
                    if(verifikasi != null) {
                        System.out.println("Memverifikasi surat dari " 
                        + verifikasi.namaMahasiswa);
                    }
                break;

                case 3:
                    Surat7 lihat = stack.peek();
                    if(lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh "
                        + lihat.namaMahasiswa);
                    }
                break;

                case 4:
                    boolean ditemukan = false;
                    System.out.println("Masukkan nama: ");
                    String name = input.nextLine(); 
                    for (int i = stack.size - 1; i >= 0; i--) {
                        if (stack.stack[i] != null && 
                            name.equalsIgnoreCase(stack.stack[i].namaMahasiswa)) 
                        {
                            System.out.println("Surat ditemukan di indeks " + i);
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Surat tidak ditemukan");
                    }
                break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while(pilih >= 1 && pilih <= 4);
        input.close();
    }
}
