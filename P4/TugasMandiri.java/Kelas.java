public class Kelas {
    private String matkul;
    private Papan papan;
    private Mahasiswa[] daftarMahasiswa;
    private int jumlahMahasiswa;

    public Kelas(String matkul, int kapasitasMax) {
        this.matkul = matkul;
        this.papan = new Papan(); // COMPOSITION: Papan dibuat sendiri di dalam Kelas
        this.daftarMahasiswa = new Mahasiswa[kapasitasMax];
        this.jumlahMahasiswa = 0;
    }

    // AGGREGATION: Mahasiswa dibuat di luar, hanya didaftarkan lewat method ini
    public void daftarkan(Mahasiswa mhs) {
        daftarMahasiswa[jumlahMahasiswa] = mhs;
        jumlahMahasiswa++;
    }

    // DEPENDENCY: Ruangan hanya dipinjam sesaat lewat parameter, tidak disimpan
    public void mulaiKelas(Ruangan ruangan) {
        if (jumlahMahasiswa > ruangan.getKapasitas()) {
            System.out.println("Ruangan " + ruangan.getKode() + " tidak cukup!");
            return;
        }
        papan.tulis("Materi " + matkul);
        System.out.println("Kelas " + matkul + " dimulai di ruangan " + ruangan.getKode());
    }

    public void info() {
        System.out.println("Kelas: " + matkul + " (" + jumlahMahasiswa + " mahasiswa)");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("- " + daftarMahasiswa[i].getNama());
        }
    }
}