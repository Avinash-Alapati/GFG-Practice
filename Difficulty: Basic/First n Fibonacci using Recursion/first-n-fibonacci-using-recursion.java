// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        
        int[] fibArr = new int[n];
        if (n >= 1) {
            fibArr[0] = 0;;
        }
        
        if(n >= 2) {
            fibArr[1] = 1;;
        }
        
        recFun(n, 2, fibArr);
        return fibArr;
        
    }
    
    public static void recFun(int n, int i, int fibArr[]) {
        if ( i >= n) {
            return;
        }
        // int nextTerm = start+right;
        // start = right;
        // right = nextTerm;
        // fibArr[i] = nextTerm;
        fibArr[i] = fibArr[i-1] + fibArr[i-2];
        
        recFun(n,i+1,fibArr);
        
    }
}