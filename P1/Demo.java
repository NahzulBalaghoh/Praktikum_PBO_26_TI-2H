package P1;

public class Demo {

    public static void main(String[] args) {
        Jendela jendela = new Jendela();
        AC ac = new AC();
        Layar layar = new Layar();
        Proyektor proyektor = new Proyektor();
        LayarInteraktif layarInteraktif = new LayarInteraktif();
        
        System.out.println("Jendela");
        jendela.setJenisKaca("Tempered Glass");
        jendela.setJmlDaun(6);
        jendela.cetakInformasi();
        System.out.println();
        
        System.out.println("AC");
        ac.setMerk("Panasonic");
        ac.setSuhu("16");
        ac.cetakInfo();
        System.out.println();
        
        System.out.println("Layar");
        layar.setMerk("Lenovo");
        layar.setUkInci(14);
        layar.aturLevelKecerahan(3);
        layar.cetakInfo();
        System.out.println();
        
        System.out.println("Proyektor");
        proyektor.setMerk("Epson");
        proyektor.setUkInci(0);
        proyektor.setJarak(3.0);
        proyektor.aturLevelKecerahan(4);
        proyektor.cetakInfo();
        System.out.println();
        
        System.out.println("Layar Interaktif");
        layarInteraktif.setMerk("BenQ");
        layarInteraktif.setUkInci(65);
        layarInteraktif.setJarak(2.5);
        layarInteraktif.setJenisSensorSentuh("Inframerah");
        layarInteraktif.aturLevelKecerahan(5);
        layarInteraktif.cetakInfo();
    }
}