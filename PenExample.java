package Abstract;

abstract class Pen{
	Pen(){
		System.out.println("This is Class Pen.");
	}
	abstract void Write();
	abstract void Refill();
	
}

class FountainPen extends Pen{
	void Write(){
		System.out.println("Fountain Pen Writes.");
	}
	
	void Refill(){
		System.out.println("Refill the Fountain Pen");
	}
	
	void changeNib(){
		System.out.println("Its time to change the nib.");
	}
}

public class PenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen s=new FountainPen();
		s.Write();
		s.Refill();
		s.changeNib();
		
	}

}
