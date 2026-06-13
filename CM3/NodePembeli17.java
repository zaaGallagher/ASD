package CM3;

public class NodePembeli17 {
    public Pembeli17 data; 
    public NodePembeli17 prev;
    public NodePembeli17 next;
    // fungsi public untuk memberikan izin kepada semua class agar bisa mengakses 

    public NodePembeli17(Pembeli17 pembeli) {
        this.data = pembeli;
        this.prev = null;
        this.next = null;
    }
} 
