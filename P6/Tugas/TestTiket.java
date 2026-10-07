package P6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        TiketKereta kereta = new TiketKereta("KA-001", "Andi", "Malang", "Jakarta",
                350000, 3, "12A");
        kereta.tampilKereta();

        TiketDomestik domestik = new TiketDomestik();
        domestik.kodeTiket = "GA-102";
        domestik.namaPenumpang = "Sinta";
        domestik.asal = "Surabaya";
        domestik.tujuan = "Denpasar";
        domestik.setHargaDasar(900000);
        domestik.maskapai = "Garuda Indonesia";
        domestik.beratBagasi = 25;
        domestik.pajakBandara = 75000;
        domestik.tampilDomestik();

        TiketInternasional inter = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura",
                2500000, "Singapore Airlines", 20, "C1234567", 150000);
        inter.tampilInternasional();
    }
}
