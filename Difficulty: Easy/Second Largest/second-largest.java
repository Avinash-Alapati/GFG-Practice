class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = 0;
        int secondLargest = -1;
        
        for (int i = 0; i < n; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++){
            if ((arr[i] > secondLargest) && (arr[i] != largest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}