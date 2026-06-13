package CM3;
import java.util.Scanner;

public class RoyalDelishApp17 {
    public static void main(String[] args) {
        RoyalDelishSystem17 system = new RoyalDelishSystem17();
        Scanner input = new Scanner(System.in);
        
        // Memenuhi instruksi catatan: Data awal otomatis diinput menggunakan Konstruktor
        system.tambahAntrian("Ainra", "08224500000"); // Antrean 1
        system.tambahAntrian("Danra", "08224511111"); // Antrean 2
        system.tambahAntrian("Sanri", "08224522222"); // Antrean 3

        int pilihan;
        do {
            System.out.println("\n=========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            pilihan = input.nextInt();
            input.nextLine(); 
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = input.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = input.nextLine();
                    system.tambahAntrian(nama, noHp);
                    break;
                case 2:
                    system.cetakAntrian();
                    break;
                case 3:
                    Pembeli17 dipanggil = system.hapusAntrianTerdepan();
                    if (dipanggil == null) {
                        System.out.println("Gagal: Tidak ada antrian pembeli.");
                        break;
                    }

                    System.out.print("Kode Pesanan: ");
                    int kode = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.print("Nama Pesanan: ");
                    String namaMenu = input.nextLine();
                    System.out.print("Harga       : ");
                    int harga = input.nextInt();
                    input.nextLine(); // clear buffer

                    system.tambahPesanan(kode, namaMenu, harga);
                    System.out.println(dipanggil.namaPembeli + " telah memesan " + namaMenu);
                    System.out.println("maka antrian harus berkurang.");
                    break;
                case 4:
                    system.cetakLaporanPesanan();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}