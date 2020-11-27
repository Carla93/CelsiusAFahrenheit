import java.util.Scanner;

public class CentigradosAFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c, f;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad en ºC:");
		c = sc.nextDouble();

		f = 32 + (9 * c / 5);
		
		System.out.println("La cantidad equivale a: " + f + "F");
		
		sc.close();
	}

}
