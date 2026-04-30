public class Natural{
   public static void main(String[] args) {

        for (int n = 1; n <= 50; n++) {

            int prime = 1;

            if (n <= 1) {
                prime = 0;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = 0;
                        break;
                    }
                }
            }

            if (prime == 1) {
                System.out.println(n);
            }
        }
    }
}
