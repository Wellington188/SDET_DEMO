import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        String s = "hello world";
        char[] charArray = s.toCharArray();
        Set<Character> set  = new HashSet<Character>();

        int cont = 00;
        for(int i=0; i<charArray.length; i++){
            if(!set.add(charArray[i])){
                System.out.println("index position: "+i);
                cont++;
            }
            
        }
        System.out.println("Duplicates amount: "+cont);
    }
    
}
