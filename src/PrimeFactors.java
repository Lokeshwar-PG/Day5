import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The prime factors are...");
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int value) {
        int flag = 0;
        for(int i=1;i<=value/2; i++)
        {
            if(value%i==0) {
                flag++;
            }
        }
        return flag<=1;
    }
}
