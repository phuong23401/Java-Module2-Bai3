import java.util.Scanner;

public class CharacterCount {
    static void characterCount(String str) {
        int [] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int [] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == arr[j]){
                    flag++;
                }
            }
            if (flag == 1) {
                System.out.println("Số lần xuất hiện của " + str.charAt(i) + " trong chuỗi: " + count[str.charAt(i)]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi ký tự: ");
        String str = scanner.nextLine();

        System.out.println("Chuỗi là: " + str);
        characterCount(str);
    }
}

