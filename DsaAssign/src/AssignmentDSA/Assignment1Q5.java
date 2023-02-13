package AssignmentDSA;
import java.util.Scanner;

class TaxAmount {
    public double calculateTaxAmount(int ctc) {
        double taxAmount = 0;
        if (ctc <= 180000) {
            taxAmount = 0;
        } else if (ctc <= 300000) {
            taxAmount = (ctc) * 0.1;
        } else if (ctc <= 500000) {
            taxAmount = (ctc ) * 0.2 ;
        } else if (ctc <= 1000000) {
            taxAmount = (ctc) * 0.3 ;
        }
        return taxAmount;
    }
}

public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CTC: ");
        int ctc = sc.nextInt();
        TaxAmount taxAmount = new TaxAmount();
        System.out.println("Tax amount: " + taxAmount.calculateTaxAmount(ctc));
        sc.close();
    }
}
