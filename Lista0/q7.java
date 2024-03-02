package Lista0;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo (entre 2 e 20):");
        int altura = scanner.nextInt();

        if (altura < 2 || altura > 20) {
            System.out.println("Altura inválida. Um valor entre 2 e 20!!!");
        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = altura - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
