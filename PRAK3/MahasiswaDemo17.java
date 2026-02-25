package PRAK3;
import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa17[] arrayOfMahasiswa17 = new Mahasiswa17[3];
        String dummy;

        for(int i=0; i < 3; i++) {
        arrayOfMahasiswa17[i] = new Mahasiswa17();

        System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1) );
        System.out.print("NIM    : ");
        arrayOfMahasiswa17[i].nim = sc.nextLine();
        System.out.print("Nama   : ");
        arrayOfMahasiswa17[i].nama = sc.nextLine();
        System.out.print("Kelas  : ");
        arrayOfMahasiswa17[i].kelas = sc.nextLine();
        System.out.print("IPK    : ");
        dummy = sc.nextLine();
        arrayOfMahasiswa17[i].ipk = Float.parseFloat(dummy);
        System.out.println("----------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa17[i].cetakInfo();
        }
    }
}