import java.util.NoSuchElementException;
import java.util.Scanner;

public class CC05Ex005 {
    public static Scanner getFile(String path) {
        try {
            Scanner scanner = new Scanner(CC05Ex005.class.getResourceAsStream(path));

            return scanner;
        } catch (NullPointerException exception) {
            return null;
        } 
    }

    public static void getAndShowData(Scanner file) {
        try {
            String cpf = file.nextLine();
            String name = file.nextLine();
            String ci = file.nextLine();
            String tituloEleitor = file.nextLine();
            String cnh = file.nextLine();
            String company = file.nextLine();
            String sallary = file.nextLine();

            System.out.printf("FICHA FUNCIONAL DE: %s\n\nDocumentos:\nCPF: %s\nC.I: %s\nTitulo de eleitor: %s\nCarteira de motorista: %s\nEmpresa: %s\nSalário: %s\n", name, cpf, ci, tituloEleitor, cnh, company, sallary);
        } catch (NoSuchElementException exception) {
            System.err.println("O arquivo não está no formato correto!");
        }
    } 

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Você precisa passar um arquivo como argumento!");
            return;
        }

        Scanner file = getFile(args[0]);

        if (file == null) {
            System.out.println("Arquivo não encontrado, por favor passe um arquivo valido!");
            return;
        }

        getAndShowData(file);
        file.close();
    }
}