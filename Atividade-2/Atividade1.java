
public class Atividade1 {
    public static void main(String[] args) {

        double[][] emissoes = {
            {10, 20, 15, 25},
            {30, 25, 20, 15},
            {12, 18, 22, 28},
            {20, 20, 20, 20}
        };

        for (int i = 0; i < 4; i++) {
            double total = 0;

            for (int j = 0; j < 4; j++) {
                total += emissoes[i][j];
            }

            System.out.println("Filial " + (i + 1) + ": " + total);
        }

        double maiorEmissao = 0;
        int trimestreMaior = 0;

        for (int j = 0; j < 4; j++) {
            double total = 0;

            for (int i = 0; i < 4; i++) {
                total += emissoes[i][j];
            }

            System.out.println("Trimestre " + (j + 1) + ": " + total);

            if (total > maiorEmissao) {
                maiorEmissao = total;
                trimestreMaior = j + 1;
            }
        }

        System.out.println("Maior emissao: Trimestre "
                + trimestreMaior + " com " + maiorEmissao);
    }
}
