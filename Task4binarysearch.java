package codex2DARRAY;
import java.util.*;
public class Task4binarysearch {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
         
         System.out.println("Enter columns:");
         int n = sc.nextInt();
         System.out.println("Enter rows:");
          int m = sc.nextInt();
         int arr[][] = new int[m][n];
         for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
         }
         System.out.println("Enter target:");
         int target = sc.nextInt();
         int i =0; 
         int j =n-1;
         while(i<m && j>=0){
            if(arr[i][j] == target){
                System.out.println("target found at:  ( " +i + ", " +j+")");
                break;
            }else if(arr[i][j] > target){
                j--;
            }
            else {
                i++;
            }
         }
         sc.close();
    }
}
