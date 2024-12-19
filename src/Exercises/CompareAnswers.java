package Exercises;

public class CompareAnswers {
    public static void main(String[] args){
        char[] answers = {'D','B','D','C','C','D','A','E','A','D'};
        char[][] studAns = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'},
        };

        int[] marks = new int[8];
        
        compareAns(answers, studAns, marks);

        printmarks(marks);

    }

    public static void compareAns(char[] answers, char[][] studAns, int[] marks){
        for(int i = 0;i<studAns.length;i++){
            for(int j = 0;j<studAns[i].length;j++){
                if(studAns[i][j] == answers[j]){
                    marks[i]++;
                }
            }
        }
    }

    public static void printmarks(int[] marks){
        for(int i = 0;i<marks.length;i++){
            System.out.println("Student "+i+" got "+marks[i]+" marks");
        }
    }
}
