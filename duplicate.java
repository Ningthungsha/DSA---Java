public class duplicate {
    public static void main(String[]args){
        int arr[] = {3,2,3};
        int n = arr.length;

        for(int i = 0;i<n;i++){
            int count =0;
            for(int j =0; j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
        
                }
            }if(count>1){
                boolean found = false;
                for(int k =0; k<i; k++){
                    if(arr[k] == arr[i]){
                        found=true;
                    }
                }
                if(!found){
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
