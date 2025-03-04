import java.util.Scanner;

public class CC03Ex003 {
    private static double getNumericValue(Scanner scanner, String message) {
        System.out.print(message);
        
        try {
            String value = scanner.nextLine();

            return Double.parseDouble(value.replace(",", "."));
        } catch (NumberFormatException exception) {
            System.out.println("O valor que você inseriu é invalido, eu preciso de um número!");
            return getNumericValue(scanner, message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstSide = getNumericValue(scanner, "Qual o valor do primeiro cateto? ");
        double secondSide = getNumericValue(scanner, "Qual o valor do segundo cateto? ");

        System.out.println("O valor da hipotenusa é " + Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2)));
        scanner.close();
    }    
}
