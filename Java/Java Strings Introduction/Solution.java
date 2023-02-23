import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) <= 0? "No": "Yes");
        
        // Char aFirst = A.charAt(0)-32;
        // Char bFirst = B.charAt(0)-32;
        
        A = "" + ((char) (A.charAt(0)-32)) + A.substring(1);
        B = "" + ((char) (B.charAt(0)-32)) + B.substring(1);
        
        System.out.println(A + " " + B);
    }
}
