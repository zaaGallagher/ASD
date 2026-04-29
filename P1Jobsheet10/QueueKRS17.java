package P1Jobsheet10;

public class QueueKRS17 {
    Mahasiswa17[] data;
    int front, rear, size, max;
    int totalProcessed = 0; 
    final int totalDPAQuota = 30; // Kapasitas total yang ditangani DPA

    public QueueKRS17(int n) {
        max = n;
        data = new Mahasiswa17[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa17 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh (Maksimal 10)!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil mendaftar ke antrian.");
        }
    }

    // Memanggil 2 mahasiswa sekaligus untuk proses KRS
    public void dequeueDuo() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            // Tentukan berapa yang bisa diproses (maksimal 2)
            int jumlahDiproses = (size >= 2) ? 2 : 1;
            
            System.out.println("--- Memproses KRS ---");
            for (int i = 0; i < jumlahDiproses; i++) {
                Mahasiswa17 m = data[front];
                System.out.println("Persetujuan KRS diberikan kepada: " + m.nama);
                front = (front + 1) % max;
                size--;
                totalProcessed++;
            }

            if (size == 0) {
                front = rear = -1;
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian Saat Ini:");
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println((count + 1) + ". " + data[i]);
                i = (i + 1) % max;
                count++;
            }
        }
    }

    public void peekTwo() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- 2 Antrian Terdepan ---");
            System.out.println("1. " + data[front]);
            if (size >= 2) {
                int next = (front + 1) % max;
                System.out.println("2. " + data[next]);
            } else {
                System.out.println("(Hanya ada 1 mahasiswa di antrian)");
            }
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Paling Akhir: " + data[rear]);
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Seluruh antrian telah dikosongkan.");
    }

    public void cetakStatistik() {
        int belumProses = totalDPAQuota - totalProcessed;
        System.out.println("--- Laporan Antrian KRS ---");
        System.out.println("Jumlah mahasiswa dalam antrian : " + size);
        System.out.println("Jumlah sudah diproses KRS      : " + totalProcessed);
        System.out.println("Jumlah mahasiswa belum proses  : " + belumProses);
    }
}