package beakjoon_problem;
import java.util.Scanner;

public class beakjoon_2438 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}
