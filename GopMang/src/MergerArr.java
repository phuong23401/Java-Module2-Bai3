import java.util.Arrays;

public class MergerArr {
    public static void main(String[] args) {
        int [] Array1 = new int [] {00, 10, 20, 30, 40, 50};
        int [] Array2 = new int [] {60, 70, 80, 90, 100};
        int [] concate = new int [Array1.length + Array2.length];

        System.arraycopy(Array1, 0, concate, 0, Array1.length);
        System.arraycopy(Array2, 0, concate, Array1.length, Array2.length);

        System.out.println("Mảng 1: " + Arrays.toString(Array1));
        System.out.println("Mảng 2: " + Arrays.toString(Array2));
        System.out.println("Mảng đã gộp: " + Arrays.toString(concate));
    }
}
