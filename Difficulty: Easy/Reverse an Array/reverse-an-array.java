class Solution {
    public void recursiveReverse(int i , int[] arr , int n){
        // Base Case
        if (i >= n/2){
            return;
        }
        
        // Swapping
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        
        // Recursion Call
        recursiveReverse(i + 1 , arr , n);
    }
    
    public void reverseArray(int arr[]) {
        int n = arr.length;
        recursiveReverse(0 , arr , n);
    }
    
    // public int[] swap(int[] arr , int start , int end){
    //     while (start < end) {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
            
    //         start++;
    //         end--;
    //     }
    //     return arr;
    // }
}