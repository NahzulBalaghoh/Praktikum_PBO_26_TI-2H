package P7;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total sudut (1 sudut)  : " + s.totalSudut(60));
        System.out.println("Total sudut (2 sudut)  : " + s.totalSudut(60, 60));
        System.out.println("Keliling (3 sisi)      : " + s.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi)      : " + s.keliling(3, 4));
    }
}
