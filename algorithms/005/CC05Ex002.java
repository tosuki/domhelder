import java.util.Scanner;

public class CC05Ex002 {
    private static double getArea(double raio, double pi) {
        return 4*pi*Math.pow(raio, 2);
    }

    private static double getVolume(double raio, double pi) {
        return (4*pi*Math.pow(raio, 3))/3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        
        double pi = 3.1416;
        double raio = scanner.nextDouble();

        System.out.println("Área: " + getArea(raio, pi));
        System.out.println("Volume: " + getVolume(raio, pi));

        scanner.close();
    }
}