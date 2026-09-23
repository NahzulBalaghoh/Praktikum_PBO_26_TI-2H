public class MainTugasMandiri {
    public static void main(String[] args) {
        Kelas kelas = new Kelas("PBO", 30);

        Mahasiswa m1 = new Mahasiswa("2541070201", "Nana");
        Mahasiswa m2 = new Mahasiswa("2541070202", "Budi");
        kelas.daftarkan(m1);
        kelas.daftarkan(m2);
        kelas.info();

        Ruangan ruangan = new Ruangan("R301", 40);
        kelas.mulaiKelas(ruangan);
    }
}