public class reverse {
   

    public static int add(int a) {
        int reverse = 0;

        while (a > 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int a = 987;
        int result = add(a);
        System.out.println("Reversed number: " + result);
    }
}
