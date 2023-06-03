package app;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Java application that increment decrement");
		System.out.println("From 0 to 5 and 5 to 0");
		
		int count = 0;
		
		while (count < 5){
			System.out.println("Count : " + count);
			count++;
		}
		
		while (count >= 0){
			System.out.println("Count : " + count);
			count--;
		}
	}
}
