import java.util.Scanner;
public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp = new Scanner (System.in);

		System.out.println("Ingrese un numero");
		int num1 = sp.nextInt();
		
		if (num1>=0){
			System.out.println("El numero ingresado es positivo");
		}
		else {
			System.out.println("El numero ingresado es negativo");
		}
	}

}
