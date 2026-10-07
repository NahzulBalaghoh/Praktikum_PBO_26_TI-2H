package P6.Prcbn5;

public class staffHarian extends staff{
    public int jmlJamKerja;
    
    public staffHarian(){
        
    }
    public staffHarian(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan,int jmlJamKerja){
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    public void tampilStaffHarian(){
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja ="+jmlJamKerja);
        System.out.println("Gaji Bersih      ="+(gaji*jmlJamKerja+lembur-potongan));
    }
}
