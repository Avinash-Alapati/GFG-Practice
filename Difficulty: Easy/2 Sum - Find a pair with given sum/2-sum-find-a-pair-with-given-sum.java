// User function Template for Java
class Solution {
    public List<Integer> twoSum(int nums[], int target) {
        int n = nums.length;
        // return bruteforce(nums , target , n);
        return better(nums , target , n);
    }
    public List<Integer> bruteforce(int[] nums , int target , int n){  // TC -> O(N^2)
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int actualSum = 0;
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    result.add(0 , nums[j]);
                    result.add(1 , nums[i]);
                } 
            }
        }
        return result;
    }
    
    public List<Integer> better(int[] nums , int target , int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer , Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int elem = nums[i];
            int rem = target - elem;

            if(mpp.containsKey(rem)) {
                result.add(0 , nums[i]);
                result.add(1, rem);
            }
            mpp.put(nums[i], i);
        }
        return result;
    }
}