class Solution {
    public int maxConsecBits(int[] arr) {
        int n = arr.length;
        int maxFreq = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxFreq = Math.max(maxFreq, count);
        }

        return maxFreq;
    }
}
