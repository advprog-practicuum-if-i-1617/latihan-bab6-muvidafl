
import java.util.Scanner;

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Karyawan\n2. Software Engineer\n3. Project Manager\nPilihan anda: ");
        int pilih = in.nextInt();
        System.out.print("Masukan masa kerja: ");
        int masakerja = in.nextInt();
        switch (pilih) {
            case 1 :
                Karyawan k = new Karyawan(masakerja);
                k.getBonus();
                System.out.println("Total Gaji: "+k.getTotal());
                break;
            case 2 :
                SoftwareEngineer se = new SoftwareEngineer(masakerja);
                System.out.println("Total Gaji: " +se.getTotal());
                break;
            case 3 :
                ProjectManager pm = new ProjectManager(masakerja);
                pm.getBonusAp(masakerja);
                System.out.println("Total Gaji: " + pm.getTotal());
                break;
        }
    }
    
}
