import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //permite com que o programa leia o que o usuário escreve
        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();  //cria a variável que vai receber o nome que o usuário digitar
        System.out.println("Olá " + nome);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos");
    }
}
