package Lista0;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner lados = new Scanner(System.in);

        System.out.println("Digite o valor de um lado do quadrado que esteja em 1 e 20: ");
        double l = lados.nextDouble();

        if (l < 1 || l > 20) {
            System.out.println("Tamanho do lado inválido. Insira um valor entre 1 e 20!!!");
        } else {

            for (int i = 0; i < l; i++) {

                for (int j = 0; j < l; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
