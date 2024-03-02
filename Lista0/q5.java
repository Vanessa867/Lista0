package Lista0;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args){
        Scanner kilo = new Scanner(System.in);
        int capacidade = 18;
        int Total = 0;
        int livrosCarregados = 0;

        System.out.println("Digite o peso do livro (em kg), digite um valor negativo ou zero para parar: ");

        while (true) {
            int pesoLivro = kilo.nextInt();
            if (pesoLivro <= 0) {
                break;
            }
            Total += pesoLivro;
            if (Total <= capacidade) {
                livrosCarregados++;
            } else {
                break; //
            }
        }

        System.out.println("Quantidade máxima de livros que a mochila pode carregar: " + livrosCarregados);
    }
}
