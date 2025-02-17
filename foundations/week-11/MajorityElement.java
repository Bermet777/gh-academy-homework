class Solution {
    public int majorityElement(int[] nums) {
//1) the best solution due to space complexity efficiency (GH)
        int candidate = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) candidate = i; 
            if (i == candidate) count++;
            else count--;
        }
    return candidate; 
    }
}

//2) second best solution, more space required due to hashmap creation (GH)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i: nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry:freq.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
    return Integer.MIN_VALUE;
    }
}

//3) Solution with hashmap from LC Solutions section
class Solution {
    public int majorityElement(int[] nums) {
    int candidate = 0; 
    int maxCount = 0;
    Map<Integer, Integer> storage = new HashMap<>();
    for (int i : nums) {
        storage.put(i, storage.getOrDefault(i, 0) + 1);
        if (storage.get(i) > maxCount) {
            maxCount = storage.get(i);
            candidate = i;
        }
    }
    return candidate;
    }
}

        






