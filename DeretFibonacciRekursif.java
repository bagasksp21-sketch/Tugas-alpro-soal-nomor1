import java.util.Scanner;

public class DeretFibonacciRekursif {
    
    static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah deret fibonacci: ");
        int jumlah = input.nextInt();

        int total = 0;
        System.out.print("Deret Fibonacci: ");
        for (int i = 0; i < jumlah; i++) {
            int nilai = fibonacci(i);
            total += nilai;
            System.out.print(nilai);
            if (i < jumlah - 1) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + total);
        input.close();
    }
}