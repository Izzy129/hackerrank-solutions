import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine().trim();
        scan.close();
        
        if (s.length()==0) {
            System.out.println("0");
            return;
        }
        s = s.trim();
        
        
        String[] words = s.split("[ !,?._\'@]+");
        
        System.out.println(words.length);
        
        for (String word: words) {
            System.out.println(word);
        }
    }
}
