import java.util.Scanner;

public class CC04Ex001 {
    private static String getAnswer(Scanner scanner, String message) {
        System.out.printf(message);
        return scanner.nextLine();
    }

    private static long getNumericValue(Scanner scanner, String message) {
        try {
            String value = getAnswer(scanner, message);

            return Long.parseLong(value);
        } catch (NumberFormatException exception) {
            System.out.println("O valor que você inseriu é invalido, eu preciso de um número!");
            return getNumericValue(scanner, message);
        }
    }

    private static void showOverview(String firstName, String secondName, String surname, long age) {
        System.out.printf("%s, %s, %s\nIdade: %d anos\n", surname, firstName, secondName, age);
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String firstName = getAnswer(scanner, "Qual é o seu primeiro nome? ");
        String secondName = getAnswer(scanner, "Qual é o seu segundo nome? ");
        String surname = getAnswer(scanner, "Qual é o seu sobrenome? ");

        long age = getNumericValue(scanner, "Qual a sua idade?");

        scanner.close();

        showOverview(firstName, secondName, surname, age);
    }    
}
