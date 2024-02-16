package beakjoon_problem;

import java.util.Scanner;

public class baekjoon_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = scanner.next();

        for(int i  = 0; i < croatias.length; i++){
            if(str.contains(croatias[i])){
                str = str.replace(croatias[i], "@");
            }
        }
        
        System.out.println(str.length());

        scanner.close();
    }    
}
