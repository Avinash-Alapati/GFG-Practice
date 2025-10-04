// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int lastDigit;
        int reversed = 0;
       while (n > 0){
           lastDigit = n % 10;
           n = n / 10;
           reversed = reversed * 10 + lastDigit;
       }
       return reversed;
    }
}