import java.util.Scanner;

public class odd_eve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else
            System.out.println("odd");

    }
}
