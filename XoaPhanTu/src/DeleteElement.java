import java.util.Scanner;

public class DeleteElement {
    public static int[] deleteElement(int[] a,int x){
        boolean check = false;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(x == a[i]){
                check = true;
                count++;
            }
        }
        if(check){
            int[] newArr = new int[a.length - count];
            for (int i = 0,j = 0; i < a.length; i++) {
                if(x == a[i]){
                    continue;
                }
                newArr[j] = a[i];
                j++;
            }
            return newArr;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bất kì: ");
        int num = sc.nextInt();

        int[] a = {1, 1, 2, 1, 3, 10, 1, 10, 1, 1, 1};
        a = deleteElement(a,num);
        for (int i : a){
            System.out.print("Mảng đã xóa phần tử: " + i + " ");
        }
    }
}
