class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character,Integer> f = new HashMap<>();
        HashMap<Character,Integer> w = new HashMap<>();
         for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            w.put(ch, w.getOrDefault(ch, 0) + 1);
        }
        if(f.equals(w)){
            return true;
        }
        for(int i = s1.length();i<s2.length();i++){
            char add = s2.charAt(i);
            w.put(add,w.getOrDefault(add,0)+1);

            char remove = s2.charAt(i-s1.length());
            w.put(remove,w.getOrDefault(remove,0)-1);

             if (w.get(remove) == 0) {
                w.remove(remove);
            }
            if(f.equals(w)){
            return true;
            }
        }
        return false;

    }
}
