package PRAK3;
import java.util.Scanner;
public class MataKuliahDemo17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahElement = Integer.parseInt(sc.nextLine());

    MataKuliah17[] arrayOfMatakuliah = new MataKuliah17[jumlahElement];

    for (int i = 0; i < jumlahElement; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah17(); 
            arrayOfMatakuliah[i].tambahData(sc);  
        }

    System.out.println("\n--- Data Matakuliah Yang Telah Diinput ---");
        for (int i = 0; i < jumlahElement; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
}
}
}

