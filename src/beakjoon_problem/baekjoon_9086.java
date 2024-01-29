package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_9086 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for(int i=0; i<testCase; i++){
            String test = scanner.next();
            System.out.print(test.charAt(0));
            System.out.println(test.charAt(test.length()-1));
        }   

		scanner.close();
	}  
}
