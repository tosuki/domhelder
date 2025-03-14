import java.util.Scanner;

/**
 * xxxyyyzzz
 * */

public class CC05Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite um número de até 9 digitos: ");
        int numero = scanner.nextInt();

        int codigoBanco = numero/1000000;
        int codigoAgencia = numero/1000%1000;
        int codigoSequencial = numero%1000;

        System.out.printf("Resultado: \nBanco: %d\nAgencia: %d\nSequêncial: %d", codigoBanco, codigoAgencia, codigoSequencial);

        scanner.close(); 
    } 
}
