package P6.Prcbn5;

public class staff extends karyawan{
    public  int lembur, potongan;

    public  staff(){

    }

    public staff (String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur: " + lembur);
        System.out.println("Potongan : " + potongan);
        System.out.println("total Gaji : " + (gaji+lembur-potongan));
    }
}
