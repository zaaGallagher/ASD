package CM3;

public class RoyalDelishSystem17 {
    private NodePembeli17 headPembeli = null;
    private NodePembeli17 tailPembeli = null;
    private int counterAntrian = 1;

    private NodePesanan17 headPesanan = null;
    private NodePesanan17 tailPesanan = null;

    public void tambahAntrian(String nama, String noHp) {
        Pembeli17 dataBaru = new Pembeli17(counterAntrian, nama, noHp);
        NodePembeli17 nodeBaru = new NodePembeli17(dataBaru);

        if (headPembeli == null) {
            headPembeli = tailPembeli = nodeBaru;
        } else {
            tailPembeli.next = nodeBaru;
            nodeBaru.prev = tailPembeli;
            tailPembeli = nodeBaru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
        counterAntrian++;
    }

    public void cetakAntrian() {
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        
        if (headPembeli == null) {
            System.out.println("[Antrean Kosong]");
            return;
        }

        NodePembeli17 temp = headPembeli;
        while (temp != null) {
            System.out.printf("%-12d %-15s %-15s\n", temp.data.noAntrian, temp.data.namaPembeli, temp.data.noHp);
            temp = temp.next;
        }
    }

    public Pembeli17 hapusAntrianTerdepan() {
        if (headPembeli == null) {
            return null;
        }

        NodePembeli17 dipanggil = headPembeli;
        if (headPembeli == tailPembeli) {
            headPembeli = tailPembeli = null;
        } else {
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }
        return dipanggil.data; 
    }

    public void tambahPesanan(int kode, String namaMenu, int harga) {
        Pesanan17 dataPesanan = new Pesanan17(kode, namaMenu, harga);
        NodePesanan17 nodeBaru = new NodePesanan17(dataPesanan);

        if (headPesanan == null) {
            headPesanan = tailPesanan = nodeBaru;
        } else {
            tailPesanan.next = nodeBaru;
            nodeBaru.prev = tailPesanan;
            tailPesanan = nodeBaru;
        }
    }

    public void cetakLaporanPesanan() {
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        if (headPesanan == null) {
            System.out.println("[Belum ada pesanan masuk]");
            return;
        }

        sortingPesananManual();

        // total pendapatan
        NodePesanan17 temp = headPesanan;
        int totalPendapatan = 0;
        while (temp != null) {
            System.out.printf("%-15d %-20s %-15d\n", temp.data.kodePesanan, temp.data.namaPesanan, temp.data.harga);
            totalPendapatan += temp.data.harga;
            temp = temp.next;
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
    } 

  
    private void sortingPesananManual() {
        if (headPesanan == null || headPesanan.next == null) return;

        boolean swapped; 
        do {
            swapped = false; 
            NodePesanan17 current = headPesanan; 

            while (current.next != null) {
                
                if (current.data.harga > current.next.data.harga) {
                    
                    Pesanan17 tempData = current.data; 
                    current.data = current.next.data; 
                    current.next.data = tempData;    

                    swapped = true; 
                }
                
                current = current.next; 
            }
        } while (swapped); 
    }
}
