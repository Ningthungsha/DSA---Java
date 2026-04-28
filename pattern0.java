public class pattern0 {
    public static void main(String[]args) {
         int i = 1;
         int rows=5;
         int cols=5;

        while (i <= rows) {

            int j = 1;

            while (j <= cols) {

                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                j++;
            }

            System.out.println();
            i++;
        }
    }
}
