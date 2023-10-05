import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(101);
        char game = 'y';
        while (game == 'y' || game == 'Y') {
            int i = 3;
            int flag = 0;
            while (i > 0 && flag == 0) {
                System.out.println();
                System.out.print("Enter your guess: ");
                int ans = sc.nextInt();
                if (ans == num) {
                    System.out.println("Congratulations, You Won!!!");
                    flag = 1;
                    System.out.print("Press Y to play again: ");
                    game = sc.next().charAt(0);
                } else if (ans > num) {
                    System.out.println("Try again with a smaller number");
                    i--;
                } else {
                    System.out.println("Try again with larger number");
                    i--;
                }
            }
            if (flag == 0) {
                System.out.println();
                System.out.println("Allowed attempts over. Start again!");
                System.out.println();
                System.out.print("Press Y to play again: ");
                game = sc.next().charAt(0);
            }
        }
        sc.close();
    }
}
