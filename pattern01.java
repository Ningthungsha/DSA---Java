public class pattern01 {
    public static void main(String[]args){
        int n=4;
        int row=n-1;
        int space=0;
        int star=1;

        while(row<=1){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
        
            System.out.println();
            star++;
            space--;
        }  
        row=2;
        space=n-2;
        star=2;
        while(row<=n) {
            int i=1;
            while(i<=space){
                System.out.print(" ");
            }
        } 

    }
}
          
 