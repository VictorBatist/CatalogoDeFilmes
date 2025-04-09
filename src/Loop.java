import java.util.Scanner;

public class Loop {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        double media = 0;

        for(int i = 0; i<3; i++){
            System.out.println("Informe a nota que deseja dar ao filme: ");
            double nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println( "media de avaliações: "+ media/3);
    }
}
