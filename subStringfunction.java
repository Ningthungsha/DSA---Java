import java.util.Scanner;
public class subStringfunction {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String s1 = new String("coding");
        String x = s1.substring(1,6);
        System.out.println(x);
        sc.close();
    }
}
