package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_10810 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        int m = scanner.nextInt();
        for(int i = 0; i<m; i++){
            int first = scanner.nextInt();
            int last = scanner.nextInt();
            int count = scanner.nextInt();

            for(int j = first - 1; j < last; j++){
                array[j] = count;
            }
        }

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

		scanner.close();

    }
}
