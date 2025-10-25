// Straight Solution 
// TC -> O(N)

class Solution {
    public boolean isSorted(int[] arr) {
     
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]){ 
                continue;
            } else {
               return false;
            }
        }
        return true;
    }
}