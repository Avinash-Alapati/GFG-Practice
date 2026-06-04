class Solution {
    public void reverseArray(int arr[]) {
        // swapArr(arr);
        int left = 0; 
        int right = arr.length - 1;
        recFun(arr, left, right);
    }
    
    public void recFun(int[] arr, int left, int right){
        if(left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        recFun(arr, left + 1, right - 1);
    }
    
    public int[] swapArr(int arr[]) {
        int left = 0; 
        int right = arr.length - 1;
        
        while( left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return arr;
    }
}