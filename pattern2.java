public class pattern2 {
     public static void main (String[]args){
       int i = 1;
       int j = 5;
       int n = 5;
       for (i =1; i<=n; i++) {
        for ( j=5; j>=i; j--) {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}

