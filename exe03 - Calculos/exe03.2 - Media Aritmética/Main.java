import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        String name;


        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule a média aritmética do Aluno");

        System.out.print("Digite o seu nome: ");
        name = sc.next();

        System.out.printf("Informe a 1ª Nota: ");
        nota1 = sc.nextDouble();
        System.out.printf("Informe a 2ª Nota: ");
        nota2 = sc.nextDouble();
        System.out.printf("Informe a 3ª Nota:");
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println();

        System.out.printf(name + ", sua média final é %.2f%n ", media);
    }
}