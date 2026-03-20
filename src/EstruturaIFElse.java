import java.util.Scanner;

public class EstruturaIFElse {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite sua idade: ");
//        int idade = scanner.nextInt();
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade");
//        } else {
//            System.out.println("você é menor de idade");
//        }

//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("Vamos sair para passear");
//        } else {
//            System.out.println("vamos ficar em casa");
//        }

//        boolean temDinheiro = true;
//        boolean temCartao = false;
//
//        if (temDinheiro && temCartao) {
//            System.out.println("pede um ifood e zé dedlivery");
//        } else if (temDinheiro || temCartao) {
//            System.out.println("pede somente ifood");
//        } else {
//            System.out.println("não pede nada");
//        }

//      exemplo deoperador ternário, mesmo que usar if else, só que de forma mais reduzida de linhas de código
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        String maiorIdade = (idade >= 18) ? "você é maior de idade" : "você é menor de idade";
        System.out.println(maiorIdade);
    }
}
