
package StudentPackage;

import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMain {
    
    public static void main(String[] args){
        Student student1;
        Student student2;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter test case number: ");
            int number = scan.nextInt();
            
            switch (number) {
                
                case 1:
                    System.out.println("Test Case 1: Student under 18");
                    student1 = new Student("Jemar Jude", "Maranga", 17);
                    System.out.println(student1);
                    break;
               case 2:
                    System.out.println("Test Case 2: Increase age of student1");
                    student1 = new Student("Jemar Jude", "Maranga", 17);
                    student1.increaseAge();
                    System.out.println(student1);
                    break;
                case 3:
                    System.out.println("Test Case 3: Student over 18");
                    student2 = new Student("Jose", "Cruz", 19);
                    System.out.println(student2);
                    break;
                default:
                    System.out.println(number + " is an invalid number");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. You can only enter a number from 1-3");

        }
        scan.close();
    }
}
