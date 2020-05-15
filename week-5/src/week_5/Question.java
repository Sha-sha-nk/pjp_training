package week_5;

public class Question {
    private String question;
    private String opt1, opt2, opt3, opt4;
    private int correctOpt;

    public Question(String question) {
        this.question = question;
    }

    public void addOptionsAndAnswer(String opt1,
                                    String opt2,
                                    String opt3,
                                    String opt4,
                                    int correctOpt )
    {
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.correctOpt=correctOpt;
    }

    public String showQuestion()
    {
        return this.question;
    }

    public void showOptions()
    {
        System.out.println("Opt 1: "+opt1);
        System.out.println("Opt 2: "+opt2);
        System.out.println("Opt 3: "+opt3);
        System.out.println("Opt 4: "+opt4);
    }

    public boolean isRightAns(int response)
    {
        if(response==correctOpt)
            return true;
        return false;
    }
}
