// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        
        while(n>0){
            int reminder = n%10;
            n /= 10;
            int cube = reminder * reminder * reminder;
            sum += cube;
        }
        
        if (sum == original){
            return true;
        }
        else {
        return false;
        }
    }
}