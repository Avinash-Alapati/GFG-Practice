class Solution {
    // Best Case TC - O(n);
    // Average , Worst Case TC - O(n^2);
    public void insertionSort(int arr[]) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++){
            int j = i;
            
            while (j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                
                j--;
            }
        }
        
    }
}