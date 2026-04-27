package BruteForceDivideConquer.CM;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa17[] mhs = {
                new Mahasiswa17("22001", "Andi", "Teknik Informatika", "08951"),
                new Mahasiswa17("22002", "Budi", "Teknik Informatika", "08952"),
                new Mahasiswa17("22003", "Citra", "Sistem Informasi Bisnis", "08953")
        };

        Buku17[] buku = {
                new Buku17("B001", "Algoritma", "Reza", 2020),
                new Buku17("B002", "Basis Data", "Vesa", 2019),
                new Buku17("B003", "Pemrograman", "Hisam", 2021),
                new Buku17("B004", "Fisika", "Drian", 2024)
        };

        Peminjaman17[] pj = {
                new Peminjaman17(mhs[0], buku[0], 7),
                new Peminjaman17(mhs[1], buku[1], 3),
                new Peminjaman17(mhs[2], buku[2], 10),
                new Peminjaman17(mhs[2], buku[3], 6),
                new Peminjaman17(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nMenu 1:");
                    System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
                    System.out.println("1. Tampilkan Mahasiswa");
                    System.out.println("2. Tampilkan Buku");
                    System.out.println("3. Tampilkan Peminjaman");
                    System.out.println("4. Urutkan Berdasarkan Denda");
                    System.out.println("5. Cari Berdasarkan NIM");
                    System.out.println("0. Keluar");

                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa17 m : mhs)
                        m.tampil();
                    break;

                case 2:
                    System.out.println("\nMenu 2:");
                    System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
                    System.out.println("1. Tampilkan Mahasiswa");
                    System.out.println("2. Tampilkan Buku");
                    System.out.println("3. Tampilkan Peminjaman");
                    System.out.println("4. Urutkan Berdasarkan Denda");
                    System.out.println("5. Cari Berdasarkan NIM");
                    System.out.println("0. Keluar");

                    System.out.println("\nDaftar Buku:");
                    for (Buku17 b : buku)
                        b.tampil();
                    break;

                case 3:
                    System.out.println("\nMenu 3:");
                    System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
                    System.out.println("1. Tampilkan Mahasiswa");
                    System.out.println("2. Tampilkan Buku");
                    System.out.println("3. Tampilkan Peminjaman");
                    System.out.println("4. Urutkan Berdasarkan Denda");
                    System.out.println("5. Cari Berdasarkan NIM");
                    System.out.println("0. Keluar");

                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman17 p : pj)
                        p.tampil();
                    break;

                case 4:
                    System.out.println("\nMenu 4:");
                    System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");

                    insertionSort(pj); 

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman17 p : pj) {
                        p.tampil();
                    }

                    int jumlahKenaDenda = hitungMahasiswaDenda(pj);
                    System.out.println("------------------------------------------");
                    System.out.println("Jumlah mahasiswa yang dikenakan denda: " + jumlahKenaDenda);
                    System.out.println("------------------------------------------");
                    break; 

                case 5:
                    System.out.println("\nMenu 5:");
                    System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");

                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    sortByNIM(pj);
                    int hasil = binarySearch(pj, cari);

                    if (hasil != -1) {
                        pj[hasil].tampil();
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
            }
        } while (pilih != 0);
    }

    static int hitungMahasiswaDenda(Peminjaman17[] arr) {
        int count = 0;
        for (Peminjaman17 p : arr) {
            if (p.denda > 0) {
                count++;
            }
        }
        return count;
    }

    static void insertionSort(Peminjaman17[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman17 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void sortByNIM(Peminjaman17[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].mhs.nim.compareTo(arr[j + 1].mhs.nim) > 0) {
                    Peminjaman17 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(Peminjaman17[] arr, String nim) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid].mhs.nim.equals(nim)) {
                return mid;
            } else if (arr[mid].mhs.nim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}