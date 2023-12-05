import java.util.Scanner;

public class UserAccount {
    private String username;
    private String password;
    private boolean isActive;

    // Konstruktor
    public UserAccount(String username, String password, boolean isActive) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    // Metode untuk mengaktifkan akun
    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    // Metode untuk menonaktifkan akun
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    // Metode untuk menampilkan informasi akun
    public void displayAccountInfo() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status Aktif: " + (isActive ? "Aktif" : "Nonaktif"));
    }

    public static void main(String[] args) {
        // Contoh penggunaan dengan Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        System.out.print("Apakah akun aktif? (true/false): ");
        boolean isActiveInput = scanner.nextBoolean();

        // Membuat objek UserAccount
        UserAccount userAccount = new UserAccount(usernameInput, passwordInput, isActiveInput);

        // Menampilkan informasi awal akun
        userAccount.displayAccountInfo();

        // Interaksi untuk mengaktifkan atau menonaktifkan akun
        System.out.print("Aktifkan atau nonaktifkan akun? (1: Aktifkan, 2: Nonaktifkan): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                userAccount.activateAccount();
                break;
            case 2:
                userAccount.deactivateAccount();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        // Menampilkan informasi akun setelah perubahan
        userAccount.displayAccountInfo();

        // Menutup Scanner
        scanner.close();
    }
}
