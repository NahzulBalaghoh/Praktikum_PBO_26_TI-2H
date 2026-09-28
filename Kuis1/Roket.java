public class Roket {
    private String Tipe;
    private int Power;

    public Roket(String Tipe, int Power) {
        this.Tipe = Tipe;
        this.Power = Power;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public int getPower() {
        return Power;
    }
}
