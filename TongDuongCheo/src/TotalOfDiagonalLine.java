import java.util.Scanner;

public class TotalOfDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bậc của ma trận: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int total = 0;
        int total1 = 0;

        System.out.println("Nhập phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    total += arr[i][j];
                }
                if (i + j == n - 1) {
                    total1 += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính 1 của ma trận: " + total);
        System.out.println("Tổng đường chéo chính 2 của ma trận: " + total1);
    }
}


