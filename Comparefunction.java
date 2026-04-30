import java.util.*;
public class Comparefunction {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        String s1 = new String("Ayush");
        String s2 = new String("Ayutosh");
        int x = s1.compareTo(s2);

        System.out.println(x);
        sc.close();
    }
}
