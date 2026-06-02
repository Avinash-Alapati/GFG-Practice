// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int org = n;
        int cube = 0;
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            cube = lastDigit * lastDigit * lastDigit;
            sum = sum + cube;
            n = n/10;
        }
        
        if(org == sum) {
            return true;
        }
        
        return false;
    }
}