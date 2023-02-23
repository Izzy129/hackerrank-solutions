import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() == b.length()) {
            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();
            
            for (int i = 0; i < arrA.length-1; i++) { // selection sort
                int minIndex = i;
                for (int j = i+1; j < arrA.length; j++) {
                    if (arrA[j] <  arrA[minIndex]) {
                        minIndex = j;
                    }
                }
                char temp = arrA[minIndex];
                arrA[minIndex] = arrA[i];
                arrA[i] = temp;
            }
            
            
            for (int i = 0; i < arrB.length-1; i++) { // selection sort
                int minIndex = i;
                for (int j = i+1; j < arrB.length; j++) {
                    if (arrB[j] <  arrB[minIndex]) {
                        minIndex = j;
                    }
                }
                char temp = arrB[minIndex];
                arrB[minIndex] = arrB[i];
                arrB[i] = temp;
            }
            
            

            for (int i = 0; i < arrA.length; i++) {
                    if (arrA[i] != arrB[i]) {
                        return false;
                    }
                
            }
        } else {
            return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
