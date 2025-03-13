import java.util.Scanner;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class CC05Ex006 {
    public static double getDistance(int[] point, int[] straight) {
        int R = straight[0]*point[0] + straight[1] * point[1] + straight[2];
        

        return R/Math.sqrt(Math.pow(straight[0], 2) + Math.pow(straight[1], 2));
    }

    public static int getNumericInput(Scanner scanner, String message) {
        System.out.println(message);

        return scanner.nextInt();
    }

    public static int[] getStraight(Scanner scanner) {
        int A = getNumericInput(scanner, "Qual o valor de A? ");
        int B = getNumericInput(scanner, "Qual o valor de B?");
        int C = getNumericInput(scanner, "Qual o valor de C?");

        return new int[]{ A, B, C };
    }

    public static int[] getPoint(Scanner scanner) {
        int x = getNumericInput(scanner, "Qual o valor de x?");
        int y = getNumericInput(scanner, "Qual o valor de y?");

        return new int[]{ x, y };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] straight = getStraight(scanner);
        int[] point = getPoint(scanner);

        System.out.println("A distancia é: " + getDistance(point, straight));

        scanner.close(); 
    }
}
