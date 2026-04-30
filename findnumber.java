import java.util.*;
public class findnumber {
    public static void  main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] ={4,3,2,7,8,2,3,1};
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        
        for(int i = 1; i<= n;i++){
            int count =0;
            for(int j =0; j<n;j++){
                if(arr[j] ==i){
                    count++;
                }
            }
            if(count==0){
                result.add(i);
            }

            
        }
        System.out.println(result);
        sc.close();
    }
}
