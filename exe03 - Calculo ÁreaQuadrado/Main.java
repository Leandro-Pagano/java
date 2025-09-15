import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o lado do quadrado: ");
        double lado = sc.nextDouble(); //recebe do usuário o lado do quadrado informado
        double area = lado * lado; // formula da área do quadrado
        System.out.println("A área do quadrado é " + area + " m2"); //exibe a área do resultado

        sc.close();
    }
}