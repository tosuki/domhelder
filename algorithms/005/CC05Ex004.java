import java.util.Scanner;

public class CC05Ex004 {
    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1-y2, 2));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X do primeiro ponto: ");
        int x1 = scanner.nextInt();

        System.out.println("Digite o valor de Y do primeiro ponto: ");
        int y1 = scanner.nextInt();

        System.out.println("Digite o valor de X do segundo ponto: ");
        int x2 = scanner.nextInt();

        System.out.println("Digite o valor de Y do segundo ponto: ");
        int y2 = scanner.nextInt();

        System.out.println("A distancia entre os dois pontos é: " + getDistance(x1, y1, x2, y2));

        scanner.close();
    }
}