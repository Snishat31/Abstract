package Abstract;

abstract class MNC {
	MNC(){
		System.out.println("MNC is object is created.");
	}
	void welcomeNote(){
		System.out.println("Welcome to MNC");
	}
	
	abstract void changeCompany();
	abstract void increment();
}


abstract class Infosys extends MNC{
	abstract void changeCompany();
	
	void increment(){
		System.out.println("Increment at infosys is initiated.");
	}
}

class Hello extends Infosys{
	void greetings(){
		System.out.println("This is Hello Class");
	}
	
	void changeCompany(){
		System.out.println("You are allowed to change the company");
	}
}


public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*MNC a=new Hello();
		
		a.welcomeNote();
		a.increment();
		a.changeCompany();*/
		
		Hello h=new Hello();
		h.greetings(); 
		h.welcomeNote();
		h.increment();
		h.changeCompany();
		

	}

}
