import java.util.Scanner;

public class CC05Ex001 {
    public static double f(double x) {
        return Math.pow(x, 3) + 4*x + 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        double x = scanner.nextDouble();
        
        System.err.println("O valor de f é: " + f(x));

        scanner.close();
    }
}