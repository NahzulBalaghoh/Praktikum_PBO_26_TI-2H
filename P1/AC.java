package P1;

public class AC {
    private String merk;
    private String mode;

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setSuhu(String mode){
        this.mode = mode;
    }

    public void nyala(){
        System.out.println("AC menyala pada mode " + mode);
    }

    public void cetakInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Suhu : " + mode );
    }
}
