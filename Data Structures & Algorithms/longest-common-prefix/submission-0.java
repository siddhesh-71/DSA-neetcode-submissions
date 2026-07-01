class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s ="";
        int minlength= strs[0].length();
        for (int i =0 ; i< strs.length-1;i++){
            int j=0;
            int min= Math.min(strs[i].length(),strs[i+1].length());
            while(j<min){
                if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
                    break;
                }
                j++;
            }
            minlength = Math.min(j,minlength);
        }
        for(int i=0;i<minlength;i++){
            s=s+strs[0].charAt(i);
        }
        return s;

    }
}