class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n -1);
    }
}
