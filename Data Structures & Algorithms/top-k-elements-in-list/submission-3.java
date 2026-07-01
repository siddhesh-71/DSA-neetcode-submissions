class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Frequency Count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store all keys
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort according to frequency
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Store first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}