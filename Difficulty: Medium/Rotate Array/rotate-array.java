// User function Template for Java

class Solution {
    static void rotateArr(int arr[], int d) {
        // bruteforceSol(arr , d);
        
        // Optimal in place
        int n = arr.length;
        d = d % n;
        reverseArr(arr , 0 , d - 1);
        reverseArr(arr , d , n - 1);
        reverseArr(arr , 0 , n - 1);
    }
    
    public static int[] bruteforceSol(int[] arr , int d){
        // Bruteforce -> Copy kth elem --> Shift rem elem --> put it back !!
        // BruteForce - TC -> O(d) + O(n-d) + O(d) = O(n + d);
        // Extra Space SC -> O(d);
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        
        // Copying the Kth elements to be Rotated
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        
        // Shifting the remaining elements to left
        for (int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }
        
        // put the values in temp array back;
        for (int i = 0; i < d; i++){
            arr[n - d + i] = temp[i];
        }
        return arr;
    }
    
    // Reverse Function for optimal solution
    public static int[] reverseArr(int arr[] , int start , int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        return arr;
    }
}