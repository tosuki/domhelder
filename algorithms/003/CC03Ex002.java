//Calcular a média aritmetica de valores

import java.util.ArrayList;
import java.util.Scanner;

public class CC03Ex002 {
    private static long getNumericValue(Scanner scanner, String message) {
        System.out.print(message);
        
        try {
            String value = scanner.nextLine();

            return Long.parseLong(value);
        } catch (NumberFormatException exception) {
            System.out.println("O valor que você inseriu é invalido, eu preciso de um número!");
            return getNumericValue(scanner, message);
        }
    }

    private static boolean getBooleanInput(Scanner scanner, String message) {
        System.out.println(message);
        String answer = scanner.nextLine();

        switch (answer.toLowerCase()) {
            case "y", "yes", "sim", "s":
                return true;
            default:
                return false;
        }
    }

    private static ArrayList<Long> fillNumericInputs(Scanner scanner, ArrayList<Long> list) {
        long value = getNumericValue(scanner, "Digite um número: ");
        
        list.add(value);

        if (getBooleanInput(scanner, "Você quer adicionar mais um número?")) {
            return fillNumericInputs(scanner, list);
        }

        return list;
    }

    private static ArrayList<Long> getAllValues(Scanner scanner) {
        ArrayList<Long> list = new ArrayList<>();

        return fillNumericInputs(scanner, list);
    }

    public static long getAverage(ArrayList<Long> values) {
        long accumulator = 0;

        for (long value : values) {
            accumulator += value;
        }

        return accumulator/values.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Long> values = getAllValues(scanner);

        System.out.printf("A média aritmetica dos valores é %d\n", getAverage(values));

        scanner.close();
    }
}
