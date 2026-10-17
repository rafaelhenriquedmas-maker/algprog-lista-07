
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] paineis = new double[3][5];
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Eficiencia [" + i + "][" + j + "]: ");
                paineis[i][j] = sc.nextDouble();
                soma += paineis[i][j];
            }
        }

        double media = soma / 15;

        System.out.println("Media global: " + media);
        System.out.println("Paineis abaixo da media:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (paineis[i][j] < media) {
                    System.out.println("[" + i + "][" + j + "] = "
                            + paineis[i][j]);
                }
            }
        }

        sc.close();
    }
}
