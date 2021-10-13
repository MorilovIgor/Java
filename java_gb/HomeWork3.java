import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        replaceNumInArr();
        makeEmptyArr();
        multiplyByTwo();
        addTwoDimensionalMatrix();
        System.out.println(Arrays.toString(returnArr(4, 12)));
    }

    static void replaceNumInArr() {
        int arr[] = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0; 
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void makeEmptyArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i < 100) {
                arr[i] = i + 1; // по какой то причине arr[i] = i++; выводит полный бред. Причину я не понял.
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void multiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void addTwoDimensionalMatrix() {
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i == j - 2 || j == i - 2) {
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[] returnArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
