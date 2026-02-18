import java.util.Scanner;

public class IPSemesterTabel {

    public static String huruf(double n) {
        if (n > 80) return "A";
        else if (n > 73) return "B+";
        else if (n > 65) return "B";
        else if (n > 60) return "C+";
        else if (n > 50) return "C";
        else if (n > 39) return "D";
        else return "E";
    }

    public static double bobot(String h) {
        switch (h) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 1, 2};

        double[] nilai = new double[mk.length];
        String[] huruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilai[i] = sc.nextDouble();

            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("nilai tidak valid!");
                return;
            }

            huruf[i] = huruf(nilai[i]);
            bobot[i] = bobot(huruf[i]);
        }

        System.out.println("\n================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("================================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double total = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilai[i], huruf[i], bobot[i]);

            total += bobot[i] * sks[i];
            totalSKS += sks[i];
        }

        double ips = total / totalSKS;

        System.out.println("================================");
        System.out.printf("IP : %.2f\n", ips);

        sc.close();
    }
}
