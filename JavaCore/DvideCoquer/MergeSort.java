package JavaCore.DvideCoquer;

public class MergeSort {
<<<<<<< HEAD
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
=======
    public static void printArr(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int starting_index, int end_index){
        if(starting_index >= end_index){
            return;
        }
        int mid_index = (starting_index + end_index)/2;
        mergeSort(arr, starting_index, mid_index);     // left_index 
        mergeSort(arr, mid_index+1, end_index);         // right_index
        Merge(arr, starting_index, mid_index, end_index);    /// Combine to all index including (arr, starting_index, mid_index, end_index)
>>>>>>> coaching
    }
    public static void Merge(int arr[], int starting_index, int mid_index, int end_index){
        // create temp array
        int[] temp = new int[end_index-starting_index+1];
        // create index_
        int left_index = starting_index;
        int right_index =  mid_index+1;
        int k_temp_index =  0;

<<<<<<< HEAD
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
=======
        while (left_index < mid_index && right_index < end_index) {
            if(arr[left_index] <= arr[right_index]){
                temp[k_temp_index] = arr[left_index];
                left_index++;
            }else{
                temp[k_temp_index] = arr[right_index];
                right_index++;
>>>>>>> coaching
            }
            k_temp_index++;
        }

<<<<<<< HEAD
        while (left_part <= mid_index) {
            temp[k_temp_arr++] = arr[left_part++];
        }

        while (right_part <= ending_index) {
            temp[k_temp_arr++] = arr[right_part++];
        }

        // copy temp to original array
        for (int i = 0; i < temp.length; i++) {
=======
        // reamin part left part
        while (left_index <= mid_index) {
            temp[k_temp_index++] = arr[left_index++];
        }
        // remain part of right part
        while(right_index <= end_index){
            temp[k_temp_index++] = arr[right_index++];
        }

        // copy of temp to orginal array....!
        for(int i=0; i<temp.length; i++){
>>>>>>> coaching
            arr[starting_index + i] = temp[i];
        }
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        int arr[] = {6, 3, 9, 5, 2, 8, 7};
        mergeSort(arr, 0, arr.length - 1);
=======
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        mergeSort(arr, 0, arr.length-1);
>>>>>>> coaching
        printArr(arr);
    }
}
