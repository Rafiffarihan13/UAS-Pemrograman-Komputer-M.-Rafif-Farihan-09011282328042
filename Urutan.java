import java.util.Scanner;
import java.util.Stack;

public class Urutan {

    // Metode untuk memeriksa urutan kurung
    static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        // Iterasi melalui setiap karakter dalam ekspresi
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // Jika karakter adalah kurung buka, dorong ke dalam stack
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            // Jika karakter adalah kurung tutup
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                // Jika stack kosong, urutan kurung salah
                if (stack.isEmpty()) {
                    return false;
                }

                // Ambil karakter teratas dari stack
                char top = stack.pop();

                // Periksa apakah pasangan kurung sesuai
                if ((currentChar == ')' && top != '(') ||
                        (currentChar == ']' && top != '[') ||
                        (currentChar == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // Jika stack tidak kosong, urutan kurung salah
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan ekspresi matematika: ");
        String expression = scanner.nextLine();

        if (checkBrackets(expression)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        scanner.close();
    }
}
