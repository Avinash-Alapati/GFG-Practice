class Solution {
    void RecursiveFun(int i , int n){
        if (i > n){
            return;
        }
        System.out.print("GFG" + " ");
        RecursiveFun(i + 1 , n);
    }
    void printGfg(int N) {
        RecursiveFun(1 , N);
    }
}