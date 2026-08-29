package P1;

public class Jendela {
    private String jenisKaca;
    private int jmlDaun;

    public void setJenisKaca(String jenisKaca){
        this.jenisKaca = jenisKaca;
    }

    public void setJmlDaun(int jmlDaun){
        this.jmlDaun = jmlDaun;
    }

    public void cetakInformasi(){
        System.out.println("Jenis Kaca : " + jenisKaca);
        System.out.println("Jumlah Daun : " + jmlDaun);
    }
}
