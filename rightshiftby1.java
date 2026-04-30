import java.util.Scanner;
public class rightshiftby1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[]= {4,3,2,1};
        int n = arr.length;

        for(int i =n-1; i>=0; i--){
            System.out.println(arr[i]>>1);
        }
        sc.close();

    }
}
