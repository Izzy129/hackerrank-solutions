import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Scanner scan = new Scanner(System.in);
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();
    public static boolean flag = (B>0) && (H>0);
    static { // initialization run
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

