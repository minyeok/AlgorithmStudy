package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];

        dp[0] = dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
            dp[i] %= 10007;
        }

        System.out.println(dp[num]);
    }
}