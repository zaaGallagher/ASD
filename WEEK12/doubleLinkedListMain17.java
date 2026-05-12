package WEEK12;

import java.util.Scanner;

public class doubleLinkedListMain17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        doubleLinkedList17 list = new doubleLinkedList17();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah (Awal)");
            System.out.println("2. Tambah (Akhir)");
            System.out.println("3. Tambah (Indeks)");
            System.out.println("4. Sisip Setelah NIM");
            System.out.println("5. Hapus (Awal)");
            System.out.println("6. Hapus (Akhir)");
            System.out.println("7. Hapus (Indeks)");
            System.out.println("8. Hapus Setelah NIM");
            System.out.println("9. Tampilkan Semua");
            System.out.println("10. Tampilkan Terbalik");
            System.out.println("11. Cari (First, Last, Index)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1: 
                    list.addFirst(inputMahasiswa(scan)); 
                    break;
                case 2: 
                    list.addLast(inputMahasiswa(scan)); 
                    break;
                case 3:
                    System.out.print("Masukkan Indeks: ");
                    int idx = scan.nextInt(); 
                    scan.nextLine();
                    list.add(idx, inputMahasiswa(scan)); 
                    break;
                case 4:
                    System.out.print("Masukkan NIM referensi: ");
                    String key = scan.nextLine();
                    list.insertAfter(key, inputMahasiswa(scan)); 
                    break;
                case 5: 
                    list.removeFirst(); 
                    break;
                case 6: 
                    list.removeLast(); 
                    break;
                case 7:
                    System.out.print("Masukkan Indeks yang akan dihapus: ");
                    int idxHapus = scan.nextInt();
                    list.remove(idxHapus); 
                    break;
                case 8:
                    System.out.print("Hapus data setelah NIM: ");
                    String keyHapus = scan.nextLine();
                    list.removeAfter(keyHapus); 
                    break;
                case 9: 
                    list.print(); 
                    break;
                case 10: 
                    list.printReverse(); 
                    break;
                case 11:
                    System.out.println("Pilih: 1.Terdepan | 2.Terakhir | 3.Berdasarkan Indeks");
                    int sub = scan.nextInt();
                    if(sub == 1) list.getFirst();
                    else if(sub == 2) list.getLast();
                    else if(sub == 3) {
                        System.out.print("Masukkan Indeks: ");
                        list.getIndex(scan.nextInt());
                    }
                    break;
                case 0: 
                    System.out.println("Program Selesai."); 
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilihan != 0);
        
        scan.close();
    }

    // Method ini HARUS di dalam class DoubleLinkedListMain17
    public static mahasiswa17 inputMahasiswa(Scanner scan) {
        System.out.println("--- Input Data Mahasiswa ---");
        System.out.print("NIM   : "); 
        String nim = scan.nextLine();
        System.out.print("Nama  : "); 
        String nama = scan.nextLine();
        System.out.print("Kelas : "); 
        String kelas = scan.nextLine();
        System.out.print("IPK   : "); 
        double ipk = scan.nextDouble();
        scan.nextLine(); // Membersihkan sisa enter setelah input double
        return new mahasiswa17(nim, nama, kelas, ipk);
    }
}