import java.util.Scanner;

public class TabunganKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input gaji dan pengeluaran Mr. John
        System.out.print("Masukkan gaji Mr. John minggu ini: ");
        double gajiTotal = input.nextDouble();
        
        System.out.print("Masukkan pengeluaran Mr. John minggu ini: ");
        double pengeluaran = input.nextDouble();
        
        // Menentukan apakah bisa menabung
        if (gajiTotal > pengeluaran) {
            double tabungan = gajiTotal - pengeluaran;
            System.out.println("Bisa menabung. Tabungan minggu ini: Rp " + tabungan);
        } else if (gajiTotal == pengeluaran) {
            System.out.println("Tidak bisa menabung.");
        } else {
            System.out.println("Cari tambahan.");
        }
        
        input.close();
    }
}
