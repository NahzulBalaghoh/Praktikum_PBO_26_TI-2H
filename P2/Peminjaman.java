package P2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public void tampilData(){
        double totalBayar = harga* lamaSewa;
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Harga Sewa : " + harga + "/Hari");
        System.out.println("Lama Sewa : " + lamaSewa + " hari");
        System.out.println("Total Bayar : " + totalBayar);
    }
}
