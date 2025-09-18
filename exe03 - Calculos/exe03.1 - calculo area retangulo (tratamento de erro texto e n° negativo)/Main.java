import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("=================================================");
        System.out.println("          Calcule o valor do retangulo          ");
        System.out.println("Sabe-se que a area do retangulo é: base * altura.");
        System.out.println("=================================================");

        do {
            System.out.print("Informe a base do retangulo (valor positivo): ");
            while (!sc.hasNextDouble()) { //evita erro se digitar texto
                System.out.print("Entrada inválida. digite novamente (apenas número): ");
                sc.next(); // descarta a entrada incorreta
            }
            base = sc.nextDouble();

            if (base <= 0) {
                System.out.println("A base deve ser maior que zero!");
            }

        } while (base <= 0);

        do {
            System.out.print("Informe a altura do retangulo (valor positivo): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número: ");
                sc.next();
            }
            altura = sc.nextDouble();

            if (altura <= 0) {
                System.out.print("A altura deve ser maior que zero!");
            }

        } while (altura <= 0);

        double area = base * altura;
        System.out.println("A área do retangulo é " + area + " m2");

        sc.close();
    }

}