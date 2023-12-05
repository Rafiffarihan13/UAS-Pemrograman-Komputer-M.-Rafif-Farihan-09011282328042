import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek apakah input adalah palindrom
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengecek apakah suatu string adalah palindrom
    private static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah semua huruf menjadi huruf kecil
        str = str.replaceAll("\\s", "").toLowerCase();

        // Inisialisasi indeks awal dan akhir
        int start = 0;
        int end = str.length() - 1;

        // Melakukan pengecekan palindrom menggunakan loop
        while (start < end) {
            // Jika karakter tidak sama, bukan palindrom
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            // Pindah ke karakter berikutnya
            start++;
            end--;
        }

        // Jika semua karakter cocok, itu adalah palindrom
        return true;
    }
}
