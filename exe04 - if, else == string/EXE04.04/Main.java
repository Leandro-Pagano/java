//validação de usuario
// ✅❌🚫

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String usuarioCorreto = "Admin";
        String senhaCorreta = "Leandro12345";
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int limiteTentativas = 3;


        System.out.println("===================================");
        System.out.println("============LOGIN USER=============");
        System.out.println("===================================");


        while (tentativas < limiteTentativas) {
            System.out.print("Usuario: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("Password: ");
            String senhaDigitada = scanner.nextLine();

            System.out.println();

            if (usuarioDigitado.equals(usuarioCorreto) && (senhaDigitada.equals(senhaCorreta))) {
                System.out.println("✅ Login realizado com sucesso!!");
                break;

            } else {
                tentativas++;
                int restantes = limiteTentativas - tentativas;

                if (restantes > 0) {
                    System.out.println("❌ Usuario e senha incorretos. Tentativas restantes: " + restantes);
                    break;
                } else {
                    System.out.println("🚫 Número máximo de tentativas atingido. Acesso negado");
                }

            }
        }  scanner.close();
    }
}