public class FindMax {
    public static void findMax() {
        int[][] dimenArr = {
                {9, 11, 500},
                {2, 3, 9, 0},
                {-1, 8, 7, 1000}
        };
        int maxDimen = dimenArr[0][0];
        int columMax = 0, rowMax = 0;

        for (int row = 0; row < dimenArr.length; row++) {
            for (int colum = 0; colum < dimenArr[row].length; colum++) {
                if (dimenArr[row][colum] > maxDimen) {
                    maxDimen = dimenArr[row][colum];
                    rowMax = row;
                    columMax = colum;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều: " + maxDimen);
        System.out.println("Ở vị trí: [" + rowMax + "]" + "[" + columMax + "]");
    }

    public static void main(String[] args) {
        findMax();
    }
}
