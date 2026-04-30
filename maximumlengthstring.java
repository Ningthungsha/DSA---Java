import java.util.*;

class maximumlengthstring  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // example: "12345"
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int prod = 1;

            for (int j = i; j < s.length(); j++) {
                int num = s.charAt(j) - '0';
                prod *= num;

                if (prod < 100) {
                    int len = j - i + 1;
                    if (len > maxLen)
                        maxLen = len;
                } else {
                    break; // stop if product >= 100
                }
            }
        }

        System.out.println(maxLen);
        sc.close();
    }
}