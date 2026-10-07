package P6.Prcbn5;

public class inheritance1 {

    public static void main(String[] args) {
        manager m = new manager();
        m.nama="Vivin";
        m.alamat="JL. vinolia";
        m.umur=25;
        m.jk="Perempuan";
        m.gaji=3000000;
        m.tunjangan=1000000;
        m.tampilDataManager();
        
        staff S = new staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();

        staffTetap ST= new staffTetap("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();
        
        staffHarian SH = new staffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }    
}