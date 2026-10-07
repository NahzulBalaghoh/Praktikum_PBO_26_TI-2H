package P6.Prcbn5;

public class manager extends karyawan{

    public  int tunjangan;
    
    public  manager(){

    }

    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjanga : " + tunjangan);
        System.out.println("Total Gaji : " + (super.gaji + tunjangan));
    }
}