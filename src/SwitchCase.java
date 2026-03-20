public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 5;

        switch (diaDaSemana) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");

//                isso deve ser usado quando precisaria usar mais de 3 if else para verificar
//                ou principalmente para verificar que coisas que tenham o mesmo valor de condição
        }
    }
}
