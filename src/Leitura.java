import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Informe o ano de lançamento de filme");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga a sua avaliação do filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println("""
                
                Seu filme favorito é %s
                ano de lançamento foi em %d
                e ele teve uma avaliação de %.2f
                """.formatted(filme,anoDeLancamento,avaliacao));
    }
}
