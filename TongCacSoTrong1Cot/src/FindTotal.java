import java.util.Scanner;

public class FindTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bậc của ma trận: ");
        int n = scanner.nextInt();
        int [][] arr = new int[n][n];
        int total = 0;

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

        System.out.print("Nhập cột bạn muốn tính tổng: ");
        int col = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == col) {
                    total += arr[i][j];
                }
            }
        }

        System.out.println("Tổng cột " + col + " của ma trận = " + total);
    }
}
