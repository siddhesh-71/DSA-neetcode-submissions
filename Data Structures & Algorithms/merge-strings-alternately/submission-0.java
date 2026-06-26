class Solution {
    public String mergeAlternately(String word1, String word2) {

        String x = "";
        int k = 0;
        int j = 0;

        while (k < word1.length() && j < word2.length()) {
            x += word1.charAt(k);
            x += word2.charAt(j);
            k++;
            j++;
        }

        while (k < word1.length()) {
            x += word1.charAt(k);
            k++;
        }

        while (j < word2.length()) {
            x += word2.charAt(j);
            j++;
        }

        return x;
    }
}