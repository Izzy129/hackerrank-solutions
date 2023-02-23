import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] substrings = new String[s.length()+1-k];
        
        for (int i = 0; i < s.length()+1-k; i++) {
            substrings[i] = s.substring(i,i+k);
        }
        
        for (int i = 0; i < substrings.length-1; i++) { // selection sort
            int minIndex = i;
            for (int j = i+1; j < substrings.length; j++) {
                if (substrings[j].compareTo(substrings[minIndex]) <  0) {
                    minIndex = j;
                }
            }
            String temp = substrings[minIndex];
            substrings[minIndex] = substrings[i];
            substrings[i] = temp;
        }
        
        smallest = substrings[0];
        largest = substrings[substrings.length-1];
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
