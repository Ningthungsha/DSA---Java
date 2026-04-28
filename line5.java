public class line5 {
    public static void main (String[]args) {
        int n = 5;
        int space =n-1;
        int star = 5;
        int row = 1;
        while (row <= n){
            int i = 5 ;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            int j = 5;
            while(j<=star) {
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            space--;
            star++;
            row++;
        }
    }            
}        
