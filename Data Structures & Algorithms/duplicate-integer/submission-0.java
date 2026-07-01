class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int x=nums[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i <nums.length; i++) {
            int x = nums[i];

            if (map.get(x) != 1) {
                return true;
            }
        }

        return false;
    }
}
            