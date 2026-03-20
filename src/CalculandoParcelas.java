public class CalculandoParcelas {
    public static void main(String[] args) {
        double valorProduto = 2500.00;
        double juros = valorProduto * 0.05;
        double qtdParcelas = 5;
        double valorParcela = (valorProduto / qtdParcelas) + juros;
        double valorTotalComJuros = valorProduto + (juros * 5);


        System.out.println("O valor do produto é R$ " + valorProduto);
        System.out.println("Quantidade de parcelas = " + qtdParcelas);
        System.out.println("O valor de cada parcela é de R$ " + valorParcela);
        System.out.println("O valor total com juros é de R$ " + valorTotalComJuros);

    }
}
