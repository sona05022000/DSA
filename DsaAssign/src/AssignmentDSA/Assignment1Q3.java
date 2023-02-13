package AssignmentDSA;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double simpleInterest = (principalAmount*time*interestRate)/100;
        return simpleInterest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double compoundInterest = principalAmount*Math.pow((1+interestRate),time)-principalAmount;
        return compoundInterest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        SiCi obj = new SiCi();
        double simpleInterest = obj.simpleInterest(1000,2,5);
        double compoundInterest = obj.compoundInterest(1000,2,5);
        System.out.println("Simple Interest = "+simpleInterest);
        System.out.println("Compound Interest = "+compoundInterest);
    }
}