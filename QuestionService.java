import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is the size of int in Java?", 
                                    "2 bytes", "4 bytes", "8 bytes", "16 bytes", 
                                    "4 bytes");
        
        questions[1] = new Question(2, "Which keyword is used to inherit a class in Java?", 
                                    "this", "super", "extends", "implements", 
                                    "extends");
        
        questions[2] = new Question(3, "Which of the following is not a primitive type in Java?", 
                                    "int", "String", "boolean", "float", 
                                    "String");
        
        questions[3] = new Question(4, "What is the default value of a boolean variable?", 
                                    "true", "false", "null", "0", 
                                    "false");
        
        questions[4] = new Question(5, "Which method is used to start a thread in Java?", 
                                    "init()", "start()", "run()", "execute()", 
                                    "start()");
    }


    public void displayAllQuestions() {
        for (Question question : questions) {
            question.toString();
            System.out.println();
        }
    }
    

    public void playQuiz(){
        int i = 0;

        for(Question q: questions){
            System.out.println("Question No. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
    }

    public void printScore(){
        int score = 0;
        int i = 0;

        for(Question q: questions){
            String answer = q.getAnswer();
            String userAns = selection[i];
            if(userAns.equals(answer)){
                score++;
            }
            i++;
        }
        System.out.println("YOur final score is: " + score);
    }
}
