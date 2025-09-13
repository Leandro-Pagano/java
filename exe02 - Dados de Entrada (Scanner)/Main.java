import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        var anobase = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento: ");
        var anonasc = scanner.nextInt();
        var idade = anobase - anonasc;
        System.out.printf("Olá %s você tem %s anos \n", name, idade);
scanner.close();
    }
}