package codex2DARRAY;
import java.util.*;
public class Task3min {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
        System.out.println("Enter rows: ");
        int n = sc.nextInt();
        System.out.println("Enter columns: ");
        int [][]arr = new int[m][n];

        for(int i =0; i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        int min =arr[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
         System.out.print(min);
         sc.close();

    }
}
