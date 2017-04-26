
public class ProjectManager extends Karyawan{
    private double bonusAp;
    
    public ProjectManager(int masaKerja) {
        super(masaKerja);
        super.getBonus();
    }
    public double getBonusAp(int masaKerja) {
        if (masaKerja >=10) {
            return this.bonusAp = 700000.0;
        } else{
            return this.bonusAp = 0;
        }
    }

    @Override
    public double getTotal() {
        return super.getTotal()+6000000.0+450000.0+this.bonusAp; //To change body of generated methods, choose Tools | Templates.
    }
}
