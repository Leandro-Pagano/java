//forma correta para compração de string é: equals
// e parâmetro para Case Sensitive;

public class Main {
    public static void main(String[] args) {
        String str = "Gonçalves";

        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (str.equalsIgnoreCase("pagano")) {
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");

    }
}