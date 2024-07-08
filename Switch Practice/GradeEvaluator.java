import java.util.Scanner;

public class GradeEvaluator {
  public static void main(String[] args) {
    GradeEvaluator gradeEvaluator = new GradeEvaluator();
    gradeEvaluator.input();
    gradeEvaluator.correspondingGrade();
  }
  char Grade;
  public void input(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter Your Grade :");
      Grade = scanner.next().charAt(0);
  }
  public void correspondingGrade(){
      switch (Grade) {
          case 'A':
              System.out.println("Excellent");
              break;
          case 'B':
              System.out.println("Very Good");
              break;
          case 'C':
              System.out.println("Good");
              break;
          case 'D':
              System.out.println("Average");
              break;
          case 'E':
              System.out.println("Need to Improve");
              break;
          case 'F':
              System.out.println("Fail");
              break;
          default:
              System.out.println("Invalid Input");
      }
  }
}
