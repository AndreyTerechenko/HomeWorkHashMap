import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 5, 7, 8, 9, 4, 2, 7, 6, 12, 14, 10);
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("\n");
        Set<Integer> nums1 = new TreeSet<>(nums);
        for (Integer i : nums1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");
        List<String> string = List.of("name", "name", "old", "new", "clear", "new", "old", "bear", "lock");
        Set<String> string1 = new HashSet<>(string);
        for (String i : string1) {
            System.out.println(i);
        }
        System.out.println("\n");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            var n = map.get(s);
            if (n == null) {
                map.put(s, 1);
            } else {
                map.put(s, n + 1);

            }
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}








