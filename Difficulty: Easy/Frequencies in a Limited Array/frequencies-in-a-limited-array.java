class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // New arr to return result;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Precompute
        int[] hash = new int[(int) 1e6];
        for (int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
        
       // update the result arr
       
        for (int i =1; i < arr.length + 1; i++){
           result.add(hash[i]);
        }
        
        return result;
    }
}
