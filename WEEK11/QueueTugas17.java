
public class QueueTugas17 {
    NodeTugas17 front;
    NodeTugas17 rear;
    int size;
    int max;

    public QueueTugas17(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    // cek kosong
    public boolean isEmpty() {
        return front == null;
    }

    // cek penuh
    public boolean isFull() {
        return size == max;
    }

    // tambah antrian
    public void enqueue(MahasiswaTugas17 mhs) {

        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        NodeTugas17 baru = new NodeTugas17(mhs, null);

        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }

        size++;

        System.out.println("Mahasiswa berhasil masuk antrian");
    }

    // panggil antrian
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");
        front.data.tampilData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    // tampil semua antrian
    public void tampilAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        NodeTugas17 temp = front;

        System.out.println("\nDaftar Antrian Mahasiswa:");

        while (temp != null) {
            temp.data.tampilData();
            System.out.println("---------------------");
            temp = temp.next;
        }
    }

    // tampil depan
    public void peekFront() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Antrian Terdepan:");
        front.data.tampilData();
    }

    // tampil belakang
    public void peekRear() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Antrian Paling Akhir:");
        rear.data.tampilData();
    }

    // jumlah antrian
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }

    // kosongkan antrian
    public void clear() {
        front = rear = null;
        size = 0;

        System.out.println("Antrian berhasil dikosongkan");
    }
}