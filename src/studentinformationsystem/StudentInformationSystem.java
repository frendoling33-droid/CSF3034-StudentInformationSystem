package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        String studentName = "Frendoling";
        String studentID = "S88617";
        
        int mark1 = 45;
        int mark2 = 42;
        int total = mark1 + mark2;
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Total Mark: " + total);
        
        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 60) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}