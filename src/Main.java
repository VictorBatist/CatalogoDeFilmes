public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Catálogo de filmes online");

        int anoDeLancamento = 1972;
        String nomeDoFilme = "The Godfather";
        double mediaDoFilme = (9.8 + 8.5 + 6.2)/3;

        String sinopse = """
                         Filme: The Godfather
                         Filme dos anos 70 sobre mafiosos
                         Muito bom!
                         Ano de lançamento:
                         """ + anoDeLancamento;
        System.out.println(sinopse);

        // usamos o casting explicito
        int classificacao = (int) (mediaDoFilme/2);
        System.out.println("Esse filme é " + classificacao + " Estrelas");
    }
}