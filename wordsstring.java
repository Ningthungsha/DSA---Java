public class wordsstring {
    public static void main(String[]args){
        String s = new String("noop a was baddie her");
        String rev= "";
        String[]words = s.split(" ");

        for(int i =words.length-1;i>=0; i--){
            rev = rev + words[i] + " ";
            System.out.println(rev);
        }

    }
}
