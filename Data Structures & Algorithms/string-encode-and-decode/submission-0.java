
class Solution {

    // Encode
    public String encode(List<String> strs) {

        String s = "";

        for (int i = 0; i < strs.size(); i++) {
            s = s + strs.get(i).length() + "#" + strs.get(i);
        }

        return s;
    }

    // Decode
    public List<String> decode(String str) {

        ArrayList<String> arr = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Read length
            String len = "";

            while (str.charAt(i) != '#') {
                len = len + str.charAt(i);
                i++;
            }

            int length = Integer.parseInt(len);

            // Skip '#'
            i++;

            // Read the string
            String word = "";

            for (int j = 0; j < length; j++) {
                word = word + str.charAt(i);
                i++;
            }

            arr.add(word);
        }

        return arr;
    }
}