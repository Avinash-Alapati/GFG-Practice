class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                ls.add(i);
                
                if (i != n/i){
                ls.add(n/i);
            }
            }
        }
        Collections.sort(ls);
        return ls;
    }
}