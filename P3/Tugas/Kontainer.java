package P3.Tugas;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMax;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMax){
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMax = kapasitasMax;
    }

    public String getNomorResi(){
        return nomorResi;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }

    public double getKapasitasMax(){
        return kapasitasMax;
    }

    public  double getBeratMuatan (){
        return beratMuatanSaatIni;
    }

    public void setBeratMuatan(double beratMuatanSaatIni){
        this.beratMuatanSaatIni = beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat){
        if (beratMuatanSaatIni + berat <= kapasitasMax) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer");
        }
    }

    public void turunkanMuatan(double berat){
        if (berat <= beratMuatanSaatIni) {
            beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Berat yang dibongkar melebihi muatan saat ini");
        }
    }
}
