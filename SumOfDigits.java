class SumOfDigits{
	public static void main(String args[]){
		int num = 574; 
		int lastDigit= num%10;
		int newNum = num/10;
		int secondDigit = newNum%10;
		int firstDigit =newNum/10; 
		int answer = firstDigit+secondDigit+lastDigit;
		System.out.println("sum is " +answer);
	} 

}