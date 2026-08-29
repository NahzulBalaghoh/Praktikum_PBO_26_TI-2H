package P1;

public class LayarInteraktif extends Proyektor{
    private String jenisSensorSentuh;

    public void setJenisSensorSentuh(String jenisSensorSentuh){
        this.jenisSensorSentuh = jenisSensorSentuh;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Sensor Sentuh : " + jenisSensorSentuh);
        System.out.println("Tipe : Layar Interaktif (Touch)");
    }
}
