package P2;

public class Barangg {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampildata(){
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + (diskon * 100) + "%");
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
