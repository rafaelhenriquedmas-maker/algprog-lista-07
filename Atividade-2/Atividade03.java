
public class Atividade03 {
    public static void main(String[] args) {

        double[][] temperaturas = {
            {28.5, 30.0, 32.5, 29.0},
            {31.0, 35.5, 33.0, 30.5},
            {29.5, 32.0, 38.0, 31.0},
            {30.0, 34.0, 33.5, 36.0}
        };

        double maior = temperaturas[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (temperaturas[i][j] > maior) {
                    maior = temperaturas[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior temperatura: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

        double soma = 0;

        for (int i = 0; i < 4; i++) {
            soma += temperaturas[i][i];
        }

        System.out.println("Media da diagonal: " + soma / 4);
    }
}
