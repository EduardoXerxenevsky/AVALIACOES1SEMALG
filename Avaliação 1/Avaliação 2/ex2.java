import java.util.Random;

public class ex2 {
    /*
     * Com o objetivo de conhecer melhor o seu público, uma faculdade resolveu
     * aplicar uma pesquisa com seus 300 alunos do período noturno. Para isso,
     * contratou um instuto de pesquisa que realizará as entrevistas e depois,
     * através de um algoritmo compilará os resutlados.
     * 
     * O objetivo da faculdade é descobrir os seguintes itens:
     * 
     * Quantidade de alunos que tem 28 anos ou menos.
     * Quantidade de alunos que tem 53 anos ou mais.
     * Média de idade dos alunos.
     * Média de idade dos alunos que tem entre 29 e 52 anos.
     * % de alunos que tem 20 anos.
     * Observações:
     * 
     * O programa não deverá aceitar valores inválidos e informar ao usuário a cada
     * entrada incorreta.
     * Utilize um gerador de número aleatórios para testar o programa com os 300
     * valores.
     */
    public static void main(String[] args) {
        String porcento = "%";
        int aluno;
        double qtdMais53 = 0, qtdMenos28 = 0, media, media2952, perc20, totalidades = 0, totalidades2952 = 0,
                aluno20 = 0, qtd2952 = 0, erro = 0, idadevalida = 0, tentativas = 0;
        Random rand = new Random();
        do {
            aluno = rand.nextInt(100);
            if (aluno < 17) {
                System.out.println("Você informou uma idade inválida, tente novamente: " + aluno);
                erro++;

            } else if (aluno > 100) {
                System.out.println("Você informou uma idade inválida, tente novamente: " + aluno);
                erro++;
            } else if (aluno <= 28 && aluno >= 17) {
                qtdMenos28++;
            } else if (aluno >= 53 && aluno < 100) {
                qtdMais53++;
            }
            if (aluno >= 29 && aluno <= 52) {
                totalidades2952 = totalidades2952 + aluno;
                qtd2952++;
            }
            if (aluno == 20) {
                aluno20++;
            }
            if (aluno >= 17 || aluno <= 100) {
                idadevalida++;
            }
            totalidades = totalidades + aluno;
        } while (idadevalida <= 299);
        media = totalidades / 300;
        media2952 = totalidades2952 / qtd2952;
        perc20 = (aluno20 / 300) * 100;
        tentativas = idadevalida + erro;

        System.out.printf(
                "Tentativas: %.0f%nQuantidade de alunos com 28 anos ou menos: %.0f%nQuantidade de alunos com 53 anos ou mais: %.0f%nMédia de idade dos alunos: %.0f%nMédia da idade dos alunos entre 29 e 52: %.0f%nPorcentagem dos alunos com 20 anos: %.2f%s%nQuantidade de números inválidos %.0f",
                tentativas, qtdMenos28, qtdMais53, media, media2952, perc20, porcento, erro);

    }
}
