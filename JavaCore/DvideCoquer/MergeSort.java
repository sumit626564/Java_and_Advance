package JavaCore.DvideCoquer;

public class MergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void mergeSort(int arr[], int starting_index, int ending_index) {
        if(starting_index >= ending_index){    // this is our base case in recrusion
            return;
        }
        int mid_index = (starting_index + ending_index) / 2;   // step find for mid
        mergeSort(arr, starting_index, mid_index);   // left index
        mergeSort(arr, mid_index+1, ending_index);   // right index
        // then we need to merge the both function
        merge(arr, starting_index, mid_index, ending_index);    // just assume  this function is already exists. not peramenet , after decliration then we need to create a this function
    }

    public static void merge(int arr[], int starting_index, int mid_index, int ending_index){
        int[] temp= new int[ending_index - starting_index+1];
        // iterate
        int left_part = starting_index;    // this is a iterator for left part
        int right_part = mid_index+1;        // iterator for  right part
        int k_temp_arr = 0;                 //  iterator for temp arr

        while (left_part <= mid_index && right_part <= ending_index) {
            // we need to comare left part element to right part of element
            if(arr[left_part] < arr[right_part]){
                temp[k_temp_arr] = arr[left_part];
                left_part++;
            }else{
                temp[k_temp_arr] = arr[right_part];
                right_part++; 
            }
            k_temp_arr++;
        }

        // left part remain
        while (left_part <= mid_index) {
            temp[k_temp_arr++] = arr[left_part++];
        }
        // right part remain
        while (right_part <= ending_index) {
            temp[k_temp_arr++] = arr[right_part++];
        }

        // copy temp to orginal array
        for(k_temp_arr=0, left_part=starting_index; k_temp_arr<temp.length; k_temp_arr++, left_part++){
            arr[left_part] = temp[k_temp_arr];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}