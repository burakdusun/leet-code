package Easy;

import java.util.HashMap;
import java.util.Map;

// solution for https://leetcode.com/problems/n-repeated-element-in-size-2n-array

public class NRepeatedElementInSize2NArray {


    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
    }


    private static int repeatedNTimes(int[] array) {
        Map<Integer, Integer> intCountMap = new HashMap<>();
        for (int element : array) {
            int count;
            if (!intCountMap.containsKey(element)) {
                count = 1;
                intCountMap.put(element, count);
            } else {
                count = intCountMap.get(element) + 1;
                intCountMap.put(element, count);
            }
            if (count == (array.length) / 2) {
                return element;
            }
        }
        return -1;
    }

}
