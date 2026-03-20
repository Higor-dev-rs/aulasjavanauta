public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 0.05;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - (valorTotal * desconto);
        double valorTotalDividido = valorTotalComDesconto / 2;
        int diasNoMes = 30;

        System.out.println("valor total = R$ " + valorTotal);
        System.out.println("valor total com desconto fica em: R$ " + valorTotalComDesconto);
        System.out.println("O valor total dividido para os dois é de R$ " + valorTotalDividido);
        System.out.println("O gasto total mensal é de R$ " + valorTotalComDesconto * diasNoMes);

    }
}
