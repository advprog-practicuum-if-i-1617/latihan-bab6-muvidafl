
public class SoftwareEngineer extends Karyawan{
    
    public SoftwareEngineer(int masaKerja) {
        super(masaKerja);
        super.getBonus();
    }

    @Override
    public double getTotal() {
        return super.getTotal()+300000.0+5500000.0; //To change body of generated methods, choose Tools | Templates.
    }
}
