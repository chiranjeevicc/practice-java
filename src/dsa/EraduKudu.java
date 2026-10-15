package dsa;

import java.util.HashMap;

public class EraduKudu {

    public int[] eraduSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        EraduKudu ek = new EraduKudu();
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        int[] result = ek.eraduSum(arr, 6);
        if (result.length == 2) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("no two sum solution");
        }
    }
}
