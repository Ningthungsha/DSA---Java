package codex2DARRAY;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
          System.out.println("Enter columns:");
        int m = sc.nextInt();
        System.out.println("Enter rows:");
        int[][]  arr = new int[m][n];

        for(int i =0;i<m;i++){
            for(int j =0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
