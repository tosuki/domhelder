import java.util.Scanner;

public class CC05Ex003 {
    private static double getIR(double sallary, double dependents) {
        double net = sallary - (dependents * 60);

        /**
         * net = 100%
         *   x     = 15%
         * 
         * net*15/100
         */
        return net * 15/100;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double sallary = scanner.nextDouble();

        System.out.println("Digite a quantidade de dependentes: ");
        double dependents = scanner.nextDouble();

        System.out.println("IR: " + getIR(sallary, dependents));

        scanner.close();
    }
}