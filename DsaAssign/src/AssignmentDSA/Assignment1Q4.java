package AssignmentDSA;
class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        int passedCount = 0;
        if (subject1Marks > 60) {
            passedCount++;
        }
        if (subject2Marks > 60) {
            passedCount++;
        }
        if (subject3Marks > 60) {
            passedCount++;
        }
        if (passedCount >= 2) {
            return "Passed";
        } else if (passedCount >= 1) {
            return "Promoted";
        } else {
            return "Failed";
        }
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        ResultDeclaration rd = new ResultDeclaration();
        System.out.println(rd.declareResults(10, 10, 10));  // Output: Failed
        System.out.println(rd.declareResults(70, 10, 10));  // Output: Failed
        System.out.println(rd.declareResults(10, 20, 40));  // Output: Passed
        System.out.println(rd.declareResults(10, 30, 40));  // Output: Passed, Promoted
    }
}
