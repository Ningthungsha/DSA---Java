import java.util.*;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter the string");
        int k = sc.nextInt();
        System.out.println("Enter k elements");
        String s = sc.next();

        int max = 0;

        // Try making all 'a'
        for (int i = 0; i < s.length(); i++) {
            int change = 0;

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) != 'a') {
                    change++;
                }

                if (change > k) break;

                max = Math.max(max, j - i + 1);
            }
        }

        // Try making all 'b'
        for (int i = 0; i < s.length(); i++) {
            int change = 0;

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) != 'b') {
                    change++;
                }

                if (change > k) break;

                max = Math.max(max, j - i + 1);
            }
        }

        System.out.println(max);
        sc.close();
    }
}
