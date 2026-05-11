import java.util.Scanner;

public class SLLMain17 {

    static Scanner sc = new Scanner(System.in);
    static SingleLinkedList17 sll = new SingleLinkedList17();

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline sisa

            switch (pilihan) {
                case 1 -> sll.print();
                case 2 -> tambahDiAwal();
                case 3 -> tambahDiAkhir();
                case 4 -> sisipkanSetelahNama();
                case 5 -> sisipkanPadaIndex();
                case 0 -> System.out.println("Program selesai. Sampai jumpa!");
                default -> System.out.println("✘ Pilihan tidak valid, coba lagi.\n");
            }

        } while (pilihan != 0);

        sc.close();
    }

    static void tampilkanMenu() {
        System.out.println("  1. Tampilkan Semua Data              ");
        System.out.println("  2. Tambah Data di Awal               ");
        System.out.println("  3. Tambah Data di Akhir              ");
        System.out.println("  4. Sisipkan Setelah Nama             ");
        System.out.println("  5. Sisipkan pada Index               ");
        System.out.println("  0. Keluar                            ");
    }

    static Mahasiswa17 inputDataMahasiswa() {
        System.out.print("  Nama   : ");
        String nama = sc.nextLine();
        System.out.print("  NIM    : ");
        String nim = sc.nextLine();
        System.out.print("  Kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("  IPK    : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa17(nama, nim, kelas, ipk);
    }

    static void tambahDiAwal() {
        System.out.println("\n--- Tambah Data di Awal ---");
        Mahasiswa17 mhs = inputDataMahasiswa();
        sll.addFirst(mhs);
    }

    static void tambahDiAkhir() {
        System.out.println("\n--- Tambah Data di Akhir ---");
        Mahasiswa17 mhs = inputDataMahasiswa();
        sll.addLast(mhs);
    }

    static void sisipkanSetelahNama() {
        System.out.println("\n--- Sisipkan Setelah Nama ---");
        System.out.print("  Masukkan nama acuan: ");
        String key = sc.nextLine();
        Mahasiswa17 mhs = inputDataMahasiswa();
        sll.insertAfter(key, mhs);
    }

    static void sisipkanPadaIndex() {
        System.out.println("\n--- Sisipkan pada Index ---");
        System.out.print("  Masukkan index (mulai dari 1): ");
        int index = sc.nextInt();
        sc.nextLine(); 
        Mahasiswa17 mhs = inputDataMahasiswa();
        sll.insertAt(index, mhs);
    }
}