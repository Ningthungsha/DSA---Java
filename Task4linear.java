package codex2DARRAY;
import java.util.Scanner;
public class Task4linear {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt(); int n =sc.nextInt();
        System.out.println("Enter rows: ");
        System.out.println("Enter columns: ");
        int target = sc.nextInt();
        System.out.println("Enter target:");
        int arr[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j] =sc.nextInt();
            }
        }

        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == target){
                    target = arr[i][j];
                    System.out.print("target:" +target);
    
                }
            }
        }
        sc.close();



    }
}
