package tugas2;

class NodeSkor {
    int skor;
    NodeSkor next;

    NodeSkor(int skor) {
        this.skor = skor;
        this.next = null;
    }
}

public class CariSkorMaksimum {
    public static void main(String[] args) {
        // Daftar skor: 80 -> 95 -> 75
        NodeSkor head = new NodeSkor(80);
        head.next = new NodeSkor(95);
        head.next.next = new NodeSkor(75);

        // Inisialisasi skor maksimum dengan nilai head awal
        int skorMaksimum = head.skor;
        NodeSkor current = head;

        // Telusuri seluruh list
        while (current != null) {
            if (current.skor > skorMaksimum) {
                skorMaksimum = current.skor; // Update jika ketemu yang lebih besar
            }
            current = current.next;
        }

        System.out.println("Skor paling tinggi (Maksimum): " + skorMaksimum);
    }
}
