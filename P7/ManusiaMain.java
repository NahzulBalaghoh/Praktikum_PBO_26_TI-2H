package P7;

public class ManusiaMain {
    public static void main(String[] args) {
        Manusia m;

        m = new Dosen();
        m.bernafas();
        m.makan();

        m = new Mahasiswa();
        m.bernafas();
        m.makan();

        Dosen d = new Dosen();
        d.lembur();

        Mahasiswa mhs = new Mahasiswa();
        mhs.tidur();
    }
}
