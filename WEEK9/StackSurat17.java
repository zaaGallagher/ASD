public class StackSurat17 {
    Surat17[] data;
    int top;

    public StackSurat17(int kapasitas) {
        data = new Surat17[kapasitas];
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat17 s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Tidak ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                data[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}