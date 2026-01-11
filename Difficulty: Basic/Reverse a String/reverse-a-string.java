// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        int n = s.length() - 1;
        StringBuffer sb = new StringBuffer();
        for (int i = n; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}