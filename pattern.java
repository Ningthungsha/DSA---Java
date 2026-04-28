public class pattern {
    public static void main (String[]args){
        int i = 1;
        int n = 5;
        while (i<=n) {
            int j = 5;
            while (j>=i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }

    }
}

