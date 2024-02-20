package Lista0;
import java.awt.desktop.SystemSleepListener;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);

        System.out.print("Digiteum volume qualquer: ");
        int volume = vol.nextInt();

        if (volume <= 0){
            System.out.print("Mim volume");
        }else if ((volume > 0 ) && (volume <= 25)){
            System.out.print("Low volume");
        }else if ((volume > 25) && (volume <=75)){
            System.out.print("Medium volume");
        }else if ((volume > 75)&&(volume<=100)){
            System.out.print("High volume");
        }else{
            System.out.print("Max volume");
        }

    }
}
