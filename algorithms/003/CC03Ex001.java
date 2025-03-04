import java.util.Scanner;

public class CC03Ex001 {
    public static long getNumericInput(Scanner scanner, String message) {
        System.out.println(message);

        long value = scanner.nextLong();

        if (value < 1) {
            System.out.println("O número precisa ser maior que 0!");

            return getNumericInput(scanner, message);
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        getNumericInput(scanner, "Digite um número: ");

        scanner.close();
    }
}
