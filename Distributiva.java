package lista03;

import java.util.Scanner;

public class L03A_Distributiva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor");
		int vA = sc.nextInt();
		
		System.out.println("segundo valor: ");
		int vB = sc.nextInt();
		
		System.out.println("terceio valor: ");
		int vC = sc.nextInt();
		
		System.out.println("quarto valor: ");
		int vD = sc.nextInt();
		
		int somaA = vA+vB+vC+vD;
		
		int somaB = vB+vC+vD;
		
		int somaC = vC+vD;
		
		int multiA = vA*vB*vC*vD;
		
		int multiB = vB*vC*vD;
		
		int multiC = vC*vD;
		
		System.out.println("Somas A "+somaA);
		
		System.out.println("Somas B "+somaB);
		
		System.out.println("Somas C "+somaC);
		

		System.out.println("Produtos de A "+multiA);
		
		System.out.println("Produtos de B "+multiB);
		
		System.out.println("Produtos de C"+multiC);
		
		sc.close();
	}

}
