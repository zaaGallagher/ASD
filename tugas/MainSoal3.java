package tugas;

import java.util.Scanner;

public class MainSoal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal: ");
        int kapasitas = sc.nextInt();
        
        Queue17 antrianBuku = new Queue17(kapasitas);
        
        System.out.println("Apakah antrian penuh? " + antrianBuku.isFull());
        
        antrianBuku.enqueue(101);
        
        antrianBuku.peek();
    }
}