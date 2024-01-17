package beakjoon_problem;

import java.util.Scanner;

public class beakjonn_14681 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Long num1 = scanner.nextLong();
		Long num2 = scanner.nextLong();
		
        if(num1 > 0){
            if(num2 > 0){System.out.println(1);}else{System.out.println(4);}
        }
        else{
            if(num2 > 0){System.out.println(2);}else{System.out.println(3);}
        }

		scanner.close();
	}
}
