
import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {6,5,4,3,2,1};
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n;j++){
                if (arr[j]<arr[min]){
                    min = j;

                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
        sc.close();
    }
}
