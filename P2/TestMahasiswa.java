package P2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim=102;
        mhs2.nama="Lala";
        mhs2.alamat="Jl. Dulu Aja No 2C";
        mhs2.kelas="2H";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim=103;
        mhs3.nama="Lili";
        mhs3.alamat="Jl. Buryam No 3";
        mhs3.kelas="3C";
        mhs1.tampilBiodata();
    }
}
