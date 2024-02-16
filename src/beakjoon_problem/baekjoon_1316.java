package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_1316 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int result = count;

        for(int i = 0; i<count; i++){
            boolean array[] = new boolean[26];
            String word = scanner.next();

            for(int j = 0; j < word.length()-1; j++){
                if(word.charAt(j) != word.charAt(j + 1)){
                    if(array[word.charAt(j+1)-97] == true){
                        result--;
                        break;
                    }                    
                }
                array[word.charAt(j)-97] = true;
            }
        }

        System.out.println(result);
        scanner.close();
    }   
}
