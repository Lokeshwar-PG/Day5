import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println("first number is big");
        }
        else if(b>c && b>a) {
            System.out.println("second number is big");
        }
        else {
            System.out.println("third number is big");
        }
    }
}
