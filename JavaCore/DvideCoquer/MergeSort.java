package JavaCore.DvideCoquer;

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int starting_index, int ending_index) {
        if (starting_index >= ending_index) {
            return; // base case
        }
        int mid_index = (starting_index + ending_index) / 2;
        mergeSort(arr, starting_index, mid_index);      // left part
        mergeSort(arr, mid_index + 1, ending_index);    // right part
        merge(arr, starting_index, mid_index, ending_index);
    }

    public static void merge(int arr[], int starting_index, int mid_index, int ending_index) {
        int temp[] = new int[ending_index - starting_index + 1];
        int left_part = starting_index;
        int right_part = mid_index + 1;
        int k_temp_arr = 0;

        while (left_part <= mid_index && right_part <= ending_index) {
            if (arr[left_part] <= arr[right_part]) {
                temp[k_temp_arr] = arr[left_part];
                left_part++;
            } else {
                temp[k_temp_arr] = arr[right_part];
                right_part++;
            }
            k_temp_arr++;
        }

        while (left_part <= mid_index) {
            temp[k_temp_arr++] = arr[left_part++];
        }

        while (right_part <= ending_index) {
            temp[k_temp_arr++] = arr[right_part++];
        }

        // copy temp to original array
        for (int i = 0; i < temp.length; i++) {
            arr[starting_index + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, 7};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
