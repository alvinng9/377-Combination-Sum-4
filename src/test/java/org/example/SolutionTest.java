package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void combinationSum4Test() {
        Solution solution = new Solution();
        assertEquals(7, solution.combinationSum4(new int[]{1, 2, 3}, 4));
        assertEquals(0, solution.combinationSum4(new int[]{9}, 3));
        assertEquals(61, solution.combinationSum4(new int[]{4, 5, 3, 1, 2}, 7));
        assertEquals(16, solution.combinationSum4(new int[]{4, 5, 3, 1, 2, 6}, 5));
        assertEquals(1, solution.combinationSum4(new int[]{1}, 5));
    }
}