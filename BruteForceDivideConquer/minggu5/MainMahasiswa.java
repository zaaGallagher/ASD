package BruteForceDivideConquer.minggu5;

public class MainMahasiswa {
    public static int cariMaxUTS(Mahasiswa17[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        int lMax = cariMaxUTS(arr, l, mid);
        int rMax = cariMaxUTS(arr, mid + 1, r);
        return (lMax > rMax) ? lMax : rMax;
    }

    public static int cariMinUTS(Mahasiswa17[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        int lMin = cariMinUTS(arr, l, mid);
        int rMin = cariMinUTS(arr, mid + 1, r);
        return (lMin < rMin) ? lMin : rMin;
    }

    public static double hitungRataUAS(Mahasiswa17[] arr) {
        int total = 0;
        for (Mahasiswa17 m : arr) {
            total += m.nilaiUas;
        }
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        Mahasiswa17[] mhs = {
                new Mahasiswa17("Ahmad", "220101001", 2022, 78, 82),
                new Mahasiswa17("Budi", "220101002", 2022, 85, 88),
                new Mahasiswa17("Cindy", "220101003", 2021, 90, 87),
                new Mahasiswa17("Dian", "220101004", 2021, 76, 79),
                new Mahasiswa17("Eko", "220101005", 2023, 92, 95),
                new Mahasiswa17("Fajar", "220101006", 2020, 88, 85),
                new Mahasiswa17("Gina", "220101007", 2023, 80, 83),
                new Mahasiswa17("Hadi", "220101008", 2020, 82, 84)
        };
        System.out.println("=== Hasil Analisis Data Mahasiswa ===");
        System.out.println("Nilai UTS Tertinggi: " + cariMaxUTS(mhs, 0, mhs.length - 1));
        System.out.println("Nilai UTS Terendah: " + cariMinUTS(mhs, 0, mhs.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + hitungRataUAS(mhs));
    }
}
