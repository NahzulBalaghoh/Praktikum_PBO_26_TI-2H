package P1;

public class Layar {
    private String merk;
    private double ukInci;
    private int levelKecerahan;

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setUkInci(double ukInci){
        this.ukInci = ukInci;
    }

    public void aturLevelKecerahan(int level){
        if (level < 1 || level > 5) {
            System.out.println("Level kecerahan tidak valid, harus antara 1 dan 5");
        } else {
            levelKecerahan = level;
        }
    }

    public void cetakInfo(){
        System.out.println("Merek : " + merk);
        System.out.println("Ukuran Inci : " + ukInci);
        System.out.println("Level Kecerahan : " + levelKecerahan + " (" + (levelKecerahan*20) + "%)");
    }
}
