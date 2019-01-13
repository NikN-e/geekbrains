public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
    }
}

class FillArray{
    public static void main(String[] args) {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
    }
}

class  changeArray{
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }
}

class  fillDiagonal{
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               if(i == j || (j + 1) == (n - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

class MinMaxElement{
    public static void main(String[] args) {
        int[] arr = new int[]{3,14,4,6,8,3,2,-6};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min = " + min + " Max = "+ max);
    }
}
