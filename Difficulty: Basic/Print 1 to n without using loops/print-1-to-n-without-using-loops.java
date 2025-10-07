class Solution {
    static void printNums(int i , int n){
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printNums(i + 1 , n);
    }
    static void printTillN(int N) {
        printNums(1 , N);
    }
}