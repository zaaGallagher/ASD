

public class Toko17 {
    String Kalung;
    String Gelang;
    String Anting;
    String Kategori;
    String Harga;
    String Terjual;
    String Stok;

    public Toko17 ( String Kalung, String Gelang, String Anting, String Kategori, String Harga, String Terjual, String Stok) {
        this.Kalung = Kalung;
        this.Gelang = Gelang;
        this.Anting = Anting;
        this.Kategori = Kategori;
        this.Harga = Harga;
        this.Terjual = Terjual;
        this.Stok = Stok;
    }
    
    public void tampilData(){
        System.out.println("=== Data AKsesoris ===");
        System.out.println("Kalung    : " + Kalung);
        System.out.println("Gelang    : " + Gelang);
        System.out.println("Anting    : " + Anting);
        System.out.println("Kategori  : " + Kategori);
        System.out.println("Harga     : " + Harga);
        System.out.println("Terjual   : " + Terjual);
        System.out.println("Stok      : " + Stok);
    }



    
}
