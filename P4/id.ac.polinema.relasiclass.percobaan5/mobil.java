public class mobil {
    private String merek;
    private Mesin mesin;

    public mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo () {
        System.out.println("Merek: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}
