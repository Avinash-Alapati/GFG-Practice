class Solution {
    public boolean isPalindrome(int n) {
        int org = Math.abs(n);
        int temp = org;
        int rev = 0;
        while (temp > 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp = temp / 10;
        }
        
        
        return org == rev;
    }
}