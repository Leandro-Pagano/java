import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name;

        System.out.println("Digite seu nome ou 's' para sair: ");
        name = scanner.nextLine();

        while (!name.equalsIgnoreCase("s")) {
            System.out.printf("Bem vindo, %s\n", name);
            System.out.println("Digite seu nome ou s para sair: ");
            name = scanner.nextLine();

        }
        System.out.println();
        System.out.println("Fim da execução");
    }

}

