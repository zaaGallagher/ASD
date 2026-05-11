
import java.util.Scanner;

public class MainTugas17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        QueueTugas17 antrian = new QueueTugas17(kapasitas);

        int pilih;

        do {

            System.out.println("\n===== MENU ANTRIAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cek Antrian Kosong");
            System.out.println("9. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Masukkan NIM        : ");
                    String nim = sc.nextLine();

                    System.out.print("Masukkan Nama       : ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Keperluan  : ");
                    String keperluan = sc.nextLine();

                    MahasiswaTugas17 mhs = new MahasiswaTugas17(nim, nama, keperluan);

                    antrian.enqueue(mhs);

                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.tampilAntrian();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 8:

                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }

                    break;

                case 9:

                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian belum penuh");
                    }

                    break;

                case 0:
                    System.out.println("Terima kasih telah sabar menunggu.");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}
