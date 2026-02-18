import java.util.Scanner;

public class Tugas1Plat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array kode plat
        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        // Array nama kota (2D)
        String[] KOTA = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        System.out.print("Masukkan kode plat : ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                System.out.println("Kota : " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan!");
        }

        sc.close();
    }
}
