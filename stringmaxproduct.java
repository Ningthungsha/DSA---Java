import java.util.*;

public class stringmaxproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();   // example: "12345"
        int k = sc.nextInt();  // window size

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= s.length() - k; i++) {
            int prod = 1;

            for (int j = i; j < i + k; j++) {
                int num = s.charAt(j) - '0'; // convert char to number
                prod *= num;
            }

            if (prod > max)
                max = prod;
        }

        System.out.println(max);
        sc.close();
    }
}