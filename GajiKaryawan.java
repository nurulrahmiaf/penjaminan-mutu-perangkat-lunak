import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jam kerja
        System.out.print("Masukkan jam kerja Mr. John minggu ini: ");
        int jamKerja = input.nextInt();
        
        // Deklarasi variabel
        double rate = 15000; // Tarif per jam
        double gajiTotal;
        double gajiNormal;
        double gajiLembur;
        
        // Menghitung gaji berdasarkan jam kerja
        if (jamKerja <= 40) {
            gajiTotal = jamKerja * rate;
        } else {
            gajiNormal = 40 * rate;
            gajiLembur = (jamKerja - 40) * 1.5 * rate;
            gajiTotal = gajiNormal + gajiLembur;
        }
        
        // Output gaji total
        System.out.println("Gaji Mr. John minggu ini: Rp " + gajiTotal);
        
        input.close();
    }
}
