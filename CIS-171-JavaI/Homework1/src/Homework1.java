import java.util.Scanner;

public class Homework1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();

        for(int i = 1; i < 11; ++i) {
            int result = N * i;

            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
