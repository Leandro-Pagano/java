//validação de usuario

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        String usuarioCorreto = "Admin";
        String senhaCorreta = "Leandro12345";
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("============LOGIN USER=============");
        System.out.println("===================================");

        System.out.print("Usuario: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Password: ");
        String senhaDigitada = scanner.nextLine();

        System.out.println();

        if(usuarioDigitado.equals(usuarioCorreto) && (senhaDigitada.equals(senhaCorreta))){
            System.out.println("✅ Login realizado com sucesso!!");
        }else System.out.println("❌ Usuario e senha incorretos.");

        scanner.close();

    }
}