package BruteForceDivideConquer.PRAK6;
import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        System.out.println("Masukkan jumlah data mahasiswa yang akan diinput:");
        int jmlMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi17 listMhs = new MahasiswaBerprestasi17();

       for (int i = 0; i < jmlMhs; i++) {
            System.out.println("--- Masukkan Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        // System.out.println("Data mahasiswa setelah sorting Bubble Sort (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\n-------------------------------------------");

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("\n-------------------------------------------");

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
        list.tampil();
        //melakukan pencarian data sequential search
        System.out.println("-------------------------------------------");
        System.out.print("Pencarian data: ");
        System.out.println("-------------------------------------------");
        System.out.println("Masukkan IPK yang ingin dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Search");
        double posisi = list.sequentialSearch(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data binary 
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("-------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        System.out.print("IPK: ");
        double cariBinary = sc.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println("menggunakan Binary Search");
        System.out.println("-------------------------------------------");
        double posisi2 = list.findBinarySearch(cariBinary, 0, jmlMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cariBinary, pss2);
        list.tampilDataSearch(cariBinary, pss2);
        sc.close();
    }
}
