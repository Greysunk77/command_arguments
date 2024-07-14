public class SumOfDigits1{
	public static void main(String [] args){
		int num = 843;
		int lastDigit = num%10;
		int newNum = num/10;
		int secondDigit= newNum%10;
		int firstDigit = newNum/10;
		int answer = lastDigit+secondDigit+firstDigit;
		System.out.println("Sum is =" + answer);
		
		
		
		
		
		
		
		
	}
}