import java.util.Arrays;

public class Solution {

    public int solution(int[] blocks) {
        int N = blocks.length;
        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (blocks[j] >= blocks[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][i] + (j - i + 1));
                }
            }
        }

        return Arrays.stream(dp[0]).max().getAsInt();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] blocks1 = {2, 6, 8, 5};
        int result1 = solution.solution(blocks1);
        System.out.println("Result 1: " + result1); // Output: 3

        int[] blocks2 = {1, 5, 5, 2, 6};
        int result2 = solution.solution(blocks2);
        System.out.println("Result 2: " + result2); // Output: 4

        int[] blocks3 = {1, 1};
        int result3 = solution.solution(blocks3);
        System.out.println("Result 3: " + result3); // Output: 2
    }
}
