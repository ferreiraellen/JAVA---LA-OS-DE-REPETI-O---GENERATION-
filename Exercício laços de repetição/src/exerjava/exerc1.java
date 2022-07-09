package exerjava;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		int n1, soma=0, cont=0;
		do
		{
			System.out.println("\nInforme um número:");
			n1 = leia.nextInt();
			 if(n1%3==0 && n1!=0)
			{
				soma = soma+n1;
				cont++;
			}
		}while(n1!=0);
			
			System.out.println("\nA média dos múltipos de 3 é: " + soma/cont);
			
	}
	
}	
			
		
			
			
				
