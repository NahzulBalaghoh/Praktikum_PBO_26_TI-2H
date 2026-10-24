package interfacelatihan;

public class mahasiswa {
    protected String nama;

    public mahasiswa (String nama){
        this.nama = nama;
    }

    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
