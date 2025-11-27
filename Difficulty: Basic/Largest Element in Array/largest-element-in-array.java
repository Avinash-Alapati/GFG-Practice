class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
