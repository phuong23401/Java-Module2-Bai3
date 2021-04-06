import java.util.Scanner;

public class FindMax {
    public static Scanner scanner = new Scanner(System.in);
    private static int size;
    private static int[] arr;

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

    public static void findMax() {
        System.out.print("Phần tử trong mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");

        int max = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất trong mảng là: "  + max + " ở vị trí: " + index);
    }

    public static void main(String[] args) {
        inputArray();
        findMax();
    }
}
