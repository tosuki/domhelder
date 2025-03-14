import java.util.Scanner;

public class CC05Ex10 {

    public static void showValues(int ...values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    //xxxxx
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        String rawValue = scanner.nextLine();

        if (rawValue.length() != 5) {
            System.out.println("Por favor, digite um número de 5 digitos!");
            return;
        }
    
        int parsedValue = Integer.parseInt(rawValue);   

        int n1, n2, n3, n4, n5;
        n1 = parsedValue / 10000;
        n2 = parsedValue / 1000 % 10;
        n3 = parsedValue / 100 % 10;
        n4 = parsedValue / 10 % 10;
        n5 = parsedValue % 10;

        showValues(n1, n2, n3, n4, n5);

        scanner.close();
    }
}
