public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket roketUtama;
    private Generator generatorUtama;

    public SpaceShuttle(String id, int brt, Roket rkt, Generator gnt) {
        this.kode = id;
        this.berat = brt;
        this.roketUtama = rkt;
        this.generatorUtama = gnt;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getBerat() {
        return berat;
    }

    public void setRoketUtama(Roket roketUtama) {
        this.roketUtama = roketUtama;
    }

    public Roket getRoketUtama() {
        return roketUtama;
    }

    public void setGeneratorUtama(Generator generatorUtama) {
        this.generatorUtama = generatorUtama;
    }

    public Generator getGeneratorUtama() {
        return generatorUtama;
    }

}
