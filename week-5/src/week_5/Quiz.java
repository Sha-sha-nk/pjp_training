package week_5;

import java.math.*;
import java.lang.*;
import java.util.*;
import java.io.*;
public class Quiz
{
    private ArrayList<Question> myQuestions;

    public Quiz() {
        this.myQuestions = new ArrayList<Question>();
    }

    public  ArrayList<Question> addQuestions()
    {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numberOfQuestions=2;
        for(int i=1;i<=numberOfQuestions;i++)
        {
            System.out.print("Please enter Question"+i+": ");
            String s=in.nextLine();
            Question q=new Question(s);
            System.out.println("Please add options:");
            String[] a = new String[4];
            for(int j=1;j<=4;j++)
            {
                System.out.print("option"+j+" :");
                a[j-1]=in.nextLine();
            }
            System.out.print("Please enter correct options:");
            int response = in.nextInt();
            in.nextLine();
            q.addOptionsAndAnswer(a[0],a[1],a[2],a[3],response);
            myQuestions.add(q);
        }
        in.close();
        return myQuestions;
    }
}
