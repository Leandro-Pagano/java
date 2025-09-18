//exercicio curso extensão Java - Faculdade Uniesp

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;
        double notarec;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o seu nome: ");
        name = sc.next();
        System.out.printf("Informe a sua 1ª Nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Informa a 2ª Nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Informa a 3ª Nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        notarec = (7 - media);

        if (media >= 7) {
            System.out.printf("%s, você está aprovado e sua média é %.2f%n", name, media);

        } else if (media <= 7) {
            System.out.printf("%s, você está na final! Sua média é %s e precisara de %.1f para aprovação.", name, media, notarec);

        }


    }
}

