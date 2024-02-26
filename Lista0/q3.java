package Lista0;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;
        System.out.println("a: ");
        a = ler.nextInt();
        System.out.println("b: ");
        b = ler.nextInt();
        System.out.println("c: ");
        c = ler.nextInt();

        double delta;
        delta = Math.pow(b,2)-(4*a*c);

        if (delta>0){
            System.out.println("Existem duas raizes reais");
        } else if (delta==0) {
            System.out.println("Exite apenas uma raiz real");
        }else if (delta<0){
            System.out.println("Não existe raiz real");
        }
    }
}
