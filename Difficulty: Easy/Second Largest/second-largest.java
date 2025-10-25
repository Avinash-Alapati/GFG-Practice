// TC -> O(N^2)

/* 
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
        
*/


// Optimal Solution
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int secondLargest = secondLargestElement(arr , n);

        return secondLargest;
    }
    
    public int secondLargestElement(int[] arr , int n){
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if ((arr[i] < largest) && (arr[i] > secondLargest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
}