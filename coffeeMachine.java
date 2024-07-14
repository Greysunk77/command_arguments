import java.util.Scanner;

public class coffeeMachine{
	public static void main(String []args){
		System.out.println("Hello Lets make Coffee!");
			//object for the Scanner class
		Scanner coffee = new Scanner(System.in);
		//int blackCoffee = 1;
		System.out.println("Press 1 for Black Coffee");
		int blackCoffee = coffee.nextInt();
			//starts to make coffee
		System.out.println("Making Black Coffee");
	}

}