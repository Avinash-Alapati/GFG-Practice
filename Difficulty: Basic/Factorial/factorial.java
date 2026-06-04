class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int factorial=1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
