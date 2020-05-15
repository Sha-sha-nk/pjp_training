package week_5;

import java.util.ArrayList;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws InterruptedException
    {
        Quiz qz=new Quiz();
        ArrayList<Question> quizQuestions =qz.addQuestions();
        Thread.sleep(1000);
        System.out.println("Lets start the quiz:");
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        for(Question q: quizQuestions)
        {
            System.out.println("Q::"+q.showQuestion()+": ");
            Thread.sleep(1000);
            System.out.println("Options:");
            q.showOptions();
            System.out.println("Please Enter your answer:");
            int response = Integer.parseInt(in.nextLine());
            if (q.isRightAns(response))
                System.out.println("Correct!!!");
            else
                System.out.println("Wrong Answer!!!");
        }
        in.close();
    }
}
