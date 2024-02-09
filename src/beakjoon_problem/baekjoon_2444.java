package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_2444 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

        for(int i = 1; i<= count; i++){
            for(int j = 0; j< count-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = count-1; i >= 0; i--){
            for(int j = 0; j< count-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
