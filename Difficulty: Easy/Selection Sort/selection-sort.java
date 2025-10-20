class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i <= n - 2; i++) {
            int minElemIdx = i;
            for (int j = i+1; j <= n-1; j++){
                if (arr[j] < arr[minElemIdx]){
                    minElemIdx = j;
                }
            }
            int temp = arr[minElemIdx];
            arr[minElemIdx] = arr[i];
            arr[i] = temp;
        }
    }
}