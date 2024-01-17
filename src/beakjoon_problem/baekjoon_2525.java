package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_2525 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
        int cookTime = scanner.nextInt();

        int new_m = minute += cookTime;

        if(new_m >= 60){
            hour += new_m / 60;
            minute = new_m % 60;
        }

        if(hour >= 24){
            hour -= 24;
        }

        System.out.println((hour) + " " +(minute));

		scanner.close();
	}
}
