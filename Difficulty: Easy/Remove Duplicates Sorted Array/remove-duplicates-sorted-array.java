// TC -> O(N)
class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> zeroDuplicatesArray = new ArrayList<>();
        
        zeroDuplicatesArray.add(arr[0]);
        int n = arr.length;
        
        int idx = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] != arr[i - 1]){
                zeroDuplicatesArray.add(idx , arr[i]);
                idx++;
            }
        }
        return zeroDuplicatesArray;
    }
}
