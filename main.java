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
        HashMap<String,Set<String>> translations = new HashMap<String,Set<String>>();
        while(true)
        { 
          System.out.println("Please enter your word:");
          String s=in.nextLine();
          if(translations.containsKey(s))
          {
            System.out.println("translations:");
            for(String i : translations.get(s))
            {
              System.out.println(i);
            }
            break;
          }
          else
          {
            System.out.print("Sorry!Word does not exists in our dictionary.");
            System.out.print("Would you like to add its translations(Y/N)?");
            String choice = in.nextLine();
            if(choice.equals("Y"))
            {   
                System.out.println("Please add translations of "+s+':');
                Set<String> hash_Set = new HashSet<String>();
                while(true) 
                {
                    String nextLine = in.nextLine();
                    if (nextLine.equals(""))
                        break;
                    hash_Set.add(nextLine);
                }
                translations.put(s,hash_Set);
                System.out.println("Added successfully");
            }
            else
            {
                System.out.print("Thank you!");
                break;
            }
          }
        }
        in.close(); 
    } 
} 
/*
Please enter your word:
GoodMorning
Sorry!Word does not exists in our dictionary.Would you like to add its translations(Y/N)?Y
Please add translations of GoodMorning:
Shubhodaya
Shubhohday
Bonjour

Added successfully
Please enter your word:
GoodEvening
Sorry!Word does not exists in our dictionary.Would you like to add its translations(Y/N)?Y
Please add translations of GoodEvening:
Shubha sange
susandhya
Bonsoir

Added successfully
Please enter your word:
GoodMorning
translations:
Shubhohday
Shubhodaya
Bonjour
*/