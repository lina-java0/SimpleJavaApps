import java.util.HashMap;
import java.util.Map;

public class TargetSumIndexesSearch {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6};
        int target = 9;

        int[] result = findTwoSum(arr, target);

        if (result.length == 0) {
            System.out.println("Решение не найдено.");
        } else {
            System.out.println("Индексы: " + result[0] + ", " + result[1]);
        }
    }
}
