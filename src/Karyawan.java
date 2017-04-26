public class Karyawan {
    protected double gajiPokok;
    protected double bonus;
    protected int masaKerja;
    protected double total;
    
    public Karyawan(int masaKerja) {
        this.gajiPokok = 2500000.0;
        this.masaKerja = masaKerja;
    }
    public double getBonus() {
        if (this.masaKerja>=5) {
            return this.bonus = 250000;
        } else {
            return this.bonus = 0;
        }    
    }
    public double getTotal() {
        this.total = this.gajiPokok + this.bonus;
        return this.total;
    }
    
    
}
