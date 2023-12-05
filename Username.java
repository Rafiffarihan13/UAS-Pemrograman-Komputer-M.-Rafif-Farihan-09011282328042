import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        // Tentukan username dan password yang valid
        String usernameValid = "Rafif";
        String passwordValid = "Bosan";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa autentikasi
        if (autentikasi(usernameInput, passwordInput, usernameValid, passwordValid)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        // Menutup objek Scanner setelah digunakan
        scanner.close();
    }

    // Metode untuk memeriksa autentikasi
    private static boolean autentikasi(String inputUsername, String inputPassword, String validUsername, String validPassword) {
        return inputUsername.equals(validUsername) && inputPassword.equals(validPassword);
    }
}
