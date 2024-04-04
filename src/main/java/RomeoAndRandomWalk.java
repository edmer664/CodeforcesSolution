import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class RomeoAndRandomWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rawInput = sc.nextLine().split(" ");
        int n = Integer.parseInt(rawInput[0]), a = Integer.parseInt(rawInput[1]), b = Integer.parseInt(rawInput[2]), d = Integer.parseInt(rawInput[3]);
        Integer[] points = Stream.of(sc.nextLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        ArrayList<Integer> indices = new ArrayList<Integer>();
        // identify if in range
        for (int i = 0; i < n; i++) {
            if (points[i] - d >= a && points[i]  <= b){
                indices.add(i);
            }
        }
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i) + " ");
        }

    }
}
