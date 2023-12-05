import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n untuk menampilkan deret Fibonacci hingga suku ke-n: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Menutup Scanner setelah digunakan
        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
