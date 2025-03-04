import java.util.Scanner;

public class CC04Ex003 {
     private static String getAnswer(Scanner scanner, String message) {
        System.out.printf(message);
        return scanner.nextLine();
    }

    private static double getNumericValue(Scanner scanner, String message) {
        try {
            String value = getAnswer(scanner, message);

            return Double.parseDouble(value);
        } catch (NumberFormatException exception) {
            System.out.println("O valor que você inseriu é invalido, eu preciso de um número!");
            return getNumericValue(scanner, message);
        }
    }
   
    private static String buildSeparator(int size, String c) {
        String str = "";

        for (int i = 0; i < size; i++) {
            str += c;
        }

        return str;
    }

    private static void drawLine(int size) {
        String separator = buildSeparator(size, "-");

        System.out.println(separator);
    }

    private static void drawSeparator(int size) {
        String separator = buildSeparator(size, ".");

        System.err.print(separator);
    }

    public static void showRow(String title, String value) {
        System.out.print(title + " ");
        drawSeparator(32);
        System.out.print(" " + value + "\n");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        drawLine(32);
        showRow("hello", "a");
        drawLine(32);

        scanner.close();
    }
}
