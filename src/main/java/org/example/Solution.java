package org.example;

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] result = new int[target + 1];
        result[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    result[i] += result[i - num];
                }
            }
        }
        return result[target];
    }
}
