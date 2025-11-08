package DSA.Divide_Concquer;

public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Mergesort(int arr[], int starting_index, int ending_index){
        if(starting_index >= ending_index){
            return;
        }
        int mid_index = (starting_index + ending_index)/2;
        Mergesort(arr, starting_index, mid_index);     // left_index
        Mergesort(arr, mid_index+1, ending_index);     //  right index
        Merge(arr, starting_index, mid_index, ending_index);    // tmep and tehn create orginal 
    }
    public static void Merge(int arr[], int starting_index, int mid_index, int ending_index){
        int[] temp = new int[ending_index -starting_index+1];
        int left_index = starting_index;
        int right_index = mid_index+1;
        int k_temp = 0;
        
        while (left_index <= mid_index && right_index <= ending_index) {
            if(arr[left_index] <= arr[right_index]){
                temp[k_temp] = arr[left_index];
                left_index++;
            }else{
                temp[k_temp] = arr[right_index];
                right_index++;
            }
            k_temp++;
        }
        while (left_index <= mid_index) {
            temp[k_temp++] = arr[left_index++];
        }
        while (right_index <= ending_index) {
            temp[k_temp++] = arr[right_index++];
        }
        for(int i=0; i<temp.length; i++){
            arr[starting_index + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 77, 9};
        Mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}