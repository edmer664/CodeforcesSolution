import java.util.Locale;
import java.util.Scanner;

public class ToBeOrNotToBe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i<input.length; i++){
            if (input[i].toLowerCase().contains("be")){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
