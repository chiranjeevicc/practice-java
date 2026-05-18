package JAVA;

import java.util.*;

public class TwonumberKudi {
    public int[] Twonumberkodi(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);

        }
        return new int[] {};

    }

    public static void main(String args[]) {
        TwonumberKudi twosum = new TwonumberKudi();
        int[] result = twosum.Twonumberkodi(new int[] { 2, 9, 7, 3, 1, 5 }, 8);
        System.out.println("The Two indices of target some are " + result[0] + " " + result[1]);
    }
}