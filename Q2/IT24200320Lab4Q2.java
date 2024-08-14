import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks(out of 100): ");
        double exam_marks = input.nextInt();

        if (exam_marks>=0 && exam_marks<=100) {
            System.out.print("Please enter lab submission marks(out of 100): ");
            double lab_mark = input.nextDouble();


            if (lab_mark >= 0 && lab_mark <= 100) {
                System.out.print("Please enter the percentage given for the exam: ");
                double percentage_exam = input.nextDouble();

                System.out.print("Please enter the percentage given for the lab submission: ");
                double percentage_lab = input.nextDouble();

                double final_marks = (exam_marks / 100) * percentage_exam + (lab_mark / 100) * percentage_lab;

                if (percentage_exam + percentage_lab == 100) {
                    System.out.println();
                    System.out.println("Final Exam mark is: " + final_marks);
                } else {

                    System.out.println("The percentages must add up to 100.Terminating program.");
                }
            }
            else {

                System.out.println("Invalid input for lab marks. Terminating program.");
            }

        }
        else
        {

            System.out.println("Invalid input for exam marks. Terminating program.");
        }










    }
}






