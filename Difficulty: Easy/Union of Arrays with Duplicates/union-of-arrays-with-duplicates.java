class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        ArrayList<Integer> unionArr = new ArrayList<>();
        Set<Integer> uniqueElems = new HashSet<>();
        
        for (int i = 0; i < a.length; i++){
            uniqueElems.add(a[i]);
        }
        
        for (int i = 0; i < b.length; i++){
            uniqueElems.add(b[i]);
        }
        
        
        for (int it : uniqueElems) {
            unionArr.add(it);
        }
        return unionArr;
    }
}