package Desafios;

import java.util.Scanner;

public class EscolherConvers�o {
	
	public static void main(String[] args) {
		
		//F = C * 1.8 + 32;
		//K = C + 273.15;
		//Re = C * 0.8;
		//Ra = C * 1.8 + 32 + 459.67
		
		double k;
		double f;
		double re;
		double ra;
		String resposta = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Graus Celsius: ");
		double c = entrada.nextDouble();
		
		f = (c * 1.8) + 32;
		k = c + 273.15;
		re = c * 0.8;
		ra = (c * 1.8) + 32 + 459.67;
		
		System.out.println("\n\nFahrenheit\n"
				+ "Kelvin\n"
				+ "Rankine\n"
				+ "R�aumur\n"
				+ "Escolha sua convers�o: ");
		resposta = entrada.next();
		
		if(resposta.equalsIgnoreCase("fahrenheit")) {
			System.out.printf("Convertendo para Fahrenheit...: %.2f F�" , f);
			
		}else if(resposta.equalsIgnoreCase("kelvin")) {
			System.out.printf("Convertendo para Kelvin...: %.2f K�" , k);
			
		}else if(resposta.equalsIgnoreCase("rankine")) {
			System.out.printf("Convertendo para Rankine...: %.2f Ra�" , ra);
			
		}else if(resposta.equalsIgnoreCase("r�aumur")) {
			System.out.printf("Convertendo para R�aumur...: %.2f Re�" , re);
			
		} else {
			System.out.println("Convers�o inv�lida...");
		}
				 
		
		

		entrada.close();
		
	}

}
