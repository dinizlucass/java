import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j]= sc.nextInt();
            }
        }
        for(int i = 0; i <n; i++){
            System.out.print(matriz[i][i]+ " ");
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matriz[i][j] <  0 ){
                    count++;
                }
            }
        }
        System.out.println("negative numbers: " + count);
    }
}