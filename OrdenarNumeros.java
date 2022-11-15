import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp = new Scanner (System.in);

		System.out.println("Ingrese su primer número");
		int num1 = sp.nextInt();

		System.out.println("Ingrese su segundo número");
		int num2 = sp.nextInt();
		
		if (num1==num2){
			System.out.println("Los numeros ingresados son iguales");
		}
		else if (num1>num2) {
			
			System.out.println("El ordenamiento es: " +num1 +" y " +num2);
		}
		else{
			System.out.println("El ordenamiento es: " +num2 +" y " +num1);
		}
	}
	

}
