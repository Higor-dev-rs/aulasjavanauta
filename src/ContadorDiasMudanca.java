public class ContadorDiasMudanca {
    public static void main(String[] args) {

        for (int dia = 20; dia <= 31; dia ++){
            System.out.println("Dia: " + dia);

            if (dia == 31) {
                System.out.println("Chaves na mão");
            } else if (dia % 2 == 0) {
                System.out.println("Focar no Java");
            } else if (dia % 2 == 1) {
                System.out.println("Preparar as caixas");
            }
        }

    }
}
