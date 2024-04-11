import java.util.Scanner;

public class IsItRated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int m = Integer.parseInt( inputs[0]);
        int d= Integer.parseInt(inputs[1]);
        if(m == 4 && d == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
