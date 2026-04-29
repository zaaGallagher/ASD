package P1Jobsheet10;
import java.util.Scanner;

public class MainKRS17 {
    public static void menu() {
        System.out.println("\n========================================");
        System.out.println("   SISTEM ANTRIAN KRS DPA - ABSEN 17");
        System.out.println("========================================");
        System.out.println("1. Tambah Antrian Mahasiswa (Enqueue)");
        System.out.println("2. Panggil/Proses KRS (Dequeue 2 Mhs)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Lihat 2 Mahasiswa Terdepan (Peek)");
        System.out.println("5. Lihat Mahasiswa Terakhir");
        System.out.println("6. Cetak Laporan Statistik");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("8. Keluar");
        System.out.print("Pilih Menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS17 antri = new QueueKRS17(10); 
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : "); String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : "); String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi : "); String prodi = sc.nextLine();
                    antri.enqueue(new Mahasiswa17(nim, nama, prodi));
                    break;
                case 2:
                    antri.dequeueDuo();
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peekTwo();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    antri.cetakStatistik();
                    break;
                case 7:
                    antri.clear();
                    break;
                case 8:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
        
        sc.close();
    }
}