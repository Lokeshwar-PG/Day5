import java.io.*;
import java.util.Scanner;

public class PrintWriter2DArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows and Columns: ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        OutputStream file;
        file = new FileOutputStream("output.txt");
        Writer writer = new OutputStreamWriter(file);
        PrintWriter printWriter = new PrintWriter(writer);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Enter the value of arr[" + i + "][" + j + "]:");
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                printWriter.print(arr[i][j] + "\t");
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
