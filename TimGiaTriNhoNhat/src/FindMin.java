public class FindMin {
    public static void main(String[] args) {
        int[] arr = {13, 8, 2, 4, 0, 10, -1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
