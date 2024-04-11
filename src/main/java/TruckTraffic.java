import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TruckTraffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rawInput = sc.nextLine().split(" ");
        int n = Integer.parseInt(rawInput[0]);
        int q = Integer.parseInt(rawInput[1]);

        String[] freeway = sc.nextLine().split("");
        int[] inputList = new int[q];

        for (int i = 0; i < q; i++) {
            inputList[i] = sc.nextInt();
        }

        // get max consecutive empty space
        ArrayList<Integer> spaces = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (freeway[i] == "T") {
                if (counter == 0) {
                    continue;
                } else {
                    spaces.add(counter);
                }
            } else {
                counter += 1;
            }
        }
        int biggestSpace = Collections.max(spaces);

        int[] answers = new int[q];
        for(int i = 0; i <q; i++){
            if(inputList[i] >= )
        }



    }


}
