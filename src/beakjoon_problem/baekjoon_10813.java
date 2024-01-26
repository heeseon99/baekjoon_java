package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_10813 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i< n; i++){
            array[i] = i+1;
        }

        int m = scanner.nextInt();

        for(int i = 0; i<m; i++){
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            int temp = array[first-1];
            array[first-1] = array[second-1];
            array[second-1] = temp;
        }

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

		scanner.close();

    }
}