package lista03;

import java.util.Scanner;

public class L03I_SalarioNovo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu sal�rio: ");
		
		float salario = sc.nextFloat();
		
		System.out.println("Informe o reajuste ");
		
		int reajuste = sc.nextInt();
		
		float novoSalario = salario+(salario/reajuste);
		
		System.out.println("Seu novo sal�rio ser�: "+novoSalario);
		sc.close();
	}

}
