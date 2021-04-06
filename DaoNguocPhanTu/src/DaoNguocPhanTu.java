import java.util.Scanner;

public class DaoNguocPhanTu {
    public static Scanner scanner = new Scanner(System.in);
    private static int size;
    private static int [] arr;

    public static void inputArray() {
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không được quá 20!");
            }
        } while (size > 20);
        arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử mảng thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
    }

    public static void reverseArray() {
        System.out.printf("%-20s%s", "Phần tử trong mảng: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        System.out.printf("%-20s%s", "Đảo ngược mảng: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        inputArray();
        reverseArray();
    }
}
