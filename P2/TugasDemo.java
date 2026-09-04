package P2;

public class TugasDemo {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = "101";
        p1.namaMember = "Lulu";
        p1.namaGame = "GTA";
        p1.harga = 15000;
        p1.lamaSewa = 3;
        p1.tampilData();
        System.out.println();

        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 12;
        System.out.println("Luas Lingkaran: " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran: " + l1.hitungKeliling());
        System.out.println();

        Barangg br1= new Barangg();
        br1.kode="111";
        br1.namaBarang="Keyboard";
        br1.hargaDasar=1000000;
        br1.diskon = 0.5f;
        br1.tampildata();

    }
}
