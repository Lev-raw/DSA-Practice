import java.util.Arrays;

class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);

        int n = pizzas.length;
        int days = n / 4;
        int odd = (days + 1) / 2;
        int even = days / 2;

        long ans = 0;

        // Odd days: take the largest pizzas
        for (int i = n - odd; i < n; i++) {
            ans += pizzas[i];
        }

        // Even days: take every second pizza
        int i = n - odd - 2;

        for (int j = 0; j < even; j++) {
            ans += pizzas[i];
            i -= 2;
        }

        return ans;
    }
}