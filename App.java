import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = scanner.nextInt();

        double diskon = hitungDiskon(hargaBarang, jumlahPembelian);
        double totalHargaSetelahDiskon = hargaBarang - diskon;

        System.out.println("Diskon yang diberikan: " + formatRupiah(diskon));
        System.out.println("Total harga setelah diskon: " + formatRupiah(totalHargaSetelahDiskon));

        scanner.close();
    }

    private static double hitungDiskon(double hargaBarang, int jumlahPembelian) {
        double diskon = 0.0;

        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = hargaBarang * 0.05; // Diskon 5%
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = hargaBarang * 0.1; // Diskon 10%
        } else if (jumlahPembelian > 20) {
            diskon = hargaBarang * 0.2; // Diskon 20%
        }

        return diskon * jumlahPembelian;
    }

    private static String formatRupiah(double amount) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setCurrencySymbol("Rp ");

        DecimalFormat df = new DecimalFormat("#,###", symbols);

        // Format uang tanpa desimal
        return df.format(amount);
    }
}