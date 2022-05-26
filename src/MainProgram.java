import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {

        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        bubbleSort(arr, N);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int arr[], int N) {

        int i;
        int j;
        for(i = 0; i < N - 1; i++){
            for(j = 0; j < N - 1; j++) {
                if(arr[j]>arr[j + 1]) {
                    int input = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = input;
                }
            }
        }
    }
}
