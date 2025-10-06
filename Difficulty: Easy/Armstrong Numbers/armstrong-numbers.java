// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int orgNum = n;
        int sum = 0;
        
        while (n != 0){
            int rem = n % 10;
            n = n /10;
            int cube = rem * rem * rem;
            sum += cube;
        }
        
        if (orgNum == sum) {
            return true;
        } else {
            return false;
        }
    }
}