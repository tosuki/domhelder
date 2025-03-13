import java.util.Scanner;

public class CC05Ex005 {
    public static double parseCelciusToKelvin(double celcius) {
        return celcius + 273;
    }

    public static double parseCelciusToFahrenheit(double celcius) {
        /**
         * Celcius = (5*Fahrenheit - 160)/9
         * 9*celcius = 5*Fahrenheit - 160
         * 9*celcius + 160 = 5*fahrenheit
         * (9*celcius + 160)/5 = fahrenheit
         *
         * fahrenheit = (9*celcius + 160)/5
         *
         */

        return (9*celcius + 160)/5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em C°: ");
        double celcius = scanner.nextDouble();
        
    
        System.out.println("Kelvin: " + parseCelciusToKelvin(celcius));
        System.out.println("Fahrenheit: " + parseCelciusToFahrenheit(celcius));

        scanner.close();
    }
}
