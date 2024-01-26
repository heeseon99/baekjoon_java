package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_25314 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        Long num = scanner.nextLong();
        Long count = num/4;

    for(int i = 0; i < count ; i++){
        System.out.print("long ");
    }
    System.out.println("int");

		scanner.close();
	}
}
