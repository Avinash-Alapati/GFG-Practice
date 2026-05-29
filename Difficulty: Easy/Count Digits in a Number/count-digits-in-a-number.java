class Solution {
    public static int countDigits(int n) {
        // Code here
        int countDigits = 0;
        while (n > 0){
            countDigits += 1;
            n = n/10;
        }
        return countDigits;
    }
}
