package BruteForceDivideConquer.PRAK6;

public class dataDosen17 {
    Dosen17[] dataDosen17 = new Dosen17[10];
    int idx;

    void tambah(Dosen17 dsn) {
        if (idx < dataDosen17.length) {
            dataDosen17[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen17[i].tampilInformasi();
            System.out.println("-----------------------");
        }
    }
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen17[j].usia < dataDosen17[j - 1].usia) {
                    Dosen17 temp = dataDosen17[j];
                    dataDosen17[j] = dataDosen17[j - 1];
                    dataDosen17[j - 1] = temp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen17[j].usia < dataDosen17[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen17 temp = dataDosen17[maxIdx];
            dataDosen17[maxIdx] = dataDosen17[i];
            dataDosen17[i] = temp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen17 temp = dataDosen17[i];
            int j = i - 1;
            while (j >= 0 && dataDosen17[j].usia < temp.usia) {
                dataDosen17[j + 1] = dataDosen17[j];
                j--;
            }
            dataDosen17[j] = temp;
        }
    }
}
