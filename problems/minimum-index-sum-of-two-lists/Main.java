import java.util.*;

public class Main {
    public static void main(String[] _cliArgs) {
        // --- Example 1 ---
        {
            Solution sol = new Solution();
            String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
            String[] list2 = new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

            List<String> result = sol.findRestaurant(list1, list2);
            System.out.println("Example 1: " + result);
        }

        // --- Example 2 ---
        {
            Solution sol = new Solution();
            String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
            String[] list2 = new String[]{"KFC", "Shogun", "Burger King"};

            List<String> result = sol.findRestaurant(list1, list2);
            System.out.println("Example 2: " + result);
        }
    }
}
