import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua nota entre 0 e 10: ");
        double nota = scanner.nextDouble();

        if ((nota >= 9) && (nota <=10)){
            System.out.print("Excelente desempenho!!!");
        } else if (nota >= 7) {
            System.out.print("Bom desemprenho!!");
        } else if (nota >= 5) {
            System.out.print("Desempenho regular.");
        } else if (nota >= 0) {
            System.out.print("Desempenho insuficiente.");
        }else System.out.println("Nota inválida. Nota deve estar entre 0 e 10.");

        scanner.close();
    }
}