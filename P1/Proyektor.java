package P1;

public class Proyektor extends Layar {
    private double jarakProyektor;

    public void setJarak(double jarak){
        jarakProyektor = jarak;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jarak Proyeksi : " + jarakProyektor + "m");
        System.out.println("Tipe : LCD Proyektor");
    }
}

