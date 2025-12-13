// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
    //  return bruteforceSolution(arr , k);
     return betterSolution(arr , k);
    }
    
    public int bruteforceSolution(int[] arr , int val){
        int longest = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int sum = 0;
                for (int k = i; k < j; k++){
                    sum += arr[k];
                    
                    if (sum == val) longest = Math.max(longest , j - i + 1);
                }
            }
        }
        return longest;
    }
    
    public int betterSolution(int arr[] , int k){
        HashMap<Integer , Integer> prefSumMap = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k) {
                maxLen = Math.max(maxLen , i + 1);
            }
            int rem = sum - k;
            
            if (prefSumMap.containsKey(rem)){
                int len = i - prefSumMap.get(rem);
                maxLen = Math.max(maxLen , len);
            }
            if (!prefSumMap.containsKey(sum)) {
                prefSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
