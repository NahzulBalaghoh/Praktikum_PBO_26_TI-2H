package P3.Tugas;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMax() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 6.0000 kg...");
        kontainerAlfa.tambahMuatan(60000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        kontainerAlfa.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        kontainerAlfa.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");

        System.out.print("\nMemasukkan muatan baru seberat: ");
        double muatan = nahzul.nextDouble();
        kontainerAlfa.tambahMuatan(muatan);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");

        System.out.print("\nMembongkar muat/menurunkan barang seberat: ");
        double turun = nahzul.nextDouble();
        kontainerAlfa.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatan() + " kg");
    
        nahzul.close();
    }
}
