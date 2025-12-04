class Solution {
    int missingNum(int arr[]) {
       // Better 
       int n = arr.length + 1;
       int[] hashArr = new int[n+1];
       
       for (int i = 0; i < n - 1; i++){
           hashArr[arr[i]] = 1;
       }
       for (int i = 1; i <= n; i++){
           if (hashArr[i] == 0){
               return i;
           }
       }
       return 0;
    }
}