public class Ruangan {
    private String kode;
    private int kapasitas;

    public Ruangan(String kode, int kapasitas) {
        this.kode = kode;
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() { return kapasitas; }
    public String getKode() { return kode; }
}