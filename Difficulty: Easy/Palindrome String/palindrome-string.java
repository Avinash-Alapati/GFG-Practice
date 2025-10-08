class Solution {
    boolean checkPalindrome (String s , int n , int i){
        if (i >= n/2){
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)){
            return false;
        }
        return checkPalindrome(s , n , i + 1);
    }
    boolean isPalindrome(String s) {
        int n = s.length();
        if (checkPalindrome(s , n , 0)){
            return true;
        } else {
            return false;
        }
    }
}