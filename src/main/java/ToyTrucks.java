import java.util.Scanner;

public class ToyTrucks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input <= 10 ? "YES" : "NO");
    }
}
