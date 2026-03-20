public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //and - e = precisa que os dois sejam verdadeiros
        System.out.println(x || y); //or - ou = precisa que pelo menos um seja verdadeiro
        System.out.println(! x);    //not - não= inverte, se era verdadeiro vira falso
    }
}
