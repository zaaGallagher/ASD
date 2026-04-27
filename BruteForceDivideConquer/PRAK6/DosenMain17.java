package BruteForceDivideConquer.PRAK6;
import java.util.Scanner;
public class DosenMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        dataDosen17 data = new dataDosen17();
        int pilih = 0;

        while (pilih != 5) {
            System.out.println("\n=== Menu Data Dosen ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Dosen dengan Bubble Sort");
            System.out.println("4. Urutkan Data Dosen dengan Selection Sort");
            System.out.println("5. Urutkan Data Dosen dengan Insertion Sort");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen17 dosen = new Dosen17(kode, nama, jenisKelamin, usia);
                    data.tambah(dosen);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.bubbleSort();
                    System.out.println("Data dosen telah diurutkan dengan Bubble Sort.");
                    break;
                case 4:
                    data.selectionSort();
                    System.out.println("Data dosen telah diurutkan dengan Selection Sort.");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data dosen telah diurutkan dengan Insertion Sort.");
                    break;
                default:
                    if (pilih != 5) {
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
            }
        }

    }
}
