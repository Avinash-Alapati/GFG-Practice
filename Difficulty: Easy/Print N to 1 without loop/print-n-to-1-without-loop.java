class Solution {
    void reverseNums(int i , int n){
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        reverseNums(i - 1 , n);
    }
    void printNos(int N) {
        reverseNums(N , N);
    }
}