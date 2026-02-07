
import java.util.Scanner;

//submitted answers are specifies as program arguments. Let X represents a question that was not answered on the quiz.
//Use an enum type to represent the result of answering a question. 
//The program calculates and prints a report along the following lines:
enum Result {
    CORRECT,
    WRONG,
    UNANSWERED
}

public class quiz {

    public static void main(String[] args) {
        final int size = 8;
        Scanner s = new Scanner(System.in);
        char[] correct = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
        char[] answers = new char[8];
        int Correct = 0, Wrong = 0;
        int NotAnswered = 0;
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ": ");
            char ans = s.nextLine().toUpperCase().charAt(0);
            if (ans == 'X') {
                answers[i] = 'X';
                NotAnswered++;
            } else if (ans >= 'A' && ans <= 'D') {
                answers[i] = ans;
                if (correct[i] == ans) {
                    Correct++;
                } else {
                    Wrong++;
                }
            } else {
                answers[i] = 'X';
                NotAnswered++;
            }
        }
        display(answers,correct);
        System.out.println("No. of correct answers: " + Correct);
        System.out.println("No. of wrong answers: " + Wrong);
        System.out.println("No. of questions unanswered: " + NotAnswered);
        if (Correct >= 5) {
            System.out.println("RESULT: PASS");
        } else {
            System.out.println("RESULT: FAIL");
        }
        s.close();
    }

    public static void display(char[] answers, char[] correct) {
        Result r;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 'X') {
                r = Result.UNANSWERED;
            } else {
                if (correct[i] == answers[i]) {
                    r = Result.CORRECT;
                } else {
                    r = Result.WRONG;
                }
            }
            System.out.printf("%-9d %-10c %-8c %-10s%n", (i + 1), answers[i], correct[i], r);
        }
    }
}
