import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double harmonic = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            harmonic += (float)1/i;
        }
        System.out.println("The harmonic of "+n+" is: "+harmonic);
    }
}
