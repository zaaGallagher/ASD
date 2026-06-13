package LastJS;

public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray17() {
        this.dataMahasiswa = new Mahasiswa17[100];
        this.idxLast = -1; // -1 berarti tree masih kosong
    }

    void populateData(Mahasiswa17 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa17 mahasiswa) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Array tree sudah penuh!");
            return;
        }

        if (idxLast == -1) {
            // Tree masih kosong → langsung jadi root di indeks 0
            dataMahasiswa[0] = mahasiswa;
            idxLast = 0;
        } else {
            // Cari posisi yang tepat mulai dari root (indeks 0)
            addHelper(mahasiswa, 0);
        }
    }

    private void addHelper(Mahasiswa17 mahasiswa, int idxCurrent) {
        // Jaga batas array
        if (idxCurrent >= dataMahasiswa.length) {
            System.out.println("Array penuh, tidak bisa menambah node!");
            return;
        }

        if (dataMahasiswa[idxCurrent] == null) {
            // Posisi kosong → letakkan node baru di sini
            dataMahasiswa[idxCurrent] = mahasiswa;

            // Update idxLast jika indeks ini lebih besar
            if (idxCurrent > idxLast) {
                idxLast = idxCurrent;
            }

        } else if (mahasiswa.ipk < dataMahasiswa[idxCurrent].ipk) {
            // IPK lebih kecil → ke anak KIRI: 2*i+1
            addHelper(mahasiswa, 2 * idxCurrent + 1);

        } else if (mahasiswa.ipk > dataMahasiswa[idxCurrent].ipk) {
            // IPK lebih besar → ke anak KANAN: 2*i+2
            addHelper(mahasiswa, 2 * idxCurrent + 2);

        } else {
            // IPK sama → duplikat, tidak ditambahkan
            System.out.println("IPK " + mahasiswa.ipk + " sudah ada, data tidak ditambahkan.");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);          // Kiri
                dataMahasiswa[idxStart].tampilInformasi();  // Root
                traverseInOrder(2 * idxStart + 2);          // Kanan
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();  // Root  (pertama)
                traversePreOrder(2 * idxStart + 1);         // Kiri  (kedua)
                traversePreOrder(2 * idxStart + 2);         // Kanan (ketiga)
            }
        }
    }

    void tampilArray() {
        System.out.println("=== Isi Array (indeks 0 s/d " + idxLast + ") ===");
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null) {
                System.out.print("  [" + i + "] ");
                dataMahasiswa[i].tampilInformasi();
            } else {
                System.out.println("  [" + i + "] null");
            }
        }
    }
}