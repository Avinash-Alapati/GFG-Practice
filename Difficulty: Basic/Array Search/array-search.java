class Solution {
    public int search(int arr[], int x) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                ans = i;
                return ans;
            }
        }
        return -1;
    }
}
