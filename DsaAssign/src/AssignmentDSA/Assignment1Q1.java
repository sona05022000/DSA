package AssignmentDSA;
import java.util.Scanner;
import java.lang.*;
 class ArmstrongOrnot {
	public static boolean armstrongCheck(int input) {
		String str = input +"";
		int size = str.length();
		int in = input;
		int sum = 0;
		while (in != 0) {
			int lastDigit = in % 10;
			sum = sum + (int) Math.pow(lastDigit,size);
			in = in / 10;
		}
		if (sum == input) {
			return true;
		} 
		else {
			return false;
		}
	}}
	public class Assignment1Q1 extends  ArmstrongOrnot  {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inputNumber = in.nextInt();
		boolean result = armstrongCheck(inputNumber);
		if (result) {
			System.out.println(inputNumber + " is an Armstrong number");
		} 
		else {
			System.out.println(inputNumber + " is not an Armstrong number");
		}
	}}
