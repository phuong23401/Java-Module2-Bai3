import java.util.Scanner;

public class InsertElement {
    public static int[] insertElement(int[] a, int x, int index) {
        if (index < 0 || index > a.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            int[] newArr = new int[a.length + 1];
            for (int i = 0; i < a.length; i++) {
                newArr[i] = a[i];
            }
            for (int i = newArr.length - 1; i > index; i--) {
                newArr[i] = newArr[i - 1];
            }
            newArr[index] = x;
            return newArr;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kì: ");
        int num = scanner.nextInt();
        System.out.print("Nhập vị trí muốn chèn phần tử: ");
        int index = scanner.nextInt();

        int[] a = {1, 1, 2, 1};
        a = insertElement(a, num, index);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
