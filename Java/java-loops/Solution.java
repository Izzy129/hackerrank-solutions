import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        // System.out.println(t);
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
              for(int j=0;j<=n-1;j++){
                
                sum += (int)Math.pow(2, j)*b;
                System.out.print(a+sum+" ");
        }
        System.out.println();
        }
    }
}
