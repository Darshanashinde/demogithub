package practice_program;

public class Animal {

	public static void main(String[] args) {

		Animal dog=new Animal();
		
		dog.eat();
		dog.run();
		
		Animal cat=new Animal();
		cat.run();
		
	}

	public void eat() {
		
		System.out.println("the dog is eating");
	}
	
	 void run() {
		 
		 System.out.println("animal is running");
	 }
	
}
