import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       int studentAge = 28;
       double studentGPA = 3.45;
       String studentFirstName = "Zainab";
       String studentLastName = "Omar";
       char studentFirstInitial = studentFirstName.charAt(0);
       char studentLastInitial = studentLastName.charAt(0);
       boolean hasPerfectAttendance = true;

       System.out.println(studentAge);
       System.out.println(studentFirstInitial);
       System.out.println(studentLastInitial);
       System.out.println(studentGPA);
       System.out.println(hasPerfectAttendance);

//       System.out.println(studentFirstName);
//       System.out.println(studentLastName);

       System.out.println(studentFirstName + " " + studentLastName + " has GPA of " + studentGPA);
       System.out.println("What do you want to update it to?");

//       to get data from user we use scanner .
       Scanner input = new Scanner(System.in);
       studentGPA = input.nextDouble();
       System.out.println(studentFirstName + " " + studentLastName + " has GPA of " + studentGPA);
   }
}
