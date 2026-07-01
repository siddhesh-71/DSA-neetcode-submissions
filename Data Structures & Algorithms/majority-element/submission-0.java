class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> f=new HashMap<>();
        int max =0;
        int res =0;
        for(int i =0;i<nums.length;i++){
            int x=nums[i];
            f.put(x,f.getOrDefault(x,0)+1);
            if (f.get(x) > max) {
                res = x;
                max = f.get(x);
            }
        }
        return res;
        
    }
}