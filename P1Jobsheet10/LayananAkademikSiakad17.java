package P1Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSiakad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntriLayanan17 antrian = new AntriLayanan17(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang"); // Menu baru
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    // Sesuaikan konstruktor Mahasiswa17 jika membutuhkan 4 parameter
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi);
                    antrian.TambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa17 dilayani = antrian.layaniMahasiswa17();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa:");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6: // Case baru untuk memanggil LihatAkhir[cite: 1]
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}