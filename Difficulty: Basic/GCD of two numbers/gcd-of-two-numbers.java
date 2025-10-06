class Solution {
    public static int gcd(int a, int b) {
        // Bruteforce Approach
        
        // int gcdVal = 1;
        // for (int i = 1; i <= Math.min(a,b); i++){
        //     if (a % i == 0 && b % i == 0){
        //         gcdVal = i;
        //     }
        // }
        // return gcdVal;
        
        // Eucledian Algorithm
        
        while (a > 0 && b > 0){
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        
        if (a == 0){
            return b;
        } else {
            return a;
        }
    }
}
