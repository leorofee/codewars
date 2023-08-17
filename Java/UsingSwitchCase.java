//Print 'weekend' if the number is 6 or 7, and 'weekday' if the number is greater than or equal to 1 and less than or equal to 5."
import java.util.Scanner;
public class UsingSwitchCase {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Dia da Semana");
            case 6, 7 -> System.out.println("Fim de semana");
            default -> System.out.println("Número inválido");
        }
        
     
    }
}