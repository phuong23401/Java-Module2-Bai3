import java.util.Scanner;

public class FindElement {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

    public static void findElement() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vị trí sinh viên " + inputName + " trong mảng là: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy sinh viên trong mảng");
        }
    }

    public static void main(String[] args) {
        findElement();
    }
}
