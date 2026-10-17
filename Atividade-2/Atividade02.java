
public class Atividade02 {
    public static void main(String[] args) {

        int[][] conteudos = {
            {0, 1, 2, 0, 1},
            {1, 0, 2, 1, 0},
            {2, 2, 0, 1, 1},
            {0, 1, 0, 2, 2},
            {1, 0, 1, 0, 2}
        };

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (conteudos[i][j] == 0) {
                    seguros++;
                } else if (conteudos[i][j] == 1) {
                    suspeitos++;
                } else if (conteudos[i][j] == 2) {
                    nocivos++;
                }
            }
        }

        System.out.println("Conteudos seguros: " + seguros);
        System.out.println("Conteudos suspeitos: " + suspeitos);
        System.out.println("Conteudos nocivos: " + nocivos);
    }
}
