package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_27866 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char[] newWord = new char[word.length()];

        for(int i = 0; i < word.length(); i++){
            newWord[i] = word.charAt(i);
        }

        int number = scanner.nextInt();

        System.out.print(newWord[number-1]);

		scanner.close();
	}
}
