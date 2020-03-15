package com.example.android.ootsuk;

public class Question_Library {

    private String mQuestions[][]={
            {"I love challenges and oppurtunities to learn and explore more","J"},
            {"I seek out situations where i will have to think in depth about something","J"},
            {"I am very much interested to explore unknown topics","J"},
            {"I find it fascinating to learn new information.","J"},
            {"Thinking about solutions to difficult problems can keep me awake.","D"},
            {"I can spend hours on a single problem because I just can't rest without knowing the answer.","D"},
            {"I feel disappointed if I can't figure out the solution to a problem, so I work even harder to solve it.","D"},
            {"I work non-stop at problems that I feel must be solved.","D"},
            {"The smallest doubt can stop me from seeking out new experiences.","S"},
            {"I cannot handle the stress that comes from entering unknown situations.","S"},
            {" I find it hard to explore new places when I lack confidence in my abilities.", "S"},
            {"It is difficult to focus when there is a possibility that I will be taken by surprise.","S"},
            {"It excites me to do things with uncertain outcomes.","T"},
            {"When I have free time, I want to experience things that I am afraid of.","T"},
            {"I usually like unplanned adventures more than planned adventures.","T"},
            {"I prefer unpredictable friends","T"},
            {"I ask a lot of questions to figure out what interests other people.","C"},
            {"'When talking to someone, I try to discover interesting details about them.","C"},
            {"I like finding out why people behave the way they do.","C"},
            {"I seek out information about the private lives of people in my life.","C"}




    };
    private String mChoice[][]={
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"},
            {"Does not describe me at all","Somewhat describes me","Neutral",
                    "Mostly describes me","Completely describes me"}

    };

    //private String mCorrectAnswers[]={"Neutral","Neutral","Neutral","Neutral","Neutral","Neutral","Neutral","Neutral","Neutral","Neutral"};



    public String getQuestion(int a) {
        String question = mQuestions[a][0];
        return question;
    }
    public String getType(int a) {
        String question = mQuestions[a][1];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoice[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoice[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoice[a][3];
        return choice3;
    }
    public String getChoice5(int a) {
        String choice4 = mChoice[a][4];
        return choice4;
    }

   /* public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }*/


}
