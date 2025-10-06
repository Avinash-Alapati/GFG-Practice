class Solution {
    public static void print_divisors(int n) {
        ArrayList <Integer> divisors = new ArrayList<>();
        for (int i =1; i <= Math.sqrt(n); i++){ 
            if (n % i == 0){ 
                divisors.add(i);
                if (n/i != i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        for (int elem : divisors){
            System.out.print(elem + " ");
        }
    }
}
