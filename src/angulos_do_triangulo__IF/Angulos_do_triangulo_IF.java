package angulos_do_triangulo__IF;

import java.util.Scanner;

public class Angulos_do_triangulo_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double angulo;
		
		System.out.println("Digite o valor do ângulo do triângulo:");
		angulo = input.nextDouble();
		
		if (angulo < 90) {
			System.out.println("Triângulo Acutângulo");
		}else if (angulo > 90) {
			System.out.println("Triângulo Obtusângulo");
		}else {
			System.out.println("Triângulo Retângulo");
		}
	}

}
