import java.math.*; 
import java.lang.*; 
import java.util.*;
import java.io.*;
import java.math.BigInteger;     
public class Main
{ 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int prime[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        String s = in.nextLine();
        for(int j=0;j<s.length();j++)
        {
          System.out.print(Integer.toHexString(prime[s.charAt(j)-'A']));
          if(j<s.length()-1)
              System.out.print(',');
        }
        in.close(); 
    } 
} 