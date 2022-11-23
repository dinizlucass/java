import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vect[i];
        }
        double avg = soma / n;
        System.out.printf("%.2f", avg);
    }
}