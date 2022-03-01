import java.util.Random;

public class ComputeMethods5026211103 {

	//Temperature
	public double fToC(double degreesF) {
		return(5.0/9*(degreesF-32));
	}

	//Hypotenuse
	public double hypotenuse(int a, int b) {
		return(Math.sqrt(a*a+b*b));
	}

	//Dice
	public int roll() {
		Random rndm = new Random();
			int Roll1 = rndm.nextInt(6)+1;
			int Roll2 = rndm.nextInt(6)+1;
		return(Roll1+Roll2);
	}

}
