public class FindMin {
    public static int minValue(int[] array){
        int min = array[0],index = 0;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                index = i;
                min = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }
}
