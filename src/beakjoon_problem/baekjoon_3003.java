package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] count = new int[] {1, 1, 2, 2 ,2, 8};
        int[] white_count = new int[6];
        int[] result = new int[6];

        for(int i = 0; i< white_count.length; i++){
            white_count[i] = scanner.nextInt();
        }

        for(int i = 0; i< result.length; i++){
            result[i] = count[i] - white_count[i];
        }

        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }

        scanner.close();
    }
}
