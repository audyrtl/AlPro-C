import java.util.Scanner;

public class TestClass5026211103 {
	public static void main(String[] args) {
		
		ComputeMethods5026211103 comp = new ComputeMethods5026211103();
			Scanner sc = new Scanner(System.in);

			System.out.println( );
			System.out.println("Convert Fahrenheit to Celcius.");
			System.out.print("Temperature in Fahrenheit = ");
			double degreesF = sc.nextDouble();
			System.out.println( );

			System.out.println("Find the Hypotenuse.");
			System.out.print(" a = ");
			int a = sc.nextInt();
			System.out.print(" b = ");
			int b = sc.nextInt();
			System.out.println( );

			System.out.println("The dice is rolling...");
			System.out.println( );

			System.out.println("Temp in celsius is " +comp.fToC(degreesF));
			System.out.println("Hypotenuse is " +comp.hypotenuse(a, b));
			System.out.println("The sum of the dice values is " +comp.roll());

	}

}
