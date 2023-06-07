import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int x, y;
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero de linhas: ");
        x = tec.nextInt();
        System.out.println("Digite o numero de colunas: ");
        y = tec.nextInt();

        desenhaRetangulo(x, y);
        tec.close();
    }

    public static void desenhaRetangulo(int linhas, int colunas) {
        for (int i = 1; i <= linhas; i++) {
            System.out.println("");
            for (int j = 1; j <= colunas; j++) {
                if (j == 1) {
                    System.out.print("[");
                } else if (j == colunas) {
                    System.out.print("]");
                } else if (i == 1 || i == linhas) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
        }
    }

}