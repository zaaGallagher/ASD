package P1Jobsheet10;

public class AntriLayanan17 {
    Mahasiswa17[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntriLayanan17(int max) {
        this.max = max;
        this.data = new Mahasiswa17[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // Bagian dari class AntriLayanan17
    public void lihatTerdepan() {
        if (IsEmpty()) { // Perbaikan logika: jika kosong, tampilkan pesan
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa Terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void LihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa Paling Belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData(); // Mengambil data di posisi rear
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.println((i + 1) + "");
            data[index].tampilkanData();
        }

    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void TambahAntrian(Mahasiswa17 mhs) {
        if (IsFull()) {
            System.out.println("Antrian Penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + "berhasil masuk ke antrian");
    }

    public Mahasiswa17 layaniMahasiswa17() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa17 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;

    }

    public int getJumlahAntrian() {
        return size;
    }
}
