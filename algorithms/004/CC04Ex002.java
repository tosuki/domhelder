import java.util.Scanner;

public class CC04Ex002 {
     private static String getAnswer(Scanner scanner, String message) {
        System.out.printf(message);
        return scanner.nextLine();
    }

    private static double getNumericValue(Scanner scanner, String message) {
        try {
            String value = getAnswer(scanner, message);

            return Double.parseDouble(value);
        } catch (NumberFormatException exception) {
            System.out.println("O valor que você inseriu é invalido, eu preciso de um número!");
            return getNumericValue(scanner, message);
        }
    }
   
    public static void showRow(String title, String value) {
        System.out.printf("%s ............. %s\n", title, value);
    }

    public static void showOverview(String name, String cpf, String ci, String eleitor, String cnh, String company, double sallary) {
        System.out.printf("FICHA FUNCIONAL DE: %s\n\n", name);

        System.out.println("Documentos: ");

        showRow("CPF", cpf);
        showRow("CI", ci);
        showRow("Titulo de eleitor", eleitor);
        showRow("Carteira de motorista", cnh);

        showRow("Empresa", company);
        showRow("Salário", ""+sallary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getAnswer(scanner, "Qual o seu nome? ");
        String cpf = getAnswer(scanner, "CPF: ");
        String ci = getAnswer(scanner, "CI: ");
        String eleitor = getAnswer(scanner, "Titulo de eleitor: ");
        String cnh = getAnswer(scanner, "Carteira de motorista: ");

        String company = getAnswer(scanner, "Empresa: ");
        double sallary = getNumericValue(scanner, "Salário: ");

        scanner.close();

        showOverview(name, cpf, ci, eleitor, cnh, company, sallary);
    }
}
