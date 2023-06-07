import java.util.Scanner;
public class teste2 {
    public static void main(String[] args) {
        int linhas, colunas;

        String simbolo = "";

        Scanner tec = new Scanner(System.in);

        System.out.println("digite a quantidade de linhas");

        linhas = tec.nextInt();

        System.out.println("digite a quantidade de colunas");

        colunas = tec.nextInt();

        for (int i = 1; i <= linhas; i++) {

            System.out.println("");

            for (int j = 1; j <= colunas; j++) {
                if (i == 1) {

                    System.out.print("*");
    
                }else if(i==linhas){
                    System.out.print("-");

                }else if (j ==1 ) {
    
                    System.out.print("+");
    
                }
                

            }

        }
    }
}
