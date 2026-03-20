public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Higor";
        String nomeIgual = "Rodrigues";

        int tamanhoDaString = nome.length();
        boolean nomesIguais = nome.equals(nomeIgual); //equals compara strings


        System.out.println("Olá, " + nome + " o seu nome tem " + tamanhoDaString + " caracteres");
        System.out.println("Os nomes são iguais? " + nomesIguais);
    }
}
