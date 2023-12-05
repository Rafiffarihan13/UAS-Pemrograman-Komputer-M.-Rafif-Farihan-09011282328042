import java.util.Scanner;

public class Faktorisasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        System.out.println("Faktorisasi dari " + bilangan + " adalah:");
        faktorisasi(bilangan);

        scanner.close();
    }

    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
