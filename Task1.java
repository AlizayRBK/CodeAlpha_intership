import java.util.Scanner;

public class StudentGradeTracker {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of Total  students: ");
        int numStudents = scanner.nextInt();
        
       
        int[] grades = new int[numStudents];
        
        
        System.out.println("Enter the grades for each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade  for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        
        
        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];
        
        for (int i = 0; i < numStudents; i++) {
            sum += grades[i];
            
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        
        
        double average = (double) sum / numStudents;
        
        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        // Close the scanner
        scanner.close();
    }
}
