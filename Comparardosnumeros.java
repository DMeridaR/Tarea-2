import java.util.Scanner;
public class Comparardosnumeros {

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
		else {
			System.out.println("Los numeros ingresados no son iguales");
		}
	}

}
