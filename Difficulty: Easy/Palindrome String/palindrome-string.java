class Solution {
    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        return recFun(s, left, right);
        
    }
    
    boolean recFun(String s, int left, int right){
        if (left >= right) return true;
        
        if(s.charAt(left) != s.charAt(right)) return false;
        
        return recFun(s,left + 1, right - 1);
    }
}