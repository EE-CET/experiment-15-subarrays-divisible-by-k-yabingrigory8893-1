import java.util.Scanner;

public class SubarraysDivByK {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            if (!sc.hasNextInt()) return;
            int k = sc.nextInt();
            
            long[] remCount = new long[k];
            remCount[0] = 1;
            
            long currentSum = 0;
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    currentSum += sc.nextInt();
                    int rem = (int) ((currentSum % k + k) % k);
                    count += remCount[rem];
                    remCount[rem]++;
                }
            }
            
            System.out.println(count);
        }
    }
}

