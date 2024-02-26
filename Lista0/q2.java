package Lista0;
import java.util.Arrays;
import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();


        int[] numerosOrdenados = ordenarDecrescente(num1, num2, num3);


        System.out.println("Ordem decrescente dos números: " + Arrays.toString(numerosOrdenados));
    }


    public static int[] ordenarDecrescente(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        int[] numerosOrdenados = new int[3];
        for (int i = 0; i < 3; i++) {
            numerosOrdenados[i] = numeros[2 - i];
        }
        return numerosOrdenados;
    }
}
