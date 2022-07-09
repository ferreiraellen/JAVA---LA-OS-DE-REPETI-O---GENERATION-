package exerjava;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade, idadeMaior, idadeMenor;
		idade=0;
		idadeMaior=0;
		idadeMenor=0;
		
		System.out.println("\nDigite sua idade:");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("\nDigite sua idade");
			idade = leia.nextInt();
			if(idade < 21);
			{
				idadeMenor++;
			}
			if(idade>50);
			{
				idadeMaior++;
			}
	}
	
       System.out.println("\nA idade -21 foi de:" + idadeMenor + "\nA idade +50 foi de:" + idadeMaior);
}

}